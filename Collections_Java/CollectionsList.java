import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsList{

//adding values to List
  public void addValues(){
    List<String> myList = new ArrayList<String>();
    myList.add("Java");
    myList.add("C");
    myList.add("C++");
    System.out.println("List:"+ myList);
  }

//adding values using Collections
  public void addCollections(){
    List<String> myList = new ArrayList<String>();
    myList.add("Java");
    myList.add("C");
    myList.add("C++");
    System.out.println("List:"+ myList);
    Collections.addAll(myList, "Phyton", "Pearl", "Ruby");
    System.out.println("After adding with myList:"+ myList);
  }

//Remove Value from List
  public void removeValues(){
    List<String> myList = new ArrayList<String>();
    myList.add("Java");
    myList.add("C");
    myList.add("C++");
    System.out.println("List:"+ myList);
    //remove
    myList.remove("C++");
    System.out.println("List:"+ myList);
  }

//Copy Values into new ArrayList
  public void copyValues(){
    List<String> myList = new ArrayList<String>();
    myList.add("Java");
    myList.add("C");
    myList.add("C++");
    System.out.println("List:"+ myList);

    List<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("One");
    arrayList2.add("Two");
    arrayList2.add("Three");
    arrayList2.add("Four");
    arrayList2.add("Five");
    System.out.println("List:"+ arrayList2);

    Collections.copy(arrayList2,myList);  //Copy into new arraylist
    System.out.println("After Copying MyList to new ArrayList:"+ arrayList2);
  }

//Sorting an ArrayList
  public void sortValues(){
    ArrayList<String> sort = new ArrayList<String>();
    sort.add("Nikitha");
    sort.add("Uthsav");
    sort.add("Brunda");
    sort.add("Darshan");
    sort.add("Zebra");

    Collections.sort(sort);
    System.out.println("List after the use of" +
     " Collection.sort() :\n" + sort);
  }

 //Fetching Values from particular Position
  public void fetchValue(){
    ArrayList<String> fetch = new ArrayList<String>();
    fetch.add("Nikitha");
    fetch.add("Uthsav");
    fetch.add("Brunda");
    fetch.add("Darshan");
    fetch.add("Zebra");

    System.out.println("The Element is: "+fetch.get(2));
  }

//Check if particular value exists in a collection
  public void eleExists(){
    ArrayList<String> exists = new ArrayList<String>();
    exists.add("Nikitha");
    exists.add("Uthsav");
    exists.add("Brunda");
    exists.add("Darshan");
    exists.add("Zebra");

    if (exists.contains("Brunda")) {
      System.out.println("Element found");
    } else {
      System.out.println("Element not found");
    }
  }

//Use forEach to print values to console
  public void printValuesConsole(){
    
  }

  public static void main(String args[]){
    CollectionsList addVal = new CollectionsList();
    // addVal.addValues();
    // addVal.addCollections();
    // addVal.removeValues();
    // addVal.copyValues();
    // addVal.sortValues();
    // addVal.fetchValue();
    addVal.eleExists();
  }
}