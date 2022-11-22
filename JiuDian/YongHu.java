package JiuDian;

public class YongHu {
    boolean zt;//  该属性判断房间是否为空
    public void jd(JiuDian[][] fj1, int bh,String lx,int x,int i){
//                 酒店订房的方法
        Room fj = (Room)fj1[i][x];
//                 将JiuDian对象类强转为Room类型对象
        if(fj.zt){
//                 如果房间为空
            System.out.println("对不起,该房间已有客!");
            System.out.println("客人的姓名为: "+fj.kr);
//                 获取Room类型的kr属性
            return;
        }
        System.out.println("您已成功订房!");
        fj.fjbh(bh);
//                 调用Room类型的fjbh方法
        fj.fjlx(lx);
//                 调用Room类型的fjlx方法
        fj.fjzt(true);
//                 调用Room类型的fjzt方法,并获取布尔类型字面值
    }
        public void tf(JiuDian[][] fj ,int x,int i){
//                 酒店退房的方法
            fj[i][x] = null;
//                 将JiuDian对象赋值为空
            System.out.println("您已成功退房 !");

        }
        public void cf(JiuDian[][] cf ){
//                 酒店查房的方法
            Room[][] cf1 = (Room[][])cf;
//                 将JiuDian类型数组强转为Room类型数组
            int b = 0;
            for(Room[] lc : cf1){
                for (Room fj : lc){
//                 查看房间状态(利用for循环遍历数组)
                    if(fj != null){
                        b++;
                        if(b>24){
//                 如果房间人数已满(利用变量b进行判断)
                            System.out.println("酒店房间已满!");
                            return;
                        }
//                如果房间不是空闲,获取Room对象的bh属性,查看房间编号
                        System.out.println(fj.bh+"号房间有客人");
                    }
                }
            }
            if(b == 0){
//                如果房间都为空闲
                System.out.println("酒店的所有房间都为空闲");
            }
    }

}


