public class PrintStars{

//To Print Pyramid
  public static void printPyramid(int n){
    int i, j;
    for (i = 0; i < n; i++){
      for(j = 0; j <= i; j++){
        System.out.print("* ");
      }
       System.out.println();
    }
  }

//To Print Triangle
  public static void printTriangle(int n){
    int k = 2*n - 2, i, j;
    for(i = 0; i < n; i++){
      for(j = 0; j< k; j++){
        System.out.print(" ");
      }
      k = k-1; //Decrementing K after each loop
      for(j= 0; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String args[])
    {
        int n = 5;
        printPyramid(n);
        printTriangle(n);
    }
}