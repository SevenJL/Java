public class Constructor {
    public static void main(String[] args) {

        Person p1 =new Person();//�޲ι�����

        System.out.println("name =" + p1.name + "age = " +p1.age);
        //���NULL��18
        Person p2 = new Person("scott" ,50);

        System.out.println("name ="+ p2.name + "age =" + p2.age);
        //���scott��50
    }
}

class Person{
    String name;//Ĭ��ΪNULL
    int age;//Ĭ��Ϊ0
    //��һ�����������������˵���������Ϊ18
    public Person(){
        age =18;
    }
    //�ڶ�����������pName��pAge
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
