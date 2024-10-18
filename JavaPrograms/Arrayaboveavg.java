import java.util.Random;

public class Arrayaboveavg{
    public static void main(String[]args){
        int[]numbers=new int[10];
        Random Random=new Random();
        int sum=0;

        for(int i=0;i<numbers.length;i++){
            numbers[i]=Random.nextInt(100)+1;
            sum+=numbers[i];
        }
        double average=sum/(double)numbers.length;
        System.out.println("Enter the array of elements");
        for(int number:numbers){
            System.out.print(number+" ");
        }
        System.out.printf("%nAverage of the array: %.2f%n",average);
        System.out.print("Elements greater than the average: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
    }
        }
    }
}