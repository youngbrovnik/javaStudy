import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercise03");
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.println("3의 배수의 합: "+sum);
        System.out.print("\n");

        System.out.println("Exercise04");
        boolean run =true;
        int num1, num2;
        System.out.println("합이 5가 될때까지 반복하여 두개의 주사위 돌리기");
        while (run){
            num1 = (int) (Math.random()*10%6+1);
            num2 = (int) (Math.random()*10%6+1);
            System.out.println(num1+", "+num2);
            if ((num1+num2)==5){
                run = false;
            }
        }
        System.out.print("\n");

        System.out.println("Exercise05");
        System.out.println("4x + 5y = 60의 해 구하기");
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                if (4*i + 5*j == 60){
                    System.out.println(i+", "+j);
                }
            }
        }
        System.out.print("\n");

        System.out.println("Exercise06");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Exercise07");
        run = true;

        int balance;
        int account=0;
        int remittance;

        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔금 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택> ");

            balance = scanner.nextInt();

            switch (balance) {
                case 1:
                    System.out.print("예금액> ");
                    account += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    remittance = scanner.nextInt();
                    if(account<remittance){
                        System.out.println("출금액이 잔고보다 많습니다.");
                        continue;
                    }
                    account -= remittance;
                    break;
                case 3:
                    System.out.println("잔고> "+account);
                    break;
                default:
                    run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
}
