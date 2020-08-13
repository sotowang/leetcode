package 常用算法.其它.bilibili;


/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
//24点
public class Example {

    public static boolean Game24Points(int[] arr) {
        // write code here
        if (arr == null || arr.length < 4) {
            return false;
        }
        boolean[] visited = new boolean[4];

        return check(arr, visited, 0);
    }

    private static boolean check(int[] arr, boolean[] visited, double num) {
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (check(arr, visited, num + arr[i])
                        || check(arr, visited, num - arr[i])
                        || check(arr, visited, num * arr[i])
                        || check(arr, visited, num / arr[i])) {
                    return true;
                }
                visited[i] = false;
            }
        }
        if (num == 24) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 10};
        System.out.println(Game24Points(arr));
    }

}
