package javawhl.base.operator;

/**
 * @author Administrator 移位运算
 */
public class MoveTest {
	public static void main(String[] args) {
		int a = -3;
		System.out.println(a>>1);
		System.out.println(a>>2);
		System.out.println(a>>3);
		//右移
		System.out.println(a<<1);
		System.out.println(a<<2);
		System.out.println(a<<3);
		//无符号右移
		System.out.println(a>>>1);
		
		byte b=(byte) 8;
		System.out.println(b);
		
	}
}
