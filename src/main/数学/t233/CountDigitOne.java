package 数学.t233;

/**
 * @auther: sotowang
 * @date: 2020/1/21 18:59
 */
public class CountDigitOne {
    /**编程之美》上这样说:
    设N = abcde ,其中abcde分别为十进制中各位上的数字。
    如果要计算百位上1出现的次数，它要受到3方面的影响：百位上的数字，百位以下（低位）的数字，百位以上（高位）的数字。
    如果百位上数字为0，百位上可能出现1的次数由更高位决定。
        比如：12013，则可以知道百位出现1的情况可能是：100~199，1100~1199,2100~2199，，...，11100~11199，一共1200个。
        可以看出是由更高位数字（12）决定，并且等于更高位数字（12）乘以 当前位数（100）。注意：高位数字不包括当前位
    如果百位上数字为1，百位上可能出现1的次数不仅受更高位影响还受低位影响。比
        如：12113，则可以知道百位受高位影响出现的情况是：100~199，1100~1199,2100~2199，，....，11100~11199，一共1200个。
        和上面情况一样，并且等于更高位数字（12）乘以 当前位数（100）。但同时它还受低位影响，百位出现1的情况是：12100~12113,一共14个，等于低位数字（13）+1。
        注意：低位数字不包括当前数字
    如果百位上数字大于1（2~9），则百位上出现1的情况仅由更高位决定，
        比如12213，则百位出现1的情况是：100~199,1100~1199，2100~2199，...，11100~11199,12100~12199,一共有1300个，并且等于更高位数字+1（12+1）乘以当前位数（100）**/
    public int countDigitOne(int n) {
        if (n < 1) {
            return 0;
        }
        int len = getLenOfN(n);
        if (len == 1) {
            return 1;
        }
        int tmp = (int) Math.pow(10, len - 1);
        int first = n / tmp;
        int firstOneNum = first == 1 ? n % tmp + 1 : tmp; // 获取n的最高位为1时有多少个数字
        int otherOneNUm = first * (len - 1) * (tmp / 10); // 在介于n % tmp到n之间的数字中，除了最高位为1，其余各个数字分别为1 的总数和
        return firstOneNum + otherOneNUm + countDigitOne(n % tmp);
    }

    private int getLenOfN(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        assert new CountDigitOne().countDigitOne(13) == 6;

    }
}
