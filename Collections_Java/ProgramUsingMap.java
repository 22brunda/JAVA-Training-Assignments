import java.util.*;  

public class ProgramUsingMap{

  //adding values to List
  public void addValues(){
   HashMap<Integer,String> map = new HashMap<Integer,String>();   
   map.put(01,"Java"); 
   map.put(02,"C");
   map.put(03,"C++");
   System.out.println("List:"+ map);
 }

//Remove Value from List
 public void removeValues(){
  HashMap<Integer,String> map = new HashMap<Integer,String>();
  map.put(101,"Brunda");
  map.put(102,"Uthsav");
  map.put(103,"Nikitha");
  System.out.println("Before Removing Element:"+ map);
    //remove
  map.remove(102);
  System.out.println("After Removing Element:"+ map);
}

//Copy Values into new ArrayList
public void copyValues(){
  HashMap<String, String> hm = new HashMap<String, String>();
  //add key-value pair to hashmap
  hm.put("first", "FIRST INSERTED");
  hm.put("second", "SECOND INSERTED");
  hm.put("third","THIRD INSERTED");
  System.out.println(hm);
  HashMap<String, String> subMap = new HashMap<String, String>();
  subMap.put("s1", "S1 VALUE");
  subMap.put("s2", "S2 VALUE");
  hm.putAll(subMap);
  System.out.println(hm);
}

//Sorting an ArrayList
public void sortValues(){
  HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
  hash_map.put(10,"J");
  hash_map.put(01,"A");
  hash_map.put(05,"E");
  hash_map.put(26,"Z");
  hash_map.put(15,"O");
  hash_map.put(20,"T");
  Collections.sort(hash_map);
  System.out.println("List after the use of" +
   " Collection.sort() :\n" + hash_map);
}

//Fetching Values from particular Position
public void fetchValue(){
  Map<Integer,String> map = new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul"); 
  // System.out.println(map.getKey(100)+" "+map.getValue("Amit"));   
}

public static void main(String args[]){
  ProgramUsingMap addVal = new ProgramUsingMap();
  // addVal.addValues();
    // addVal.addCollections();
  // addVal.removeValues();
    // addVal.copyValues();
  addVal.sortValues();
    // addVal.fetchValue();
    // addVal.eleExists();
}

}

