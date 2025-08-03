package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PodcastTest {

    @Test
    void testGetters() {
        Podcast p = new Podcast("TechTalk", 30, "Tecnología", "Luis", "Spotify");
        assertEquals("Luis", p.getConductor());
        assertEquals("Spotify", p.getPlataforma());
    }

    @Test
    void testToCSV() {
        Podcast p = new Podcast("TechTalk", 30, "Tecnología", "Luis", "Spotify");
        assertEquals("TechTalk,30,Tecnología,Luis,Spotify", p.toCSV());
    }
}
