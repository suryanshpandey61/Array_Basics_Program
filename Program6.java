class Program6{

   public static boolean checkAnyElementIsEven(int [] a){
     int count=0;
     for(int i=0;i<a.length;i++){
       if(a[i]%2==0)
         count++;
       else
	break;
     }
    if(count==a.length)
     return true;
    else
     return false;

   }

   public static void main(String[] args){
     int [] a={12,6,2,4,8};
     System.out.println(checkAnyElementIsEven(a));

   }

}