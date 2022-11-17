import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        int index0 = input / 100;
        int index3 = input % 10;
        int index1 = (input % 100 - index3) / 10 ;

        System.out.println(index3+index0+index1);
    }
}