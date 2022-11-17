import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input1,input3,input2;

        input1 = scanner.nextLine();
        input2 = scanner.nextLine();
        input3 = scanner.nextLine();

        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks %s dishes and has %s years of experience.",input1,input3,input2);
    }
}