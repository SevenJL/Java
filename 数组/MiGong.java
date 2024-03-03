public class MiGong {
    public static void main(String[] args) {

        //创建一个二维数组
        int [][] map = new int [8][7];
        //将迷宫四周全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //迷宫中间俩个障碍物
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;

        //输出地图模样
        System.out.println("================");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(" "+ map[i][j]);
            }
            //换行
            System.out.println();
        }

         T t1 =new T();
        t1.findWay(map,1,1);
        System.out.println("====================");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(" "+map[i][j]);
            }
            //换行
            System.out.println("\t");
        }

    }
}

//写一个类

class T {
    //使用递回溯的思想来解决问题
    //1.findWay方法用来专门找出迷宫的路径
    //2.使用boolean类型来找，如果找得到就返回true，否则返回false
    //3.map是二维数组，用来表示迷宫
    //4.i,j就是坐标，来表示老鼠的位置，初始化的位置为(1,1)
    //5.因为是递归的找路，所以应该定义数组的各个值的含义
    //0表示可以走的路 1,表示障碍物 2表示可以走 3表示走过，但是是死路，走不通
    //6.当map[6][5] = 2说明找得到通路，否则就可以继续找
    //7.确定老鼠找路的策略，下  右  上  左

    public boolean findWay(int[][] map, int i, int j) {

        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {//说明表示可以走
                //我们这时假定可以走
                map[i][j] = 2;//2是表示可以走，假定的走，是还可返回的，3表示走过来，不能回头了}
                if (findWay(map, i + 1, j)) {//走下面
                    return true;
                } else if (findWay(map, i, j + 1)) {//走右面
                    return true;
                } else if (findWay(map, i - 1, j)) {//走上面
                    return true;
                } else if (findWay(map, i, j - 1)) {//走左边
                    return true;
                } else {
                    map[i][j] = 3;//表示走过了 走不通
                    return false;
                    //返回是false，就回到原来位置，开始执行下一个else-if语句，也就是走右边
                }

            } else {//
                return false;
            }
        }
    }
}