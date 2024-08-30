class A {

    int age1 = 21;

    public void show() {
        System.out.println("iN show");
    }

    class B {
        int age2 = 22;

        public void config() {
            System.out.println("IN CONFIG...");
        }
    }
}

public class InnerDemo {

    public static void main(String[] args) {

        A.B obj = new A().new B() {
            public void config() {
                System.out.print("In new config : " + age2);
            }

        };
        obj.config();

        // A classA = new A();
        // A.B classB = classA.new B();

        // System.out.println(classB.age2 + classA.age1);

    }
}