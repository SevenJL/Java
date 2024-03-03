import java.util.Scanner;
//计算三个班中各5个学生的总分和平均分数
public class MulFoxExercise01 {
    public static void main(String[] args) {

        System.out.println("five nums");
        Scanner ClassScanner = new Scanner(System.in);
        //创建scanner变量

        int i, j;
        int count  =0 ;
        double score;
        double totalScores = 0.0;
        //i是第几个班，通过for循环来接受输入的值
        for (i = 1; i <= 3; i++) {
            //j是第几个人
            System.out.println("第"+i+"班");
            double sum = 0.0;

            for (j = 1; j <= 5; j++) {
                System.out.println(j  + "nums");
                score = ClassScanner.nextInt();

                if (score >= 60)
                    //有一个人及格就++
                    count++;
                sum += score;
            }
            System.out.println("avaerage scores" + (sum / 5) + "total scores" + sum);
            //计算三个班的总分
            totalScores+=sum;

            //输入数值
            System.out.println("总分是"+ totalScores + " "+ "平均分是"+ (totalScores/ (3*5)));
           //输出及格人数
            System.out.println("有"+count+"个人及格");
        }
    }
}
