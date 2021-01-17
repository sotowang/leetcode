package 数学.t1232;

/**
 * @author: sotowang
 * @date: 2021/01/17 16:05
 */
public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = coordinates[0][0]-coordinates[1][0];
        int y = coordinates[0][1]-coordinates[1][1];

        for(int i=2;i<coordinates.length;i++){
            if(x*(coordinates[i][1]-coordinates[i-1][1]) != y*(coordinates[i][0]-coordinates[i-1][0])){
                return false;
            }
        }
        return true;
    }
}
