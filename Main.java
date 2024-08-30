//final class
final class StudentDetails {

    String name;
    final int studId;// final variable
    int rolln;

    public StudentDetails(String name, int studId, int rolln) {

        this.name = name;
        this.studId = studId;
        this.rolln = rolln;

    }

    // final method
    final void display() {

        System.out.println("Student Name : " + name);
        System.out.println("StudentID : " + studId);
        System.out.println("Student Roll: " + rolln);

    }

}

public class Main {

    public static void main(String[] args) {
        StudentDetails std = new StudentDetails("Akash", 103, 11);
        std.display();
    }

}
