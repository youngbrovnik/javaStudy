import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        if (args.length > 1) {
//            for (int i=0; i<args.length; i++){
//                System.out.println("args = " + args[i]);
//            }
//
//            int num1 = Integer.parseInt(args[0]);
//            int num2 = Integer.parseInt(args[1]);
//            int result = num1 + num2;
//            System.out.println(num1 + " + " + num2 + " = " + result);
//
//        }

//        Week week = Week.MON;
//        switch(week) {
//            case MON:
//                break;
//            default:
//                break;
//        }

        Week today = null;



//        System.out.println(week);

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUN;
                break;
            case 2:
                today = Week.MON;
                break;
            case 3:
                today = Week.TUES;
                break;
            case 4:
                today = Week.WED;
                break;
            case 5:
                today = Week.THUR;
                break;
            case 6:
                today = Week.FRI;
                break;
            case 7:
                today = Week.SAT;
                break;
        }

//        날짜관련 가져오기

        System.out.println("오늘 요일: " + today);

        if(today == Week.SUN) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부합니다.");
        }

        System.out.println(today.name());

//        page 163

        int[][] scores = new int[2][3];
        System.out.println(scores.length);
        System.out.println(scores[0].length);
        System.out.println(scores[1].length);
        System.out.println();

//        page 164

        int[][]  mathScores = new int[2][3];
        for (int i=0; i<mathScores.length; i++) {
            for (int j=0; j<mathScores[i].length; j++) {
                System.out.println("mathScore["+i+"]["+j+"] = "+mathScores[i][j]);
            }
        }
        System.out.println();

        int[][] englishScore = new int[2][];
        englishScore[0] = new int[2];
        englishScore[1] = new int[3];
        for (int i=0; i<englishScore.length; i++) {
            for (int j=0; j<englishScore[i].length; j++) {
                System.out.println("mathScore["+i+"]["+j+"] = "+englishScore[i][j]);
            }
        }
        System.out.println();

        int[][] javaScore = {{95, 80},{92, 96, 80}};
        for (int i=0; i<javaScore.length; i++) {
            for (int j=0; j<javaScore[i].length; j++) {
                System.out.println("mathScore["+i+"]["+j+"] = "+javaScore[i][j]);
            }
        }


//        page 169

        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }

        System.out.println();


//        boolean result;
//        String name1 = "신용권";
//        String name2 = "신용권";
//        String name3 = new String("신용권");
//
//        result = name1 == name2;
//        System.out.println(result);
//
//        result = name1.equals(name2);
//        System.out.println(result);
//
//        result = name1 == name3;
//        System.out.println(result);
//
//        result = name1.equals(name3);
//        System.out.println(result);

        int[] iscores;
        iscores = new int[] {83, 90, 87, 95, 71};
//        int sum1=0;
//        for (int i=0; i<3; i++){
//            sum1 += iscores[i];
//        }
//        System.out.println("총합 : " + sum1);
//
//        int sum2 = add( new int[] {83, 90, 87});
        int sum2 = add(iscores);
        double ave = (double) add(iscores)/iscores.length;

        System.out.println("총합 : " + sum2);
        System.out.println("평균 : " + ave);
        System.out.println();

        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        for (int i=1; i<array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.println("max: " + max);

        System.out.println();

        int[][] array2 = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88},
        };

        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i<array2.length; i++) {
            for (int j = 0; j<array2[i].length; j++) {
                sum += array2[i][j];
            }
            avg += array2[i].length;
        }

        avg = sum / avg;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);

        boolean run = true;
        int studentNum = 0;
        int[] scores2 = null;
        Scanner scanner = new Scanner(System.in);
        max = 0;
        sum = 0;

        while(run) {
            System.out.println("---------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    System.out.print("학생수> ");
                    studentNum = scanner.nextInt();
                    scores2 = new int[studentNum];
                    break;
                case 2:
                    for (int i=0; i<studentNum; i++) {
                        System.out.print("scores["+i+"]> ");
                        scores2[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for (int i=0; i<studentNum; i++) {
                        System.out.println("scores["+i+"]> " + scores2[i]);
                    }
                    break;
                case 4:
                    for (int i=0; i<studentNum; i++) {
                        sum += scores2[i];
                        if (max<scores2[i]) {
                            max = scores2[i];
                        }
                    }
                    System.out.println("최고 점수: "+max);
                    System.out.println("평균 점수: "+sum/studentNum);
                    break;
                default:
                    run = false;
            }
        }

        System.out.println("프로그램 종료");

    }

    public static int add(int[] scores) {
        int sum=0;
        for(int score :scores) {
            sum += score;
        }
        return  sum;
    }
}
