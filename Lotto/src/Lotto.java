import java.util.Arrays;
import java.util.Objects;

public class Lotto {
    int nNum;
    int lottoNumbers[] = {0,0,0,0,0,0};

    Lotto() {

    }

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

    void printLottoNum() {
        manageLottoNum();
        for(int i=0; i<6; i++) {
            System.out.print(lottoNumbers[i]+" ");
        }
        System.out.println();
    }
}
