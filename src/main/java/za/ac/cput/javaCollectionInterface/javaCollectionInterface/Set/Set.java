package za.ac.cput.javaCollectionInterface.javaCollectionInterface.Set;

import java.util.LinkedHashSet;

public class Set {
    LinkedHashSet Surname = new LinkedHashSet();

    public void addSurname() {
        Surname.add("X");
        Surname.add("o");
        Surname.add("l");
        Surname.add("a");
        Surname.add("n");
        Surname.add("i");
        System.out.println(Surname);
    }

    public void removeSurname() {
        Surname.add("X");
        Surname.add("o");
        Surname.add("l");
        Surname.add("a");
        Surname.add("n");
        Surname.add("i");
        Surname.remove("i");
        System.out.println(Surname);

    }

    public void findStudent() {
        Surname.add("X");
        Surname.add("o");
        Surname.add("l");
        Surname.add("a");
        Surname.add("n");
        Surname.add("i");
        System.out.println(Surname.contains("X"));
    }

    public static void main(String[] args) {
        Set results = new Set();
        results.addSurname();
        results.removeSurname();
        results.findStudent();
    }
}
