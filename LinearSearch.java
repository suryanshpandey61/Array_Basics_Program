import java.util.Scanner;
class LinearSearch{

   public static void linearSearch(int[] a,int target){
     
      for(int i=0;i<a.length-1;i++){
	if(a[i]==target){
		System.out.println("The "+target+" present at :"+i);
		return;
	}
      }
      System.out.println(target+" not present in array");

   }

  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int[] a={12,10,54,32,76,84,66};
     System.out.println("Enter the target value:");
     int target=sc.nextInt();
     linearSearch(a,target);
  }


}