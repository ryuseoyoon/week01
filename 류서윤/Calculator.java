public class Calculator {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;
        System.out.println("두 숫자의 합: " + sum);

        int difference = num1 - num2;
        System.out.println("두 숫자의 차: " + difference);

        int product = num1 * num2;
        System.out.println("두 숫자의 곱: " + product);

        int quotient = num1 / num2;
        System.out.println("두 숫자의 나눈 값: " + quotient);
    }
}
