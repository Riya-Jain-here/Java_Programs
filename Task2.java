//Matrix calculator 
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,row,col;
        char ch;
        System.out.println("---Matrix Calculator---");
        System.out.print("Enter no. of rows of 1st matrix:");
        m=sc.nextInt();
        System.out.print("Enter no. of columns of 1st matrix:");
        n=sc.nextInt();
        System.out.print("Enter no. of rows of 2nd matrix:");
        i=sc.nextInt();
        System.out.print("Enter no. of columns of 2nd matrix:");
        j=sc.nextInt();
        int matrix_1[][]=new int[m][n];
        int matrix_2[][]=new int[i][j];
        System.out.println("Enter the values of 1st matrix:");
            for(row=0;row<m;row++){
                for(col=0;col<n;col++){
                   matrix_1[row][col]=sc.nextInt();
                }
            }

        System.out.println("Enter the values of 2nd matrix:");
            for(row=0;row<i;row++){
                for(col=0;col<j;col++){
                   matrix_2[row][col]=sc.nextInt();
                }
            }
        do{
            System.out.println("Enter your choice(A/S/M/E):");
            ch=sc.next().charAt(0);
            switch (ch) {
                case 'A':
                if((m==i)&&(n==j)){
                    int res[][]=new int[m][n];
                    for(row=0;row<m;row++){
                        for(col=0;col<n;col++){
                            res[row][col]=matrix_1[row][col]+matrix_2[row][col];
                        }
                    }
                    System.out.println("The addition of matrices:");
                    for(row=0;row<m;row++){
                        for(col=0;col<n;col++){
                            System.out.print(res[row][col] + " ");
                        }
                        System.out.println();
                    }
                } 
                else{
                    System.out.println("Can't Add as both matrices are not square matrix.");
                }
                break;
            
                case 'S':
                if((m==i)&&(n==j)){
                    int res[][]=new int[m][n];
                    for(row=0;row<m;row++){
                        for(col=0;col<n;col++){
                            res[row][col]=matrix_1[row][col]-matrix_2[row][col];
                        }
                    }
                    System.out.println("The subtraction of matrices:");
                    for(row=0;row<m;row++){
                        for(col=0;col<n;col++){
                            System.out.print(res[row][col] + " ");
                        }
                        System.out.println();
                    }
                } 
                else{
                    System.out.println("Can't subtract as both matrices are not square matrix.");
                }
                break;

                case 'M':
                if(n==i){
                    int res[][]=new int[m][j];
                    for(row=0;row<m;row++){
                        for(col=0;col<n;col++){
                            res[row][col]=matrix_1[row][col]*matrix_2[row][col];
                        }
                    }
                    System.out.println("The multiplication of matrices:");
                    for(row=0;row<m;row++){
                        for(col=0;col<n;col++){
                            System.out.print(res[row][col] + " ");
                        }
                        System.out.println();
                    }
                } 
                else{
                    System.out.println("Can't multiply as both no. of columns of 1st matrix not equal to no. of rows of 2nd matrix.");
                }

                break;

                case 'E': System.out.println("Exit");
                break;

                default:
                System.out.println("Please enter correct choice! \n A for addition, S for subtraction, M for multiplication or E");
                break;
             } 
          
        }while(ch!='E');
        sc.close();
    }
}