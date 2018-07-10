public class WhileLoop implements ILoop{
 int i = 0, num, fact = 1;

//Write program using for loop for printing index value(done by myself)
 public void printIndexValue(){
  System.out.println("printing index value");
  while(i < 10){
    System.out.println(i);
    i++;
  }
}

//Stop when index value reaches 88(done by myself)
public void printIndexUpTo(){
 System.out.println("printing index value");
 while(i <= 88){
  if(i == 88){
    break;
  }
  System.out.println(i);
  i++;
}
}

//Print only odd numbers upto 100(done by myself)(done by myself)
public void printOddNumbers(){
  System.out.println("only odd numbers upto 100");
  while(i < 100){
    if(i%2 != 0){
      System.out.println(i);
    } 
    i++;
  }
}

//print only first 10 odd numbers upto 100(google help and done by myself) 
public void printFirstTenOddNum(){
  int count = 0;
  System.out.println("only first 10 odd numbers upto 100");
  while(i < 500){
    if(i%2 != 0){
      System.out.println(i);
      count++;
    }
    if(count == 10){
      break;
    }
  }
}

//print only 2 digit numbers(taken help)
public void printTwoDigitsNum(){
 System.out.println("print only 2 digit numbers");
  while (i < 500){
    if(String.valueOf(i).length() == 2)
      {
        System.out.println(i);
      }if(++i == 500){
        break;
      }
    i++;
  }
}

//print only numbers divisible by 5 upto 50 nos(done by myself)
public void numDivByFive(){
  System.out.println("print only numbers divisible by 5 upto 50 nos");
  int count = 0;
  while(i < 500){
    if(i%5 == 0){

      System.out.println(i);
      count++;
    }
    if(count == 50){
      break;
    }
  }
  }
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
  WhileLoop whileLoop = new WhileLoop();

  whileLoop.printIndexValue();
  whileLoop.printIndexUpTo();
  whileLoop.printOddNumbers();
  whileLoop.printFirstTenOddNum();
  whileLoop.printTwoDigitsNum();
  whileLoop.numDivByFive();
  // whileLoop.printFactorial();
}
}