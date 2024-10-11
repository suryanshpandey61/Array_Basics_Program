import java.util.Scanner;
class Program12{
  
  public static boolean checkStrictlyIncrease(int [] a){
    for(int i=0;i<a.length-1;i++){
       if(a[i]>a[i+1])
         return false;
    }
    return true;

  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int [] a=new int[size];
    for(int i=0;i<size;i++){
        System.out.println("Enter the "+(i+1)+" Element :");
        a[i]=sc.nextInt();
    }
   
    boolean res=checkStrictlyIncrease(a);
    if(res)
      System.out.println(" Yes Strictly increase array");
    else
      System.out.println("No it is not Strictly Increasing");

  }

}