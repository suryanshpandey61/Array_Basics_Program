import java.util.Scanner;
class Program11{
 
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the array Size");
     int size=sc.nextInt();
     int [] a=new int[size];
     
     for(int i=0;i<size;i++){
         
         System.out.println("Enter the "+(i+1)+" Element ");
         a[i]=sc.nextInt();

      }

    for(int i=0;i<size;i++){
       System.out.println(a[i]);
    }
  }


}