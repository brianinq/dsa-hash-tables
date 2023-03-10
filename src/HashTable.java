import java.util.LinkedList;

public class HashTable {
    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] entries = new LinkedList[10];

    public void put(int key, String value){
        var index = hash(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        //update existing entry
        for(var entry: entries[index]){
            if(entry.key == key){
                entry.value = value;
            }
        }

        var entry = new Entry(key, value);
        entries[index].addLast(entry);
    }

    public String get(int key){
        var index  = hash(key);

        if(entries[index]!=null) {
            for (var entry : entries[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }
    public void remove(int key){
        var index = hash(key);
        var location = entries[index];
        if(location == null)
            throw new IllegalArgumentException();

        for (var entry: location){
            if (entry.key == key){
                location.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private int hash(int key){
        return key % entries.length;
    }
}
