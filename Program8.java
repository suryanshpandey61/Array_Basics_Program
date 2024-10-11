class Program8{
 
  public static void getStringSize(String[] s){

   for(int i=0;i<s.length;i++){
      System.out.println("The size of "+s[i]+" is: "+s[i].length());
   }


  }

  public static void main(String[] args){
  
   String [] s ={"Anshu","Alok","Prakhar","Gaurav","Ashutosh","Himanshu"};
   getStringSize(s);

  }

}