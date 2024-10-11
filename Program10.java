class Program10
{
  public static String getBiggestString(String[] s){
    
   String big="";
   for(int i=0;i<s.length;i++){
     if( big.length() < s[i].length() )
        big=s[i];
   } 
  
   return big;
  }

  public static void main(String[] args){
 
	String [] s ={"Anshu","Alok","Prakhar","Gaurav","Ashutosh","Himanshuuu"};
        System.out.println("The biggest String is :"+getBiggestString(s));
        

  }

}