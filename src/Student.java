public class Student {
    private String name;
    private double gpa;
    private double height;

    public Student(String studentName, double studentGpa, double studentHeight) {
        name = studentName;
        gpa = studentGpa;
        height = studentHeight;

    }
    public void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }
    public void printStudentInfo() {
        System.out.println("Name: " + name + "\nGPA: " + gpa + "\nHeight(inches): " + height);
    }
}
