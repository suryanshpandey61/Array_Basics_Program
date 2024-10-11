class Program9{

 public static void printEvenLengthString(String[] s){
    int count=0;
    for(int i=0;i<s.length;i++){
      if(s[i].length()%2==0){
        System.out.println(s[i]);
        count++;
      }
    }
   System.out.println("Total no of Even Length string is :"+count);
 
 }

 public static void main(String[] args){
     String [] s ={"Anshu","Alok","Prakhar","Gaurav","Ashutosh","Himanshu"};
     printEvenLengthString(s);


 }

}