import java.util.Scanner;
class BinarySearch{
  
  public static int binarySearch(int[] a,int target){
    
     int si=0;
     int ei=0;
     while(si<=ei){
       int mid= si+(ei-si)/2;
       if(a[mid]==target)
         return mid;
       else if(a[mid]>target)
         ei=mid-1;
       else
         si=mid+1;
     }
     return -1;
 
  }

  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int[] a={2,5,13,56,78,98,101};
     System.out.println("Enter the target value:");
     int target=sc.nextInt();
     int res=binarySearch(a,target);
     if(res>=0)
       System.out.println(target+" present at index:"+res);
     else
       System.out.println(target+" does not present in the array");

  }


}









