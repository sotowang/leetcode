package 其他.t838;

/**
 * @auther: sotowang
 * @date: 2020/1/5 14:43
 */
public class PushDominoes {
    public String pushDominoes(String dominoes) {
        if (dominoes == null || dominoes.length() == 0) {
            return "";
        }
        int len = dominoes.length();
        int[] dominoesChar = new int[len];
        //从左到右扫描
        for (int i = 0; i < len; i++) {
            if (dominoes.charAt(i) == 'R') {
                dominoesChar[i] = len;
                int count = len - 1;
                while (i + 1 < len && dominoes.charAt(i + 1) == '.') {
                    dominoesChar[i + 1] = count;
                    count--;
                    i++;
                }
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                dominoesChar[i] -= len;
                int count = len - 1;
                while (i -1>= 0  && dominoes.charAt(i-1) == '.') {
                    dominoesChar[i - 1] -= count;
                    count--;
                    i--;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < dominoesChar.length; i++) {
            if (dominoesChar[i] == 0) {
                res.append(".");
            } else if (dominoesChar[i] > 0) {
                res.append("R");
            } else {
                res.append("L");
            }
        }
        return res.toString();
    }


    public static void main(String[] args) {
        assert new PushDominoes().pushDominoes("R.......L.R.........").equals("RRRR.LLLL.RRRRRRRRRR");
        assert new PushDominoes().pushDominoes("L.LL......").equals("LLLL......");
        assert new PushDominoes().pushDominoes(".RR..").equals(".RRRR");
        assert new PushDominoes().pushDominoes("..LL.").equals("LLLL.");
        assert new PushDominoes().pushDominoes(".L.R.").equals("LL.RR");
        assert new PushDominoes().pushDominoes(".L.R...LR..L..").equals("LL.RR.LLRRLL..");
        assert new PushDominoes().pushDominoes("RR.L").equals("RR.L");
    }
}
