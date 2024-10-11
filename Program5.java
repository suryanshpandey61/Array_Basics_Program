class Program5{
 
  public static int getDiffrence(int[] a){
    int big=0;
    int small=a[0];
    for(int i=0;i<a.length;i++){
       if(big<a[i]){
          big=a[i];
       }
       if(small>a[i]){
	  small=a[i];
       }
    }
   int diff=big-small;
   return diff;
  }

 
  public static void main(String[] args){
    
   int[] a = {12,100,1,23,54,67,32};
   System.out.println("The diff b/w biggest & smallest is :"+getDiffrence(a));  
 
  }
 
}