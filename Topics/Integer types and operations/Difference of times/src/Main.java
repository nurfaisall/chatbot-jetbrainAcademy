import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour1,hour2,minute1,minute2,times2,times1;

        hour1 = scanner.nextInt();
        minute1 =  scanner.nextInt();
        times1 = scanner.nextInt();

        hour2 = scanner.nextInt();
        minute2 = scanner.nextInt();
        times2 = scanner.nextInt();

        int result1 = (hour1*3600) + (minute1*60) + times1;
        int result2 = (hour2*3600) + (minute2*60) + times2;

        int result = result1 - result2;
        if (result < 0){
            result = Math.abs(result);
        }
        System.out.println(result);
    }
}