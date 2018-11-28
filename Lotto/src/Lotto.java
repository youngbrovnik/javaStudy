import java.util.Arrays;
import java.util.Objects;

public class Lotto {
    int nNum;
    int lottoNumbers[] = {0,0,0,0,0,0};

    int generateLottoNum() {
        int num = (int) (Math.random() * 45) + 1;

        return num;
    }

    void manageLottoNum() {
        for(int i=0; i<6; i++) {
            nNum = generateLottoNum();
            for(int j=0; j<i; j++) {
                while((Objects.equals(lottoNumbers[j], nNum))) {
                    nNum = generateLottoNum();
//                    System.out.print("lonum "+lottoNumbers[j] + " " + "nnum "+ nNum+" ");
                }
            }
            lottoNumbers[i] = nNum;
        }
        Arrays.sort(lottoNumbers);
    }

//    같은 수가 계속 나오면 어떻게 될까??

    void printLottoNum() {
        for(int j=0; j<5; j++){
            manageLottoNum();
            for(int num : lottoNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
