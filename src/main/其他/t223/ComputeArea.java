package 其他.t223;

/**
 * @author wst
 * @create 2019-12-15 下午8:59
 */
public class ComputeArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        //无重叠情况
        if (C <= E || B >= H || D <= F || A >= G) {
            return area1 + area2;
        }
        //有重叠情况
        int a = Math.min(D, H);
        int b = Math.max(F, B);
        int c = Math.max(A, E);
        int d = Math.min(C, G);
        int width = Math.abs(a - b);
        int length = Math.abs(c - d);
        int dupArea = width * length;
        return area1 + area2 - dupArea;
    }

    public static void main(String[] args) {
        System.out.println(new ComputeArea().computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }
}
