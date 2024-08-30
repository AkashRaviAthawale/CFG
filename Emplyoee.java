
class Emplyoee {

    String name;
    int id;
    int salary;

    public Emplyoee(String n, int i, int sal) {

        this.name = n;
        this.id = i;
        this.salary = sal;
    }

    public void display() {
        System.out.println(name + " " + id + " " + salary);
    }

    public static void main(String[] args) {

        Emplyoee emp = new Emplyoee("Akash", 1, 30000);
        emp.display();

        Emplyoee emp1 = new Emplyoee("Anushka", 2, 35000);
        emp1.display();

        Emplyoee emp2 = new Emplyoee("Salman", 3, 40000);
        emp2.display();

    }
}