package week7;


public class mein4{
    public static void main(String[] args) {

        Student s1 = new Student("Ram", 20);
        Student s2 = new Student("Sita", 21);

        System.out.println("Student Management System");
        System.out.println("Student 1: " + s1.getName() + ", Age: " + s1.getAge());
        System.out.println("Student 2: " + s2.getName() + ", Age: " + s2.getAge());
    }
}
