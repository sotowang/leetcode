package 常用算法.其它;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {
   int w,x,y, z;

    public Example(int a, int b) {
        x = a;
        y = b;
    }

    public Example(int a, int b, int c, int d) {

        w = d;
        z = c;
    }

    public static void main(String[] args) {
        char[] a = new char[255];
        for (int i = 0; i <= 255; i++) {
            a[i] = (char) i;
        }
    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }
    private static void build(int[][] matrix, int n, int start) {
        int[] dir = new int[5];
        dir[0] = 0;
        dir[1] = n - 1;
        dir[2] = 0;
        dir[3] = n - 1;
        dir[4] = start;
        boolean flag = true;
        while (dir[4] <= n * n) {
            if (flag) {
                spiralOrder1(matrix, dir);
            } else {
                spiralOrder2(matrix, dir);
            }
            flag = !flag;
        }
    }
    //顺时针
    public static void spiralOrder1(int[][] matrix,int[] dir) {
        //向右走,到尽头
        for (int i = dir[2]; i <= dir[3]; i++) {
            matrix[dir[0]][i] = dir[4]++;
        }
        //重新设定上边界
        if (++dir[0] > dir[1]) {
            return;
        }
        //向下走 到尽头
        for (int i = dir[0]; i <= dir[1]; i++) {
            matrix[i][dir[3]] = dir[4]++;
        }
        //重新设定右边界
        if (--dir[3] < dir[2]) {
            return;
        }
        //向左走 到尽头
        for (int i = dir[3]; i >= dir[2]; i--) {
            matrix[dir[1]][i] = dir[4]++;
        }
        //重新设定下边界
        if (--dir[1] < dir[0]) {
            return;
        }

        //向上走 到尽头
        for (int i = dir[1]; i >= dir[0]; i--) {
            matrix[i][dir[2]] = dir[4]++;

        }
        //重新设定左边界
        if (++dir[2] > dir[3]) {
            return;
        }
    }

    /**
     * 上 0
     * 下 1
     * 左 2
     * 右 3
     * @param matrix
     * @param dir
     */
    public static void spiralOrder2(int[][] matrix,int[] dir) {
        //向下走 到尽头
        for (int i = dir[0]; i <= dir[1]; i++) {
            matrix[i][dir[2]] = dir[4]++;
        }
        //重新设定左边界
        if (++dir[2] > dir[3]) {
            return;
        }

        //向右走,到尽头
        for (int i = dir[2]; i <= dir[3]; i++) {
            matrix[dir[1]][i] = dir[4]++;
        }
        //重新设定下边界
        if (--dir[1] < dir[0]) {
            return;
        }

        //向上走 到尽头
        for (int i = dir[1]; i >= dir[0]; i--) {
            matrix[i][dir[3]] = dir[4]++;
        }
        //重新设定右边界
        if (--dir[3] < dir[2]) {
            return;
        }

        //向左走 到尽头
        for (int i = dir[3]; i >= dir[2]; i--) {
            matrix[dir[0]][i] = dir[4]++;
        }

        //重新设定上边界
        if (++dir[0] > dir[1]) {
            return;
        }
    }

}

