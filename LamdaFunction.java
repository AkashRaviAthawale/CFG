@FunctionalInterface
interface A {
    int add(int i, int j);

}

// @FunctionalInterface
interface B {
    int sub(int i, int j);

}

// @FunctionalInterface
interface C {
    int mul(int i, int j);

}

// @FunctionalInterface
interface D {
    int div(int i, int j);

}

public class LamdaFunction {

    public static void main(String[] args) {
        A obj = (i, j) -> (i + j);
        B obj2 = (i, j) -> (i - j);
        C obj3 = (i, j) -> (i * j);
        D obj4 = (i, j) -> (i / j);

        int result = obj.add(2, 3);
        int result2 = obj2.sub(5, 3);
        int result3 = obj3.mul(5, 3);
        int result4 = obj4.div(8, 2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        // A obj = new A() {
        // public int add(int i, int j) {
        // return i + j;
        // }
        // };
        // B obj2 = new B() {
        // public int sub(int i, int j) {
        // return i - j;
        // }
        // };
        // C obj3 = new C() {
        // public int mul(int i, int j) {
        // return i * j;
        // }
        // };
        // D obj4 = new D() {
        // public int div(int i, int j) {
        // return i / j;
        // }
        // };
        // int result = obj.add(15, 3);
        // System.out.println(result);

        // int result2 = obj2.sub(15, 3);
        // System.out.println(result2);

        // int result3 = obj3.mul(15, 3);
        // System.out.println(result3);

        // int result4 = obj4.div(15, 3);
        // System.out.println(result4);
    }
}
