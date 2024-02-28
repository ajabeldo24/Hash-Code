import java.util.Scanner;

public class HashTables {
    String [] array1;
    String l = "";

    //initializes an array of size capacity
    public void HashTable(int capacity) {
        array1 = new String[capacity];
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value) {
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == 'a' || key.charAt(i) == 'A') {
                l = l.concat("1");
            } else if (key.charAt(i) == 'b' || key.charAt(i) == 'B') {
                l = l.concat("2");
            } else if (key.charAt(i) == 'c' || key.charAt(i) == 'C') {
                l = l.concat("3");
            } else if (key.charAt(i) == 'd' || key.charAt(i) == 'D') {
                l = l.concat("4");
            } else if (key.charAt(i) == 'e' || key.charAt(i) == 'E') {
                l = l.concat("5");
            } else if (key.charAt(i) == 'f' || key.charAt(i) == 'F') {
                l = l.concat("6");
            } else if (key.charAt(i) == 'g' || key.charAt(i) == 'G') {
                l = l.concat("7");
            } else if (key.charAt(i) == 'h' || key.charAt(i) == 'H') {
                l = l.concat("8");
            } else if (key.charAt(i) == 'i' || key.charAt(i) == 'I') {
                l = l.concat("9");
            } else if (key.charAt(i) == 'j' || key.charAt(i) == 'J') {
                l = l.concat("10");
            } else if (key.charAt(i) == 'k' || key.charAt(i) == 'K') {
                l = l.concat("11");
            } else if (key.charAt(i) == 'l' || key.charAt(i) == 'L') {
                l = l.concat("12");
            } else if (key.charAt(i) == 'm' || key.charAt(i) == 'M') {
                l = l.concat("13");
            } else if (key.charAt(i) == 'n' || key.charAt(i) == 'N') {
                l = l.concat("14");
            } else if (key.charAt(i) == 'o' || key.charAt(i) == 'O') {
                l = l.concat("15");
            } else if (key.charAt(i) == 'p' || key.charAt(i) == 'P') {
                l = l.concat("16");
            } else if (key.charAt(i) == 'q' || key.charAt(i) == 'Q') {
                l = l.concat("17");
            } else if (key.charAt(i) == 'r' || key.charAt(i) == 'R') {
                l = l.concat("18");
            } else if (key.charAt(i) == 's' || key.charAt(i) == 'S') {
                l = l.concat("19");
            } else if (key.charAt(i) == 't' || key.charAt(i) == 'T') {
                l = l.concat("20");
            } else if (key.charAt(i) == 'u' || key.charAt(i) == 'U') {
                l = l.concat("21");
            } else if (key.charAt(i) == 'v' || key.charAt(i) == 'V') {
                l = l.concat("22");
            } else if (key.charAt(i) == 'w' || key.charAt(i) == 'W') {
                l = l.concat("23");
            } else if (key.charAt(i) == 'x' || key.charAt(i) == 'X') {
                l = l.concat("24");
            } else if (key.charAt(i) == 'y' || key.charAt(i) == 'Y') {
                l = l.concat("25");
            } else if (key.charAt(i) == 'z' || key.charAt(i) == 'Z') {
                l = l.concat("26");
            }
        }

        int lInt = (Integer.parseInt(l));
        int index = 1000000 % lInt;
        array1[index] = value;
        return true;
    }


    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key) {
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == 'a' || key.charAt(i) == 'A') {
                l = l.concat("1");
            } else if (key.charAt(i) == 'b' || key.charAt(i) == 'B') {
                l = l.concat("2");
            } else if (key.charAt(i) == 'c' || key.charAt(i) == 'C') {
                l = l.concat("3");
            } else if (key.charAt(i) == 'd' || key.charAt(i) == 'D') {
                l = l.concat("4");
            } else if (key.charAt(i) == 'e' || key.charAt(i) == 'E') {
                l = l.concat("5");
            } else if (key.charAt(i) == 'f' || key.charAt(i) == 'F') {
                l = l.concat("6");
            } else if (key.charAt(i) == 'g' || key.charAt(i) == 'G') {
                l = l.concat("7");
            } else if (key.charAt(i) == 'h' || key.charAt(i) == 'H') {
                l = l.concat("8");
            } else if (key.charAt(i) == 'i' || key.charAt(i) == 'I') {
                l = l.concat("9");
            } else if (key.charAt(i) == 'j' || key.charAt(i) == 'J') {
                l = l.concat("10");
            } else if (key.charAt(i) == 'k' || key.charAt(i) == 'K') {
                l = l.concat("11");
            } else if (key.charAt(i) == 'l' || key.charAt(i) == 'L') {
                l = l.concat("12");
            } else if (key.charAt(i) == 'm' || key.charAt(i) == 'M') {
                l = l.concat("13");
            } else if (key.charAt(i) == 'n' || key.charAt(i) == 'N') {
                l = l.concat("14");
            } else if (key.charAt(i) == 'o' || key.charAt(i) == 'O') {
                l = l.concat("15");
            } else if (key.charAt(i) == 'p' || key.charAt(i) == 'P') {
                l = l.concat("16");
            } else if (key.charAt(i) == 'q' || key.charAt(i) == 'Q') {
                l = l.concat("17");
            } else if (key.charAt(i) == 'r' || key.charAt(i) == 'R') {
                l = l.concat("18");
            } else if (key.charAt(i) == 's' || key.charAt(i) == 'S') {
                l = l.concat("19");
            } else if (key.charAt(i) == 't' || key.charAt(i) == 'T') {
                l = l.concat("20");
            } else if (key.charAt(i) == 'u' || key.charAt(i) == 'U') {
                l = l.concat("21");
            } else if (key.charAt(i) == 'v' || key.charAt(i) == 'V') {
                l = l.concat("22");
            } else if (key.charAt(i) == 'w' || key.charAt(i) == 'W') {
                l = l.concat("23");
            } else if (key.charAt(i) == 'x' || key.charAt(i) == 'X') {
                l = l.concat("24");
            } else if (key.charAt(i) == 'y' || key.charAt(i) == 'Y') {
                l = l.concat("25");
            } else if (key.charAt(i) == 'z' || key.charAt(i) == 'Z') {
                l = l.concat("26");
            }
        }
        int lInt = (Integer.parseInt(l));
        int index = 1000000 % lInt;
        return array1[index];
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key) {
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == 'a' || key.charAt(i) == 'A') {
                l = l.concat("1");
            } else if (key.charAt(i) == 'b' || key.charAt(i) == 'B') {
                l = l.concat("2");
            } else if (key.charAt(i) == 'c' || key.charAt(i) == 'C') {
                l = l.concat("3");
            } else if (key.charAt(i) == 'd' || key.charAt(i) == 'D') {
                l = l.concat("4");
            } else if (key.charAt(i) == 'e' || key.charAt(i) == 'E') {
                l = l.concat("5");
            } else if (key.charAt(i) == 'f' || key.charAt(i) == 'F') {
                l = l.concat("6");
            } else if (key.charAt(i) == 'g' || key.charAt(i) == 'G') {
                l = l.concat("7");
            } else if (key.charAt(i) == 'h' || key.charAt(i) == 'H') {
                l = l.concat("8");
            } else if (key.charAt(i) == 'i' || key.charAt(i) == 'I') {
                l = l.concat("9");
            } else if (key.charAt(i) == 'j' || key.charAt(i) == 'J') {
                l = l.concat("10");
            } else if (key.charAt(i) == 'k' || key.charAt(i) == 'K') {
                l = l.concat("11");
            } else if (key.charAt(i) == 'l' || key.charAt(i) == 'L') {
                l = l.concat("12");
            } else if (key.charAt(i) == 'm' || key.charAt(i) == 'M') {
                l = l.concat("13");
            } else if (key.charAt(i) == 'n' || key.charAt(i) == 'N') {
                l = l.concat("14");
            } else if (key.charAt(i) == 'o' || key.charAt(i) == 'O') {
                l = l.concat("15");
            } else if (key.charAt(i) == 'p' || key.charAt(i) == 'P') {
                l = l.concat("16");
            } else if (key.charAt(i) == 'q' || key.charAt(i) == 'Q') {
                l = l.concat("17");
            } else if (key.charAt(i) == 'r' || key.charAt(i) == 'R') {
                l = l.concat("18");
            } else if (key.charAt(i) == 's' || key.charAt(i) == 'S') {
                l = l.concat("19");
            } else if (key.charAt(i) == 't' || key.charAt(i) == 'T') {
                l = l.concat("20");
            } else if (key.charAt(i) == 'u' || key.charAt(i) == 'U') {
                l = l.concat("21");
            } else if (key.charAt(i) == 'v' || key.charAt(i) == 'V') {
                l = l.concat("22");
            } else if (key.charAt(i) == 'w' || key.charAt(i) == 'W') {
                l = l.concat("23");
            } else if (key.charAt(i) == 'x' || key.charAt(i) == 'X') {
                l = l.concat("24");
            } else if (key.charAt(i) == 'y' || key.charAt(i) == 'Y') {
                l = l.concat("25");
            } else if (key.charAt(i) == 'z' || key.charAt(i) == 'Z') {
                l = l.concat("26");
            }
        }
        int lInt = (Integer.parseInt(l));
        int index = 1000000 % lInt;
        return index;
    }
}
