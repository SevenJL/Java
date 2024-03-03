public class Enumexecise01 {
    enum Week{
        MONDAY("1"),
        TUESDAY("2"),
        WEDNESDAY("3"),
        THURSDAY("4"),
        FRIDAY("5"),
        SATURDAY("6"),
        SUNDAY("7");
        @SuppressWarnings("")
        private String name;


        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "name='" + name;
        }

        private Week(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        for (Week week : Week.values()) {
            System.out.println(week);
        }

    }
}
