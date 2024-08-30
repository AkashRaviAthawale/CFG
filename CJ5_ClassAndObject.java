
//Obj and entity create state and behaviour it can be physical and logical entity,
// obj can be define as a instance of a class,obj contence an add and take a some space in memory,
// obj realtime entity,obj is a real world entity known as a obj.
// Three characters of obj state(represent the data),behavior(methods)and identity.

// Class content field,methods,constructor,blocks,nested classes and interfaces.

// class Calculator {

//     public int add(int num1, int num2) {
//         int result = num1 + num2;
//         System.out.println(result);
//         return result;
//     }
// }

// public class CJ5_ClassAndObject {

//     public static void main(String[] args) {
//         Calculator cal = new Calculator(); // reference variable ...
//         cal.add(5, 7);

//     }
// }

//EMPLOYEE 
class Employee {

    int Employee_id;
    int Employee_Salary;
    String Employee_name;
    String Employee_Address;

    void insertData(int emp_id, int emp_sal, String emp_name, String emp_add) {

        Employee_id = emp_id;
        Employee_Salary = emp_sal;
        Employee_name = emp_name;
        Employee_Address = emp_add;

    }

    void showDisplay() {

        System.out.println(Employee_id + " " + Employee_Salary + " " + Employee_name + " " + Employee_Address);
    }
}

public class CJ5_ClassAndObject {

    public static void main(String[] args) {

        Employee ep = new Employee();

        ep.insertData(33, 23541, "Akash", "Behind Gov office akola");

        ep.showDisplay();

    }
}