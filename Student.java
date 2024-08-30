class Student {

    String name;
    int roll_no;
    int id;
    static String college_name; // static variable
    String city;

    public Student() {
        System.out.println("This is simple constructor");
    }

    public Student(String n, int rn, int i, String c) { // constructor parameterise

        name = n;
        roll_no = rn;
        id = i;
        city = c;
    }

    public static void show(String college_name) { // static method

        System.out.println(college_name);
    }

    static { // static block
        college_name = "COETA";
        System.out.println("in stactic block");
    }

    public void display() {

        System.out.println(name + " " + roll_no + " " + id + " " + city);
    }

    public class Main {

        public static void main(String[] args) {

            Student std = new Student("Akash", 7, 310, "Akola");
            std.display();

            Student std1 = new Student();
            std1.name = "Aman";
            std1.roll_no = 9;
            std1.id = 311;
            std1.city = "Pune";
            std1.display();
            Student.show("COEP");

            Student std2 = new Student();
            std2.name = "Sanam";
            std2.roll_no = 10;
            std2.id = 312;
            std2.city = "Satara";
            std2.display();

            Student std3 = new Student();
            std3.name = "Shraddha";
            std3.roll_no = 11;
            std3.id = 313;
            std3.city = "Sangli";
            std3.display();

            Student std4 = new Student();
            std4.name = "Anushka";
            std4.roll_no = 12;
            std4.id = 314;
            std4.city = "nashik";
            std4.display();

            Student std5 = new Student();
            std5.name = "Salman";
            std5.roll_no = 13;
            std5.id = 315;
            std5.city = "Amravati";
            std5.display();

        }

    }
}