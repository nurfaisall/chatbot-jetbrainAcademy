import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int duration = scanner.nextInt();
        int totalFood = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();

        int result = (hotelCost * (duration - 1)) + (duration * totalFood) + flightCost * 2;
        System.out.println(result);
    }
}