public class Gugudan {
    int nNum;
    int nSecondNum;

    Gugudan(int num) {
        nNum = num;
    }

    void printGugudan() {
        for(nSecondNum=1; nSecondNum<10; nSecondNum++){
            System.out.println(nNum+" * "+nSecondNum+" = "+nNum*nSecondNum);
        }

    }
}
