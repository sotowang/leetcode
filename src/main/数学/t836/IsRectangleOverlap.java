package 数学.t836;

/**
 * @auther: sotowang
 * @date: 2020/4/7 14:47
 */
public class IsRectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];
        int x3 = rec2[0];
        int y3 = rec2[1];
        int x4 = rec2[2];
        int y4 = rec2[3];
        if(x2<=x3 || x1>=x4 || y2<=y3 || y1 >= y4){
            return false;
        }
        return true;

    }
}
