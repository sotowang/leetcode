package 数学.t1037;

/**
 * @author: wangsongtao
 * @date: 2020/05/16 20:30
 */
public class IsBoomerang {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2= points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];
        return (y2-y1) * (x3-x1) != (x2-x1)*(y3-y1);

    }
}
