package za.ac.cput.javaCollectionInterface.javaCollectionInterface.Map;
import java.util.Map;
import java.util.HashMap;

public class Maps {
    Map<String, Integer> soccerStars = new HashMap<>();

    public void addStars() {
        soccerStars.put("Messi", 10);
        soccerStars.put("Ronaldo", 7);
        soccerStars.put("Ozil", 10);
        soccerStars.put("Neymar", 10);
        soccerStars.put("Giroud", 12);
        System.out.println(soccerStars);
    }

    public void removeStar() {
        soccerStars.put("Messi", 10);
        soccerStars.put("Ronaldo", 7);
        soccerStars.put("Ozil", 10);
        soccerStars.put("Neymar", 10);
        soccerStars.put("Giroud", 12);
        soccerStars.remove("Giroud");
        System.out.println(soccerStars);
    }

    public void findStar() {
        soccerStars.put("Messi", 10);
        soccerStars.put("Ronaldo", 7);
        soccerStars.put("Ozil", 10);
        soccerStars.put("Neymar", 10);
        soccerStars.put("Giroud", 12);
        Integer index = soccerStars.get("Messi");
        System.out.println(index);
    }

    public static void main(String[] args) {
        Maps results = new Maps();
        results.addStars();
        results.removeStar();
        results.findStar();

    }
}

