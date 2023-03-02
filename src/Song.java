import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> listenersRecord;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.listenersRecord = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> listeners) {
        int total = 0;

        for (int i = 0; i < listeners.size(); i++) {
            String currListener = listeners.get(i).toLowerCase();

            if(!listenersRecord.contains(currListener)) {
                listenersRecord.add(currListener);
                total++;
            }
        }

        return total;
    }
}
