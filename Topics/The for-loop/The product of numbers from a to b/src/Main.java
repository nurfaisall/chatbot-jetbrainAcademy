import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        long input1 = scanner.nextLong();
        long input2 = scanner.nextLong();

        long sum = 1;
        for (; input1 < input2; input1++){
            sum *= input1;
        }
        System.out.println(sum);
    }
}