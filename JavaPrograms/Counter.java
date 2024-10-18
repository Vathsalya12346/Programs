//Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. 
//Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.
public class Counter{
    private int count;
    //default constructer
    public Counter(){
        this.count=0;
    }

//another constructor with parameter
public Counter(int initialcount){
    this.count=initialcount;
}
public void increment(){
    count++;
}
public void decrement(){
    count--;
}
public int getcount(){
    return count;
}
public static void main(String[]args){

    Counter Counter1=new Counter(0);
    System.out.println("Intial count(c1)"+Counter1.getcount());
    Counter1.increment();
    System.out.println("After increament count(c1)"+Counter1.getcount());
    Counter1.decrement();
    System.out.println("After decreament count(c1)"+Counter1.getcount());

    Counter Counter2=new Counter(10);
    System.out.println("Intial count(c2)"+Counter2.getcount());
    Counter2.increment();
    System.out.println("After increament count(c2)"+Counter2.getcount());
    Counter2.decrement();
    System.out.println("After decreament count(c2)"+Counter2.getcount());

}
}