package string;

import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(calculateHourGlassSum(arr));
        in.close();
    }

    private static int calculateHourGlassSum(int[][] arr)
    {
        int rowCount = arr.length - 2;
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < rowCount; i++)
        {
            int columnCount = arr[i].length - 2;
            for (int j = 0; j < columnCount; j++)
            {
                 sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                 
                
                 if(maxSum<sum)
                 maxSum=sum;
                 
            }
        } 
        
        return maxSum;
    }
}
/*1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6*/

/*-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5*/ 