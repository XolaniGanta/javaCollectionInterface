package za.ac.cput.javaCollectionInterface.javaCollectionInterface.List;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

 List test = new List();
 ArrayList<String> sNames = new ArrayList<>(); //Declare ArrayList named sNames.
 @Test
 // method add
    public void testSize(){

     sNames.add("Xolani Ganta"); //add element to the array list
     sNames.add("mark Hughes");
     assertEquals(2,sNames.size());  //Test the size of the array list

  }
  @Test
 //method remove
   public void removeStudent(){
   sNames.add("Xolani Ganta"); //add element to the array list
   sNames.add("mark Hughes");
   sNames.remove(0);
   assertEquals(1,sNames.size());
 }
 @Test
 //method find 
 public void findStudent(){
  sNames.add("Xolani Ganta"); //add element to the array list
  sNames.add("mark Hughes");
  String index  = sNames.get(0);
  assertEquals("Xolani Ganta",index);
 }
 }
