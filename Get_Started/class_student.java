//class student
class Student {
    // abstribute
    public String name;

    // menthod
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class class_student {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = " thanh tho";
        System.out.println(std1.getName());
    }
}