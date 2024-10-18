public class CommandLinearguments{
    public static void main(String[]args){
        if(args.length<1){
            System.out.println("Print atleast one argument(num)");
            return;
        }
        int num=Integer.parseInt(args[0]);
        int length;
        if(args.length>=2){
            length=Integer.parseInt(args[0]);
        }else{
            length=10;
        }
        System.out.printf("Table of %d with length %d:%n",num,length);

        for(int i=1;i<=length;i++){
            System.out.printf("%d * %d =%d%n",num,i,num*i);
        }
    }
}