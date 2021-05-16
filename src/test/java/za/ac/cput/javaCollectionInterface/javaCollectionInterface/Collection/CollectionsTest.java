package za.ac.cput.javaCollectionInterface.javaCollectionInterface.Collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {
    Collection values = new ArrayList();

    @Test

    public void testSize() {
        values.add(100);
        values.add(5);
        assertEquals(2, values.size());

    }
@Test
    public void removeStudent() {
        values.add(100); //add element to the array list
        values.add(5);
        values.remove(0);
        assertEquals(1, values.size());
    }
@Test
    public void findStudent() {
        values.add(100); //add element to the array list
        values.add(5);
        assertTrue(values.contains(100));

    }
}