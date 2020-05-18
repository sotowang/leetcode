package 数学.t1041;

/**
 * @author: wangsongtao
 * @date: 2020/05/18 20:57
 */
public class IsRobotBounded {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int dir = 1;
        for(char c:instructions.toCharArray()){
            if(c == 'G'){
                if(dir == 1){
                    x += 1;
                }else if(dir == 0){
                    y+=1;
                }else if(dir == 2){
                    y -=1;
                }else if(dir == 3){
                    x -=1;
                }
            }else if(c == 'L'){
                dir -=1;
                if(dir == -1){
                    dir = 3;
                }
            }else if(c == 'R'){
                dir +=1;
                if(dir == 4){
                    dir = 0;
                }
            }
        }
        if((x|y) ==0 ||  dir != 1){
            return true;
        }
        return false;
    }
}
