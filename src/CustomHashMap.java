import java.util.ArrayList;
import java.util.List;

public class CustomHashMap<K, V> {
    private List<MapPair<K, V>> mapPairs;

    public CustomHashMap() {
        this.mapPairs = new ArrayList<>();
    }

    public void put(K key, V value) {
        for (int i = 0; i < mapPairs.size(); i++) {
            if (mapPairs.get(i).getKey().equals(key)) {
                mapPairs.get(i).setValue(value);
                return;
            }
        }
        mapPairs.add(new MapPair<>(key, value));
    }

    public V get(K key) {
        for (int i = 0; i < mapPairs.size(); i++) {
            if (mapPairs.get(i).getKey().equals(key)) {
                return mapPairs.get(i).getValue();
            }
        }
        return null;
    }

    public int size() {
        return mapPairs.size();
    }

}
