import java.util.Scanner;
class Matrix{
    int a[][] = new int[100][100];int b[][] = new int[100][100];int c[][] = new int[100][100];
    Scanner sc = new Scanner(System.in);
    //  
    int row = sc.nextInt();
    int col = sc.nextInt();

    public void getdata(){
      
        System.out.println("Enter the array elements for a: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array elements are for a: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print( a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the array elements for b: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array elements are for b: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print( b[i][j] + " ");
            }
            System.out.println();
    
        }
    }

    public void addition(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The addition of two matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print( c[i][j] + " ");
            }
            System.out.println();
    
        }
    }

    public void subtraction(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("The subtraction of two matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print( c[i][j] + " ");
            }
            System.out.println();
    
        }

    }

    public void Multiplication(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j] = 0;
             for(int k=0;k<row;k++)
                c[i][j] += a[i][k] * b[k][j];
            }
        }
        System.out.println("The Multiplication of two matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print( c[i][j] + " ");
            }
            System.out.println();
    
        }
    }

}

public class Exp2 {
    public static void main(String[] args) {
    System.out.println("Enter the value of row and column: ");
      Matrix m = new Matrix();
      
      m.getdata();
      m.addition();  
      m.subtraction();
      m.Multiplication();
    }
}
