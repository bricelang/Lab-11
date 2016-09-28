import java.util.Arrays;
import java.util.Random;
public class StatLab2D{
    int[][] nums2D = new int[3][3];
    int row = 0;
    int col = 0;
    int nums = 0;
    public static void main (String [] args){
        int[][] nums2D = new int[3][3];
        StatLab2D pass2D = new StatLab2D();
    }
    
    public StatLab2D(){
    
    }
    
    public int loadArray(){
        for (int row = 0; row < nums2D.length; row++){
             for (int col = 0; col < nums2D[row].length; col++){
                 nums2D[row][col] = (int)(Math.random()*10) + 1;
             }
        }
    }
    
    public int printArray2D(){
        for(int row = 0; row < nums2D.length; row++){
            System.out.print(nums2D[row][col] + "/t");
        }
        System.out.println();
    }
    
    public int sortArray2D(){
        int i = 0;
        for (int i = 0; i < nums2D.length; i++){
            nums[i] = nums2D[row][col];
        }
        Arrays.sort(nums);
    }
    
    public int getMean2D(){
        int ave = 0;
        for (int row = 0; row < nums2D.length; row++){
            for (int col = 0; col < nums2D[row].length; col++){
                ave = ave + nums2D[row][col];
            }
        }
        ave = ave/(nums2D.length*nums2D[0].length);
        return ave;
    }
}
