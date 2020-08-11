package 常用算法.计算一年的第几天;

/**
 * @author: sotowang
 * @date: 2020/08/10 20:20
 */
public class CalcWhichDay {
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int[] checkRunYear(int year) {
        if (((year % 4 == 0) && year % 100 != 0) || year % 400 == 0) {
            months[1] = 29;
        }
        return months;
    }

    private int calcWhichDay(int year, int month, int day) {
        int count = 0;
        int[] months = checkRunYear(year);
        for (int i = 0; i < month - 1; i++) {
            count += months[i];
        }
        return count + day;
    }

    public static void main(String[] args) {
        System.out.println(new CalcWhichDay().calcWhichDay(2000, 12, 31));
        System.out.println(new CalcWhichDay().calcWhichDay(2001, 12, 31));
    }
}
