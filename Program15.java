import java.util.Scanner;
class Program15{

 public static void getFrequency(int [] a){

   int [] b=new int[a.length-1];
   
   for(int i=0;i<a.length;i++){
     int count=1;
     int temp=a[i];
     for(int j=i+1;j<a.length;j++){
       if(temp==a[j])
         count++;
         
     }
  
    System.out.println(temp+" appears "+count+" times");
   
   }

 }

 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of an array");
  int size=sc.nextInt();
  int[] a=new int[size];
  
  for(int i=0;i<size;i++)
  {
    System.out.println("enter the "+(i+1)+" element ");
    a[i]=sc.nextInt();
 
  }

  System.out.println("=====Array is =====");
  for(int i=0;i<a.length;i++)
    System.out.print(a[i]+ " ");

  System.out.println();
  System.out.println("==============");

  getFrequency(a);
  

 }

}