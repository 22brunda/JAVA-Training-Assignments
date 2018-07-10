public class Strings{
 // public static void main(String args[]){
  String str = "ABCDEFGHIJK";
  char[] array = new char[20];

//Reverse string using loops
  public void reverseString(){

    // for( int i = length - 1 ; i >= 0 ; i-- ){
    //   reverse = original.charAt(i);
    //   System.out.println(reverse);
    // }
  }

//print only “ABCDEFG”
  public void printCharacter(){
    System.out.println("Print only 'ABCDEFG'");
    str.getChars(0,7,array,0);
    System.out.println(array);
  }

//print only “EFGH”
 public void printMiddleChar(){
    System.out.println("Print Middle Character");
    str.getChars(4,8,array,0);
    System.out.println(array);
  } 

//print only char at position 5
  public void printPositionChar(){
    System.out.println("Print Character Position 5");
    str.getChars(4,5,array,0);
    System.out.println(array);
  }

//print position of char ‘F’
public void printPositionOfF(){
  System.out.println("print position of char ‘F’");
  for (int i = 0 ; i<str.length() ; i++)
    if (str.charAt(i) == 'F'){
      System.out.println(i);
    }
}

//Find the last char in the above string
public void printLastCharacter(){
  System.out.println("Find the last char in the above string");
  char last = str.charAt(str.length() - 1);
  System.out.println(last); 
}

//check whether the above string contains char ‘H’
public void printCharContaints(){
  System.out.println("check whether the above string contains char ‘H’");
  if(str.contains("H")){
    System.out.println("Character H is Found");
  }else{
    System.out.println("Character H is not Found");
  }
}

//print the length of string
public void printLengthOfString(){
  System.out.println("print the length of string");
  int length = str.length();
  System.out.println(length);
}

//Using console, pass value and check whether string is pure string or number, print result
public void checkStringOrInt(){
  System.out.println("check whether string is pure string or number");

}

//Using console, pass 2 values, check if both are equal. Check also if references are equal.
// public void checkStrEquals(){
//   Scanner scan = new Scanner(System.in);
//   System.out.println("check if both strings are equal. Check also if references are equal.");
//   System.out.println("Enter the First String");
//   str1 = scan.nextLine();
//   System.out.println("Enter the Second String");
//   str2 = scan.nextLine();
//   if(str1.equals(str2)){
//     System.out.println("Both Strings are equal");
//   }
// }

public static void main(String args[]){
  Strings strObj = new Strings();
  strObj.reverseString();
  strObj.printCharacter();
  strObj.printMiddleChar();
  strObj.printPositionChar();
  strObj.printLastCharacter();
  strObj.printCharContaints();
  strObj.printLengthOfString();
  strObj.checkStringOrInt();
  // strObj.checkStrEquals();
}
}
