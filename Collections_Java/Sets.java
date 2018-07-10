import java.util.*;
// import java.util.List;

public class Sets{

//adding values to List
  public void addValues(){
    System.out.println("Adding Values into List");
    HashSet<String> hash_Set = new HashSet<String>();
    hash_Set.add("Java");
    hash_Set.add("C");
    hash_Set.add("C++");
    hash_Set.add("Python");
    hash_Set.add("Java");
    hash_Set.add("Pearl");
    hash_Set.add("Java");
    hash_Set.add("Python");
    hash_Set.add("Example");
    hash_Set.add("Set");

    //Set output without the duplicates
    System.out.println(hash_Set);
  }

//remove values from list
  public void removeValues(){
    System.out.println("Removing Values into List");
    HashSet<String> hash_Set = new HashSet<String>();
    hash_Set.add("Java");
    hash_Set.add("C");
    hash_Set.add("C++");
    hash_Set.add("Python");
    hash_Set.add("Rails");
    hash_Set.add("Pearl");
    hash_Set.add("Selenium");
    hash_Set.add("React");

    hash_Set.remove("Rails");
    System.out.println(hash_Set);
  }

//Copy Values into new ArrayList
  public void copyValues(){
    System.out.println("Removing Values into List");
    HashSet<String> hash_Set = new HashSet<String>();
    hash_Set.add("Java");
    hash_Set.add("C");
    hash_Set.add("C++");
    hash_Set.add("Python");
    hash_Set.add("Java");
    hash_Set.add("Pearl");
    System.out.println("First Set is:" + hash_Set);

    HashSet<String> hash_Sets = new HashSet<String>();
    hash_Sets.add("Java");
    hash_Sets.add("Brunda");
    hash_Sets.add("C++");
    hash_Sets.add("Darshan");
    hash_Sets.add("Sowmya");
    hash_Sets.add("Pearl");
    System.out.println("Second Set is:" + hash_Sets);

    hash_Set.addAll(hash_Sets);
    System.out.println("Contents of both Sets are:" + hash_Sets);
  }

//Sorting an ArrayList
  public void sortValues(){
    System.out.println("Sorting an ArrayList");
    HashSet<String> hash_Set = new HashSet<String>();
    hash_Set.add("Java");
    hash_Set.add("C");
    hash_Set.add("C++");
    hash_Set.add("Python");
    hash_Set.add("VisualBacsics");
    hash_Set.add("Pearl");
    hash_Set.add("C#");
    hash_Set.add("React");
    hash_Set.add("Node.Js");

    System.out.println("Contents of before sorting:" + hash_Set);
      //Sorting HashSet using List interface
    List<String> hash_Sets = new ArrayList<String>(hash_Set);
    Collections.sort(hash_Sets);
    System.out.println("HashSet elements after sorting: "+ hash_Set);
  }


//Check if particular value exists in a collection
  public void eleExists(){
    System.out.println("Check if particular value exists in a collection");
    HashSet<String> exists = new HashSet<String>();
    exists.add("Nikitha");
    exists.add("Uthsav");
    exists.add("Brunda");
    exists.add("Darshan");
    exists.add("Zebra");

    if (exists.contains("Brunda")) {
      System.out.println("Element is found");
    } else {
      System.out.println("Element not found");
    }
  }
  public static void main(String args[]){
    Sets set  = new Sets();
      // set.addValues();
      // set.removeValues();
      // set.copyValues();
      // set.sortValues();
    set.eleExists();
  }

}