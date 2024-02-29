import java.util.Hashtable;
import java.util.Scanner;

public class HashTablesDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an array capacity: ");
        int capacity = s.nextInt();
        int [] f = new int [capacity];
        Hashtable n = new Hashtable(1000000000);
        System.out.println("Enter a key (4 or less characters): ");
        String key = new String(s.nextLine());
        System.out.println("Enter a value to place in the array at the index: ");
        String value = new String(s.nextLine());
        System.out.println("Key hashed and value placed at index: ");
        System.out.println(n.put(key,value));
        System.out.print("Index: ");
        System.out.println(n.get(key));
        System.out.print("Unique Int: ");
        System.out.print(n.hashCode()); //won't take a key in as an argument
    }

}
