import java.util.Scanner;
class Program14
{

  public static int[] addNewElement(int[] a,int index,int value){
 
   int[] b=new int[a.length+1]; 
   if(index<0 || index>a.length) 
     System.out.println("Enter the valid index value");
    
   else{
     
    for(int i=0;i<b.length;i++){
       if(i<index)
          b[i]=a[i];
       
       else if(i==index)
         b[i]=value;
       else
         b[i]=a[i-1];
    }
   
   }
   
    return b; 
    

  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int[] a=new int[size];
    for(int i=0;i<size;i++){
       System.out.println("Enter the "+(i+1)+" Element :");
       a[i]=sc.nextInt();
    }
    System.out.println("====Old Array====");
    for(int x:a)
       System.out.print(x+" ");
    System.out.println();
    
    System.out.println("Enter the index ");
    int index=sc.nextInt();

    System.out.println("Enter the value which you want to Enter");
    int value=sc.nextInt();

    System.out.println("====New Array====");
    int [] b=new int[a.length+1];
    b =addNewElement(a,index,value);
    for(int x:b)
       System.out.print(x+" ");
   
  }


}












