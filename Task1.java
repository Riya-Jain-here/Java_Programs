//Binary to Decimal converter
import java.util.Scanner;
public class Task1{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int binary,decimal=0,power=0,rem=0,no;
        char ch;
        System.out.println("Welcome to Binary to Decimal number converter!");
        do{
            System.out.print("Enter your choice(Y/N):");
            ch=sc.next().charAt(0);
            switch (ch) {
                case 'Y':
                System.out.print("Enter a binary number:");
                binary=sc.nextInt();
                int entered_no=binary;
                while(binary!=0){
                    if(binary%10>1){
                        System.out.println("Please enter correct binary number.");
                        break;
                    }
                    no=binary;
                    binary/=10;
                    System.out.println("You have entered correct binary number.");
                    
                    while(true){
                        if(no==0){
                            break;
                        }
                        else{
                            rem=no%10;
                            decimal+=rem*Math.pow(2,power);
                            no/=10;
                            power++;
                        }
                    }
    
                    System.out.println("The equivalent decimal of a binary "+ entered_no + " is:" + decimal);
                    power=0;
                    binary=0;
                    decimal=0;
                    break;
                } 
                break;
                case 'N':System.out.println("Exit");
                break;
                default:
                System.out.println("Please enter correct choice! \n Y for yes and N for No");
                break;
            }  
        }while(ch!='N');
        sc.close();
    }
}