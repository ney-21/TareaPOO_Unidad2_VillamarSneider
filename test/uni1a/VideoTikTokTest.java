package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VideoTikTokTest {

    @Test
    void testGetUsuario() {
        VideoTikTok v = new VideoTikTok("Broma", 1, "Comedia", "juanito07", true);
        assertEquals("juanito07", v.getUsuario());
    }

    @Test
    void testToCSV() {
        VideoTikTok v = new VideoTikTok("Broma", 1, "Comedia", "juanito07", true);
        assertEquals("Broma,1,Comedia,juanito07,true", v.toCSV());
    }
}
