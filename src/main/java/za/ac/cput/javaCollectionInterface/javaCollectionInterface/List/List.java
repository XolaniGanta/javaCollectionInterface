package za.ac.cput.javaCollectionInterface.javaCollectionInterface.List;

import java.util.ArrayList;
public class List {

    ArrayList<String> sNames = new ArrayList<String>();

    public void addStudent(){
        sNames.add("Xolani Ganta");
        sNames.add("mark Hughes");
        System.out.println(sNames);
    }
    public void removeStudent(){
        sNames.add("Xolani Ganta"); //add element to the array list
        sNames.add("mark Hughes");
        sNames.remove(0);
        System.out.println(sNames);
    }
    public void findStudent() {
        sNames.add("Xolani Ganta"); //add element to the array list
        sNames.add("mark Hughes");
        String index  = sNames.get(0);
        System.out.println(index);
    }

    public static void main(String[] args) {
        List results= new List();
        results.addStudent();
        results.removeStudent();
        results.findStudent();

    }

}
