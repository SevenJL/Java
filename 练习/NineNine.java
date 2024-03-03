public class NineNine {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();

        }
//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
//            }
//            System.out.println();
//        }
//    }
    }
}


