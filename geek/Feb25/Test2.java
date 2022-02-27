package Feb25;

public class Test2 {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String args[]) {
        Test2 test = new Test2();
        test.print(10);
    }
}
//ANS : INT