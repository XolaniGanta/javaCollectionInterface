package za.ac.cput.javaCollectionInterface.javaCollectionInterface.Set;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    LinkedHashSet Surname = new LinkedHashSet();

    @Test
    public void testSurname(){
        Surname.add("X");
        Surname.add("o");
        Surname.add("l");
        Surname.add("a");
        Surname.add("n");
        Surname.add("i");
        assertEquals(6,Surname.size());
    }
    @Test
    public void removeLastAlphab(){
        Surname.add("X");
        Surname.add("o");
        Surname.add("l");
        Surname.add("a");
        Surname.add("n");
        Surname.add("i");
        Surname.remove("i");
        assertEquals(5,Surname.size());
    }
    @Test
    public void findStudent() {
        Surname.add("X");
        Surname.add("o");
        Surname.add("l");
        Surname.add("a");
        Surname.add("n");
        Surname.add("i");
        assertTrue(Surname.contains("X"));
    }
}