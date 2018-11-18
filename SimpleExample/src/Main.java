import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int starCount, gugudanCount;
        Scanner scan = new Scanner(System.in);

        System.out.print("please insert stars count : ");
        starCount = scan.nextInt();

        PrintStar pr = new PrintStar(starCount);
        pr.printStar();

        System.out.print("please insert dan : ");
        gugudanCount = scan.nextInt();

        Gugudan gugu = new Gugudan(gugudanCount);
        gugu.printGugudan();
    }
}
