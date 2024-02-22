public class HashTables {
    String [] array1;

    //initializes an array of size capacity
    public void HashTable(int capacity) {
        array1 = new String[capacity];
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value) {
        return true; //PLACEHOLDER
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key) {
        return key;  //PLACEHOLDER
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key) {
        return 1; //PLACEHOLDER
    }
}
