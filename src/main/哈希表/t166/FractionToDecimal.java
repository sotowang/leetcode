package 哈希表.t166;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/23 20:37
 */
public class FractionToDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        boolean negative = false;
        if ((numerator ^ denominator) < 0) {
            negative = true;
        }
        BigInteger numerator_l = BigInteger.valueOf(numerator).abs();
        BigInteger denominator_l = BigInteger.valueOf(denominator).abs();
        //小数点之前的数
        BigInteger intstr = numerator_l.divide(denominator_l) ;
        res1.append(intstr);
        //取余数
        BigInteger mod = numerator_l.mod(denominator_l) ;
        Map<BigInteger, Integer> modMap = new HashMap<>();
        //此时有小数部分才加.
        if (!mod.equals(BigInteger.ZERO)) {
            res1.append(".");
        }
        int count = 0;
        modMap.put(mod, count++);
        //小数点之后的数
        while (!mod.equals(BigInteger.ZERO)) {
            //商
            BigInteger shang = mod.multiply(BigInteger.valueOf(10)).divide(denominator_l);
            res2.append(shang);
            mod = mod.multiply(BigInteger.valueOf(10)).mod(denominator_l) ;
            //若此时的余数与map中余数相等,说明进入的循环,跳出循环
            if (modMap.containsKey(mod)) {
                //找到循环开始的位置
                int index = modMap.get(mod);
                res2.insert(index, '(');
                res2.append(')');
                break;
            } else {
                modMap.put(mod, count++);
            }
        }
        String temstr = res1.append(res2).toString();
        if (negative && !temstr.equals("0")) {
            temstr = "-" + temstr.substring(0, temstr.length());
        }
        return temstr;
    }

    public static void main(String[] args) {
        System.out.println(new FractionToDecimal().fractionToDecimal(-22, -2));
        System.out.println(new FractionToDecimal().fractionToDecimal(-1, -2147483648));
        System.out.println(new FractionToDecimal().fractionToDecimal(1, 2));
        System.out.println(new FractionToDecimal().fractionToDecimal(2, 1));
        System.out.println(new FractionToDecimal().fractionToDecimal(2, 3));
        System.out.println(new FractionToDecimal().fractionToDecimal(-50, 8));
        System.out.println(new FractionToDecimal().fractionToDecimal(0, -5));

    }
}
