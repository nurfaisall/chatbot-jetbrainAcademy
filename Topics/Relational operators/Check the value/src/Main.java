import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        boolean normal = ( H >= A && H <= B);

        if (normal == true){
            System.out.println("Normal");
        } else if (H < A) {
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");
        }

    }
}