package 双指针.t11;

/**
 * @auther: sotowang
 * @date: 2019/10/30 21:20
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while(left<=right){
            int tem = (height[right]>height[left]?height[left]:height[right])*(right-left);
            area = tem>area?tem:area;
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new MaxArea().maxArea(height));
    }
}
