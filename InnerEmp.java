class OuterEmp {

    int age = 21;
    String name = "Akash Athawale";
    int ID = 101;
    String companyName = " COETA pvt lmd , Akola";

    public void showDetails() {
        System.out.println("iN show");
    }

    // class InnerEmp {
    // public void config() {
    // System.out.println("IN CONFIG..." );
    // }
    // }
}

public class InnerEmp {

    public static void main(String[] args) {

        OuterEmp obj = new OuterEmp() {
            public void showDetails() {
                System.out.println("Show Details ... ");
                System.out.println("Age : " + age);
                System.out.println("Name : " + name);
                System.out.println("ID : " + ID);
                System.out.println("Company name  : " + companyName);
            }

        };
        obj.showDetails();

    }
}