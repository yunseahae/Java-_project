package HomeworkStudent_Basic;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Yunseahae", "20240514", 3, "Mechanical Engineering");
        Student student2 = new Student("KimSungJin", "20240513", 1, "Mechanical Engineering");

        System.out.println("Total number of students: " + Student.getCount());

        student1.printInfo();
        student2.printInfo();
    }
}
