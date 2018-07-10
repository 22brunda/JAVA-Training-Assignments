import java.util.Scanner;

public class Duplicate{
	String str = "ABCDEFGHIJKL";
		char[] array = new char[20];
public void printPositionOfF(){
  System.out.println("print position of char ‘F’");
  for (int i = 0 ; i<str.length() ; i++)
    if (str.charAt(i) == 'F'){
      System.out.println(i);
    }
}
	public static void main(String args[]){
		Duplicate dup = new Duplicate();
		dup.printPositionOfF();
			}
}