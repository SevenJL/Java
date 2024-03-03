package HomeWork02;

public class Teacher {
        private String name;
        private int age;
        private String post;
        private double salary;


        public Teacher(String name, int age, String post, double salary) {
            this.name = name;
            this.age = age;
            this.post = post;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", post='" + post + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPost() {
            return post;
        }

        public void setPost(String post) {
            this.post = post;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public void introduce(){
            System.out.println("该老师姓名为"+getName()+" 年龄为"+getAge()+
                    " 职称为"+getPost()+" 基本工资为"+getSalary());

        }
}
