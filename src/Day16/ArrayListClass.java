// Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
package Day16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class ArrayListClass {
    public static void main(String args[]){
        boolean isThere=false;
        ArrayList<String> arr1=new ArrayList<>(Arrays.asList("Apple","Mango","Banana","Guava","Orange","Strawberry","kiwi"));
        System.out.println("Array of strings "+arr1);
        //a) Add an element to the ArrayList
        arr1.add("Pineapple");
        //b)Iterate through the ArrayList by using Iterator object
        System.out.println("The elements in arr1 are:");
        Iterator el1,el2;
        int i=1,j=1;
        for(el1=arr1.iterator();el1.hasNext();){
                System.out.println(i+") "+el1.next());
                i++;
        }
        System.out.println(" ");
        //c) Add an element at a specific index
        arr1.add(7,"Tomato");
        System.out.println("After adding element 'Tomato' at index 8 \n"+arr1);
        //d) Remove an element from the ArrayList, Remove at an index
        arr1.remove(3);
        System.out.println("Removing at index 03 , we get: "+arr1+"\n");
        //e) Update the element at a specific index
        arr1.set(0,"Apple_now_UpdatedValue");
        System.out.println("Updated  array: "+arr1);
        //f) Check the element is present at a particular index
        System.out.println("Is there a banana at "+arr1.indexOf("Banana"));
        //g) Get an element at a particular index.
        System.out.println("This is a element at index 4 "+arr1.get(4));
        //h) Find out the size of the ArrayList
        System.out.println("The size of ArrayList "+arr1.size());
        //i) Check the given element is present in the ArrayList
        System.out.println(arr1.contains("Mango"));
        //j) Remove all elements of the ArrayList
        // boolean b = arr1.removeAll(arr1);
        arr1.clear();
        System.out.println(arr1);
    }
}
