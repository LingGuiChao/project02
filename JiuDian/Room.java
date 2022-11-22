package JiuDian;

public class Room implements JiuDian{
    int bh;
    boolean zt;
    String kr;
    public void fjlx(String lx) {
//        酒店的类型
        System.out.println("该房间的类型为"+lx);
    }
    public void fjbh(int bh) {
//        酒店的编号
        this.bh = bh;
        System.out.println("该房间的编号为"+bh);
    }
    public void fjzt(boolean zt) {
//        酒店的状态
        this.zt = zt;
//        将布尔类型'true',赋值给本类中的实例变量zt
        System.out.println("客人的姓名为: "+this.kr);
//        调用本类中的实例变量kr,获取kr姓名
    }
}
