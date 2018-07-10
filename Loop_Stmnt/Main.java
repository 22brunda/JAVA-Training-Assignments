public class Main {
  public static void main(String args[]) {
    String classType = args[0];
    ILoop loop = null;

    if(classType.equals("for")) {
      //Call for Class
      loop = new ForLoop();
    }
    else if(classType.equals("while")) {
    //Call while class
      loop = new WhileLoop();
    }
    else if(classType.equals("dowhile")) {
    //Call dowhile
      loop = new DoWhileLoop();
    } else {
      System.out.println("Sorry, cannot help you!!");
    }

    loop.printIndexValue();
    loop.printIndexUpTo();
    loop.printOddNumbers();
    loop.printFirstTenOddNum();
    loop.printTwoDigitsNum();
    loop.numDivByFive();
    // loop.printFactorial();
  }
}