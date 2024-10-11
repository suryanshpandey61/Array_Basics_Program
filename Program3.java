class Program3{
  public static int getBiggest(int[] a)
  {
 	
        int big=0;
        for(int i=0;i<a.length;i++){
             if(big<a[i]){
               big=a[i];
             }
        }
        return big;
  }

  public static void main(String[] args){
     int [] a = {12,32,43,54,65,11,76};
     System.out.println("The biggest element in array is :"+getBiggest(a));
   
  }
 
  
}