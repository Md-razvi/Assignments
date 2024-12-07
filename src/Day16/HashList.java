// Create a HashMap with at least 10 key value pairs of the Student ID and Name
//
//Copy all the elements of the Map to another Map
package Day16;
import java.util.HashMap;
public class HashList {
    public static void main(String[] args){
    // a) Insert a Key value mapping into the map
        HashMap<Integer,String> StdObj=new HashMap<Integer,String>();
        StdObj.put(101,"Rajesh");
        StdObj.put(102,"Mukesh");
        StdObj.put(103,"Mina");
        StdObj.put(104,"Tina");
        StdObj.put(105,"Reema");
        StdObj.put(106,"Raza");
        StdObj.put(107,"Mudabir");
        StdObj.put(108,"Rehana");
        StdObj.put(109,"Ruksana");
        StdObj.put(110,"Suresh");
    //b) Fetch the value of a Key
        System.out.println("The value can be obtained by 109 is "+StdObj.get(109));
    //c) Create a clone/copy of HashMap
        System.out.println(StdObj);
        HashMap StdObjCopy=(HashMap) StdObj.clone();
        StdObjCopy.put(111,"Rahul");
        System.out.println("This is clone: "+StdObjCopy);
    //d) Check if the given Key is in the Map
        System.out.println("Check whether key 107 is there: "+StdObj.containsKey(107));
    //e) Check if the value is in the Map
        System.out.println("Check whether value of 103  is there: "+StdObj.containsValue("Mina"));
    //f) Check if the map is empty.
        System.out.println("Is StdObj Empty: "+StdObj.isEmpty());
    //g) Print the size of the Map to the console
        System.out.println("Size of HashMap StdObj: "+StdObj.size());
    //h) Print all the Keys of the map to the console
        System.out.println("These are keys of HashMap: "+StdObj.keySet());
    //i) Remove a specific Key-value pair
        StdObj.remove(104);
        System.out.println("After removing specific key 104 "+StdObj);
    //j) Copy all the elements of the Map to another Map
        HashMap<Integer,String> CopiedMap=new HashMap<Integer,String>();
        CopiedMap.putAll(StdObj);
        System.out.println("CopiedMap is "+CopiedMap);
    }
}
