package HomeWork07;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack",22,"doctor","��",4000);
        Doctor doctor2 = new Doctor("jackr",22,"doctor","��",4000);

        System.out.println(doctor1.equals(doctor2));
    }
}

class Person{
    public void run(){}
    public void ear(){}

}
class Student extends Person{
    public void run(){}
    public void study(){}
}
//����ת�ͣ����������ָ���������
//Person p = new Student();
//��Ϊ����������Person�����Ե��÷���ʱֻ�ܵ��ø���ķ���
//�����ܵ�������ģ����磺p.study();����Ǵ��
//p.run();//�������������࣬��������ʱ�Ǵ����࿪ʼ�ң��������е��������run����
//p.eat();//����û��eat����������̳��˸��࣬����ȥ�Ҹ���ķ�����Ҳ���������Ǹ����eat
//����ת�ͣ���ָ���������ĸ������ã�ת��ָ������������������
//Student s = (Student) p;
//s.run();//�������ͺ��������Ͷ�Ϊ���࣬���Ա���ʱ������������Щ�����͸������Щ����
//s.study();
//s.eat();//person eat // ����û��eat����������ж��Ǹ���ģ�����̳��˸����
