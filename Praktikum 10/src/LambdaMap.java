//Nama : Meyta Rizki Khairunisa
//NIM : 24060122130085

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122130085", "Meyta");
        mahasiswaMap.put("24060122140169", "Bambang Suseno");
        mahasiswaMap.put("24060122140138", "Qarina");
        mahasiswaMap.put("24060122140137", "Farisah");
        mahasiswaMap.put("24060122140121", "Rosidah");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
