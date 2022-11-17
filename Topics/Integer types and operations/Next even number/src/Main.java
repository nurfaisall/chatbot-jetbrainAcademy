import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();

        int add = input % 2;
        int result = ((input + 2) / 2) * 2;
        System.out.print(result);
    }
}
