class Program13{

  public static void removeElement(int [] a,int index){
  
   int [] b=new int[a.length-1];
   for(int i=0;i<b.length;i++){
     if(i<index){
       b[i]=a[i];
     }
     else if(i==index || i>index){
       b[i]=a[i+1];
     }
     else{
        b[i]=a[i];
     }
     
   }

   System.out.println("===========");
   for(int i=0;i<b.length;i++)
     System.out.println(b[i]);

  }

  public static void main(String[] args){

   int [] a={12,32,43,65,11,13,54,57};
   removeElement(a,2);  


  }


}