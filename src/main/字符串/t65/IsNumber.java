package 字符串.t65;

/**
 * @auther: sotowang
 * @date: 2019/12/24 20:13
 */
public class IsNumber {
    public boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'e' && c != '.' && c != '+' && c != '-' && c!= ' '&& (c < '0' || c > '9')) {
                return false;
            }
        }
        try {
            new Float(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        assert new IsNumber().isNumber("959440.94f") == false;
        assert new IsNumber().isNumber(".e1") == false;
        assert new IsNumber().isNumber("46.e3") == true;
        assert new IsNumber().isNumber("+ 1") == false;
        assert new IsNumber().isNumber("+ .") == false;
        assert new IsNumber().isNumber("3-2") == false;
        assert new IsNumber().isNumber("6+1") == false;
        assert new IsNumber().isNumber("1 .") == false;
        assert new IsNumber().isNumber("3. ") == true;
        assert new IsNumber().isNumber("1 4") == false;
        assert new IsNumber().isNumber(". 1") == false;
        assert new IsNumber().isNumber(".3") == true;
        assert new IsNumber().isNumber("..2") == false;
        assert new IsNumber().isNumber(" .") == false;
        assert new IsNumber().isNumber(".") == false;
        assert new IsNumber().isNumber("3.") == true;
        assert new IsNumber().isNumber(" ") == false;
        assert new IsNumber().isNumber("95a54e53") == false;
        assert new IsNumber().isNumber("-+3") == false;
        assert new IsNumber().isNumber(" --6 ") == false;
        assert new IsNumber().isNumber("53.5e93") == true;
        assert new IsNumber().isNumber(" 99e2.5 ") == false;
        assert new IsNumber().isNumber(" 6e-1") == true;
        assert new IsNumber().isNumber("e3") == false;
        assert new IsNumber().isNumber(" 1e") == false;
        assert new IsNumber().isNumber(" -90e3   ") == true;
        assert new IsNumber().isNumber("2e10") == true;
        assert new IsNumber().isNumber("1 a") == false;
        assert new IsNumber().isNumber("abc") == false;
        assert new IsNumber().isNumber("0") == true;
        assert new IsNumber().isNumber("0.1") == true;

    }
}
