import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int kelas1 = (scanner.nextInt() + 1) / 2;
        int kelas2 = (scanner.nextInt() + 1) / 2;
        int kelas3 = (scanner.nextInt() + 1) / 2;

        System.out.println(kelas1+kelas2+kelas3);
    }
}