public class Homework02 {
    public static void main(String[] args) {

        String[] strs = {"dicker","jocker","dog"};
        AO2 ao2 = new AO2();//先声明这个方法
        int index = ao2.find("dicker",strs);
        System.out.println(index);//输出
    }
}
class AO2{
    public int find(String findStr,String[] strs) {
        for (int i = 0; i < strs.length; i++) {//找到返回下标
            if (findStr.equals(strs[i])) {
                //findeStr是字符串，可以替换为别的字符串
                return i;
            }
        }
            return -1;//没有找到，返回-1
    }
}
