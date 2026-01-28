// Convert List to set and set to List

// List to set conversion- Pass list to set constructor to remove duplicate
// Set to list conversion- Pass set to list constructor to allow duplicates and indexing
// Use cases- Remove duplicates or restore original order
// Differences- LIst allows duplicates and maintains order, and set has unique elements

import java.util.*;
public class CollectionCounter{
    public static void main(String[] args) {
        List<String> namesList=new ArrayList<>();
        namesList.add("Hrithik");
        namesList.add("Prateek");
        namesList.add("Prateek");
        namesList.add("Sagar");

        System.out.println("Original List is: " + namesList);
//List to set
        Set<String> namesSet=new HashSet<>(namesList);
        System.out.println("After List to Set conversion it becomes: " + namesSet);

//Set to list
        List<String> uniqueNamesList=new ArrayList<>(namesSet);
        System.out.println("After Set to List conv it becomes " + uniqueNamesList);
    }
}