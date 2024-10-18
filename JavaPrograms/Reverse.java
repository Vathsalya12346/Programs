import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        Scanner Scanner=new Scanner(System.in);

        System.out.println("Enter a number:");
        int number=Scanner.nextInt();
        int Lastdigit;
        int originalnum=number;
        int reverse=0;
        

        while(number>0){
            Lastdigit=number%10;
            reverse=reverse*10+Lastdigit;
            number=number/10;
        }
        System.out.println("The reverse of"+originalnum+"is"+reverse);
    }
}