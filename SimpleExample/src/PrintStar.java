public class PrintStar {
    int mstarCount;
    int i, j;

    PrintStar(int starCount) {
        mstarCount = starCount;
    }

    void printStar() {
        for (j=mstarCount; 0<j; j--){
            for (i=0; i<j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
