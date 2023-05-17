/** *
* File : ArraylistIest.java
* Deskripsi: program penggunaan objek ArrayList sebagai Collection class

*/ 

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // Menambah elemen ke ArrayList
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generies");

        // Menghapus elemen dari ArrayList
        strings.remove("praktikum");

        // Iterasi pada keseluruhan ArrayList dan mencetak elemen
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
