package encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Amit");
        obj.setRollNo(51);
        obj.setAge(19);
        System.out.println("Prime's name : " + obj.getName());
        System.out.println("Prime's age : " + obj.getAge());
        System.out.println("Prime's rollNo : " + obj.getRollNo());

    }
}
