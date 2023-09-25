public class StudentRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 3.8 , 65);

        student1.introduce();
        student1.printStudentInfo();

        Student student2 = new Student("Jerry", 2.1 , 42);

        student2.introduce();
        student2.printStudentInfo();

    }
}
