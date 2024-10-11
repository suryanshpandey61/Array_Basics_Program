class Program7{

  public static boolean checkMultipleIsEven(int [] a){
  
    for(int i=0;i<a.length;i++){
       if(a[i]%2==0)
        return true;
    }
    return false;
  }  
  
  public static void main(String[] args){

     int [] a={1,13,35,33,45,7};
     boolean res=checkMultipleIsEven(a);
     if(res)
       System.out.println("Multiple is Even");
     else
       System.out.println("Multiple is Odd");
 
  }

}