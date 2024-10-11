class Program2{

  public static void main(String[] args){
     int [] a= {10,7,5,2};
     int sum=0;
     for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
          sum=sum+a[i];
        }
     }
     System.out.println("The sum of Even Elements in array is :"+sum);
  } 

}