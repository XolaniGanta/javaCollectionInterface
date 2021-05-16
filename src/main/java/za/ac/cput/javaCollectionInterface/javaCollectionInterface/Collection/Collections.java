package za.ac.cput.javaCollectionInterface.javaCollectionInterface.Collection;
import java.util.ArrayList;
import java.util.Collection;

public class Collections {

    Collection values = new ArrayList();

    public void addStudent() {
        values.add(100);
        values.add(5);
        System.out.println(values);
    }
    public void removeStudent() {
        values.add(100); //add element to the array list
        values.add(5);
        values.remove(100);
        System.out.println(values);
    }
    public void findStudent() {
        values.add(100); //add element to the array list
        values.add(5);
        Boolean index  = values.contains(100);
        System.out.println(index);
    }

    public static void main(String[] args) {
        Collections results = new Collections();
        results.addStudent();
        results.removeStudent();
        results.findStudent();
    }
}
