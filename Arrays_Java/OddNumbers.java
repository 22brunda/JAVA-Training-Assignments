public class OddNumbers{
  public static void main(String args[]){
    int[] arr = new int[20];
    for(int i = 0; i < arr.length; i++){
      if(i%2 != 0){
        System.out.println(i);
        // i++;
      }   
    }
  }  
}