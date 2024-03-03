public class VarParameterExercise {
    public static void main(String[] args) {

    }
}

class Method{

    public String showScore(String name,double...scores){
        double totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        return name + "total score =" + totalScore;

    }
}