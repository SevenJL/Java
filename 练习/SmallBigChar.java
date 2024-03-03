public class SmallBigChar {
    public static void main(String[] args){
        char c1 = 'a';
        for (;c1 >= 'a' && c1 <= 'z';c1++ ) {
            System.out.print(c1+" ");
        }
        char c2 = 'Z';
        for (;c2 <='Z' &&  c2 >= 'A'; c2--) {
            System.out.print(c2+" ");
        }
            //((i%2)-0.5)*2就直接能做出±1
    }

}
