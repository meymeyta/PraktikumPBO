
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer,String>();

        map.put(1, "satu");
        map.put(2, "dua");

        //mengambil elemen pertama
        //System.out.println(map.get(1));

        //mengambil keseluruhan kunci sbg objek collection set (gaboleh ada yang sama)
        Set<Integer> key = map.keySet();

        //Iterasi untuk  mengambil semua keseluruhan nilai dari kunci
/*       for(String v : map.values()){
            System.out.print(v+" ");
        }*/

        //Lanjutan dari set<integer> key
        for(Integer v : key){
            System.out.print(map.get(v) + " ");
        }
    }
}
