import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        int firstDigit = input % 10;
        int thirdDigit = input / 100;
        int secondDigit = input % 100 / 10;
        int result = (firstDigit * 100) + (secondDigit * 10) + thirdDigit;

        System.out.println(result);
}}