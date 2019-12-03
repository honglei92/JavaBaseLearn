package designpattern.daili;

public class Songdaili implements Iplayer {
    Baoqiang mBaoqiang;

    Songdaili(Baoqiang baoqiang) {
        this.mBaoqiang = baoqiang;
    }

    @Override
    public void film() {
        System.out.println("宋代理先跟公司谈何合同，预定时间地点");
        mBaoqiang.film();
    }
}