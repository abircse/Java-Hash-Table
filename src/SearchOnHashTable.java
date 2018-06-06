import java.util.HashSet;

/**
 * Created by Abir CSE on 6/6/2018.
 */
public class SearchOnHashTable {

    public static void main(String[] args) {

        HashSet hash = new HashSet();

        hash.add("Abir");
        hash.add("Saiful");
        hash.add("Bappy");
        hash.add("Imran");
        hash.add("Shanta");
        hash.add("Asrafunnessa");
        hash.add("Nasrin");



        if(hash.contains("Abir"))

            System.out.println(" Abir is exist our HashTable " + hash);

    }
}
