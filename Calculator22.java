public class Calculator22 {
public int add(int a, int b) {
return a + b;
}
public int subtract(int a, int b) {
return a - b;
}
public static void main(String[] args) {
    System.out.println("salam alikm");
Calculator calc = new Calculator();
System.out.println("5 + 3 = " + calc.add(5, 3));
System.out.println("10 - 4 = " + calc.subtract(10, 4));
}
}
