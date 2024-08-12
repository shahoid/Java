import java.util.Scanner;
public class pattern1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int num_row = sc.nextInt();
        System.out.println("enter the number of columns : ");
        int num_col = sc.nextInt();

        for(int i = 1;i<=num_row;i++){
            for(int j =1;j<=num_col;j++){
                System.out.print( " * ");
            }
            System.out.print("\n");
        }
    }

    
}
