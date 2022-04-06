public class LargestNumber {
    public static void main(String[] args) {
        int a = 40, b = 20, c = 30;
        if (a >= b && a >= c) {
            System.out.println(" a is the largest Number with " + a);
        } else if (b >= a && b >= c) {
            System.out.println(" b is the largest Number with " + b);
        } else {
            System.out.println(" c is the largest number with " + c);
        }

    }
}
