import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");
        String metin = scanner.nextLine();

        // Metni kelimelere ayırma
        String[] kelimeler = metin.split("\\s+");

        // Kelimeleri saymak için HashMap kullanma
        HashMap<String, Integer> kelimeSayilari = new HashMap<>();

        for (String kelime : kelimeler) {
            // Kelimeleri HashMap'e ekleme veya sayısını artırma
            kelimeSayilari.put(kelime, kelimeSayilari.getOrDefault(kelime, 0) + 1);
        }

        // En çok geçen kelimeyi bulma
        String enCokGecenKelime = "";
        int enCokGecenKelimeSayisi = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            if (entry.getValue() > enCokGecenKelimeSayisi) {
                enCokGecenKelime = entry.getKey();
                enCokGecenKelimeSayisi = entry.getValue();
            }
        }

        // En çok geçen kelimeyi ekrana yazdırma
        System.out.println("En çok geçen kelime: " + enCokGecenKelime);
    }
}
