public class ForLoop implements ILoop{

//Write program using for loop for printing index value(done by myself)
  int i = 0;

  public void printIndexValue(){
    System.out.println("printing index value");
    for(i = 0 ; i <= 10 ; ++i){
      System.out.println(i);
    }
  }

// //Stop when index value reaches 88(done by myself)
//   public void printIndexUpTo(){
//    System.out.println("printing index value");
//    for(i = 0 ; i <= 88 ; i++){
//     if(i == 88){
//      break;
//    }System.out.println(i);
//  }
// }

// //Print only odd numbers upto 100(done by myself)(done by myself)
// public void printOddNumbers(){
//   System.out.println("only odd numbers upto 100");
//   for(i = 0 ; i <= 100 ; i++){
//     if(i%2 != 0){
//       System.out.println(i);
//       i++;
//     }
//   }
// }

// //print only first 10 odd numbers upto 100(google help and done by myself) 
// public void printFirstTenOddNum(){
//   System.out.println("only first 10 odd numbers upto 100");
//   int count = 0;
//   for(i = 1 ; i <= 100 ; i++) {
//     if(i%2 != 0){
//       System.out.println(i);
//       count++;
//     }
//     if(count == 10){
//       break;
//     }
//   }
// }

// //print only 2 digit numbers(taken help)
// public void printTwoDigitsNum(){
//   System.out.println("print only 2 digit numbers");
//   for(i = 0 ; i < 500 ; i++){
//     if(String.valueOf(i).length() == 2)
//     {
//       System.out.println(i);
//     }if(++i == 500){
//       break;
//     }
//   }
// }

// //print only numbers divisible by 5 upto 50 nos(done by myself)
// public void numDivByFive(){
//   System.out.println("print only numbers divisible by 5 upto 50 nos");
//   int count = 0;
//   for(i = 0 ; i < 500 ; i++){
//     if(i%5 == 0){
//       System.out.println(i);
//       count++;
//     }
//     if(count == 50){
//       break;
//     }
//   }
// }
// take max limit value from console for checking odd numbers.(taken help)
  // public void printConsoleInput{
  //   System.out.println("take max limit value from console for checking odd numbers");
  //   for(int i=0; i<limit; i++){
  //     System.out.println((i%2!=0?"" +1:""));
  //   }
  // }

//write program for factorial(google help and done by myself) 
  // public void printFactorial(){
  //   System.out.println("print Factorial Numbers");
  //   System.out.println("Enter the Number");
  //   for(i = 0 ; i <= num ; i++){
  //     fact = fact * i;
  //     System.out.println(i);
  //     i++;
  //   }
  // }
public static void main(String args[]){
  ForLoop forLoop = new ForLoop();
  forLoop.printIndexValue();
  // forLoop.printIndexUpTo();
  // forLoop.printOddNumbers();
  // forLoop.printFirstTenOddNum();
  // forLoop.printTwoDigitsNum();
  // forLoop.numDivByFive();
    // forLoop.printFactorial();
}
}
