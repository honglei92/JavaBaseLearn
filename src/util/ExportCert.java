package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;

import sun.misc.BASE64Encoder;

/**
 * ����֤��(base64)keystore导出cer文件
 *
 * @author happyqing
 */
public class ExportCert {

    // ����֤�� base64��ʽ
    public static void exportCert(KeyStore keystore, String alias, String exportFile) throws Exception {
        Certificate cert = keystore.getCertificate(alias);
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(cert.getEncoded());
        FileWriter fw = new FileWriter(exportFile);
        fw.write("-----BEGIN CERTIFICATE-----\r\n"); // �Ǳ���
        fw.write(encoded);
        fw.write("\r\n-----END CERTIFICATE-----"); // �Ǳ���
        fw.close();
    }

    // �õ�KeyPair
    public static KeyPair getKeyPair(KeyStore keystore, String alias, char[] password) {
        try {
            Key key = keystore.getKey(alias, password);
            if (key instanceof PrivateKey) {
                Certificate cert = keystore.getCertificate(alias);
                PublicKey publicKey = cert.getPublicKey();
                return new KeyPair(publicKey, (PrivateKey) key);
            }
        } catch (UnrecoverableKeyException e) {
        } catch (NoSuchAlgorithmException e) {
        } catch (KeyStoreException e) {
        }
        return null;
    }

    // ����˽Կ
    public static void exportPrivateKey(PrivateKey privateKey, String exportFile) throws Exception {
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(privateKey.getEncoded());
        FileWriter fw = new FileWriter(exportFile);
        fw.write("���CBEGIN PRIVATE KEY���C\r\n"); // �Ǳ���
        fw.write(encoded);
        fw.write("\r\n���CEND PRIVATE KEY���C"); // �Ǳ���
        fw.close();
    }

    // ������Կ
    public static void exportPublicKey(PublicKey publicKey, String exportFile) throws Exception {
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(publicKey.getEncoded());
        FileWriter fw = new FileWriter(exportFile);
        fw.write("���CBEGIN PUBLIC KEY���C\r\n"); // �Ǳ���
        fw.write(encoded);
        fw.write("\r\n���CEND PUBLIC KEY���C"); // �Ǳ���
        fw.close();
    }

    public static void main(String args[]) throws Exception {

        String keyStoreType = "JKS";
        String keystoreFile = "D:/key/keystore";
        String password = "boco123";

        KeyStore keystore = KeyStore.getInstance(keyStoreType);
        keystore.load(new FileInputStream(new File(keystoreFile)), password.toCharArray());

        String alias = "key";
        String exportCertFile = "D:/key/zhao/cms.cer";
        String exportPrivateFile = "D:/key/zhao/cmsPrivateKey.txt";
        String exportPublicFile = "D:/key/zhao/cmsPublicKey.txt";

        ExportCert.exportCert(keystore, alias, exportCertFile);
        KeyPair keyPair = ExportCert.getKeyPair(keystore, alias, password.toCharArray());
        ExportCert.exportPrivateKey(keyPair.getPrivate(), exportPrivateFile);
        ExportCert.exportPublicKey(keyPair.getPublic(), exportPublicFile);

        System.out.println("OK");
    }
}
