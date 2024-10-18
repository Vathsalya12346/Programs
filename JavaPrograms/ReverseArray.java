import java.util.Scanner;
public class ReverseArray{
    public static void main(String[]args){
        Scanner Scanner=new Scanner(System.in);

        int[]numbers=new int[5];
        
        for(int i=0;i<numbers.length;i++){
            System.out.print("Element"+(i+1)+":");
            numbers[i]=Scanner.nextInt();
        }
        System.out.println("The reverse of a array");
        for(int i=numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }
    }
}