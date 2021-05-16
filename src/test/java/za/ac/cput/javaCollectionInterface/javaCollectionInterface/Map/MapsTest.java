package za.ac.cput.javaCollectionInterface.javaCollectionInterface.Map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapsTest {
    Map<String, Integer> soccerStars = new HashMap<>();

    @Test
    public void addStars() {
        soccerStars.put("Messi", 10);
        soccerStars.put("Ronaldo", 7);
        soccerStars.put("Ozil", 10);
        soccerStars.put("Neymar", 10);
        soccerStars.put("Giroud", 12);
        assertEquals(5, soccerStars.size());
    }
    @Test
    public void removeStar() {
        soccerStars.put("Messi", 10);
        soccerStars.put("Ronaldo", 7);
        soccerStars.put("Ozil", 10);
        soccerStars.put("Neymar", 10);
        soccerStars.put("Giroud", 12);
        soccerStars.remove("Giroud");
        assertEquals(4, soccerStars.size());
    }
@Test
    public void findStar() {
        soccerStars.put("Messi", 10);
        soccerStars.put("Ronaldo", 7);
        soccerStars.put("Ozil", 10);
        soccerStars.put("Neymar", 10);
        soccerStars.put("Giroud", 12);
        Integer index = soccerStars.get("Giroud");
        assertEquals(12, index);
    }
}