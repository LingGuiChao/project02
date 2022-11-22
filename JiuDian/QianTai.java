package JiuDian;

import java.util.Scanner;

public class QianTai {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
//                    创建键盘扫描器对象
        System.out.println("欢迎使用酒店管理系统");
        System.out.print("您的用户名为为 ");
//                    酒店前台用户名
        String name = s.next();
        System.out.print("密码为 ");
//                    用户登录密码
        String mima = s.next();
        if(!(name.equals("梁贵超") & mima.equals("200145"))){
//                    如果密码错误
            System.out.println("对不起,您输入的用户名及密码有误!");
            System.exit(1);
        }
        JiuDian[][] room = new Room[3][8];
//                    创建数组,相当于酒店的房间
        YongHu yh = new YongHu();
        System.out.println("本酒店共有三层,每层八个房间");
//                    创建YongHu对象
        for(int a = 0 ; ;a++) {
//                    正式开始工作(利用for循环)
            System.out.println("请选择 订房: 按1 退房: 按0 查房: 按2");
            int y = s.nextInt();
//                    输入操作信息
            if(y<0|y>2){
//                    如果操作信息有误
                System.out.println("对不起,您输入的参数有误!");
                continue;
            }
             if(y==2){
//                    如果查房
                yh.cf(room);
                continue;
            }
//                    输入房间信息(利用数组)
                System.out.println("请您输入楼层以及房号 ");
                System.out.print("楼层: ");
                int x = s.nextInt();
                System.out.print("房号: ");
                int i = s.nextInt();
                if((x<1|x>3)|(i<1|i>8)){
//                    如果操作信息有误
                    System.out.println("对不起,您输入的参数有误!");
                    continue;
                }
                i = i - 1;//调整为一维数组下标
                x = x - 1;//调整为二维数组下标
                if(room[x][i] == null & y == 0){
//                    如果该房间为空闲
                    System.out.println("对不起,该房间为空闲 !");
                    continue;
                    }
                else if(room[x][i] != null & y == 0){
                    yh.tf(room,i,x);
//                    开始退房(利用YongHu类的tf方法)

                    continue;
                }
                if (room[x][i] == null) {
//                    开始订房
                        System.out.print("请输入客人姓名: ");
//                    输入客人姓名
                        String kr =s.next();
                    room[x][i] = new Room();
//                    利用for循环创建Room对象,并赋值给JiuDian数组
                    Room room1=(Room)room[x][i];
//                    将JiuDian对象强转为Room类型对象
                    room1.kr = kr;
//                    给JiuDian对象的kr属性赋值
                }
                if (room[x] == room[0]) {
//                    如果房间在一楼
                    int x1 = i + 101;
//                    调整房间编号
                    yh.jd(room, x1, "单人房", i, x);
//                    调用YongHu的jd方法,传入订房信息
                }
                else if (room[x] == room[1]) {
//                    如果房间在二楼
                    int x1 = 201 + i;
//                    调整房间编号
                    yh.jd(room, x1, "大床房", i, x);
//                    调用YongHu的jd方法,传入订房信息
                }
                else if (room[x] == room[2]) {
//                    如果房间在三楼
                    int x1 = 301 + i;
//                    调整房间编号
                    yh.jd(room, x1, "贵宾房", i, x);
//                    调用YongHu的jd方法,传入订房信息

            }

        }
    }
}
