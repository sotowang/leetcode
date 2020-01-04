package 贪心算法.t984;

/**
 * @auther: sotowang
 * @date: 2020/1/4 17:22
 */
public class StrWithout3a3b {
    public String strWithout3a3b(int A, int B) {
        if (A == 0 && B > 2 || B == 0 && A > 2) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        int countA = 0;
        int countB = 0;
        String firstLabel = A >= B ? "a" : "b";
        String secondLabel = A < B ? "a" : "b";
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        while (A > 0 || B > 0) {
            while (A == B && A != 0) {
                res.append(firstLabel);
                A--;
                res.append(secondLabel);
                B--;
            }
            while (A > 0 && countA < 2) {
                res.append(firstLabel);
                A--;
                countA++;
                countB = 0;
            }
            while (B > 0 && countB < 1) {
                res.append(secondLabel);
                B--;
                countB++;
                countA = 0;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        assert new StrWithout3a3b().strWithout3a3b(2, 5).equals("bbabbab") ;
        assert new StrWithout3a3b().strWithout3a3b(4, 4).equals("abababab");
        assert new StrWithout3a3b().strWithout3a3b(4, 1).equals("aabaa") ;
        assert new StrWithout3a3b().strWithout3a3b(1, 4).equals("bbabb") ;
        assert new StrWithout3a3b().strWithout3a3b(3, 3).equals("ababab") ;
        assert new StrWithout3a3b().strWithout3a3b(1, 3).equals("bbab");
        assert new StrWithout3a3b().strWithout3a3b(1, 2).equals("bba");
    }
}
