import java.util.Scanner;

public class TwoDArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and column");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //input
        //row
        System.out.println("Enter Two Day Arrays");
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        int x = sc.nextInt();
        System.out.println("Result: ");
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location(" + i + "," + j + ")");
                }
                // System.out.print(numbers[i][j] + " ");
            }
            // System.out.println();
        }
    }
}