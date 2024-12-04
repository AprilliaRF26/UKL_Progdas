public class soalSedang {
        public static int hitungTotalTabungan(int[] tabungan) {
            int total = 0;
            for (int jumlah : tabungan) { 
                total += jumlah; 
            }
            return total;
        }
        public static void main(String[] args) {

            System.out.println("=== MENGHITUNG JUMLAH TABUNGAN ===");
            int[] tabungan = new int[5]; 
            int tabunganAwal = 100000;
            int kenaikan = 50000;
    
            for (int i = 0; i < tabungan.length; i++) {
                if (i == 0) {
                    tabungan[i] = tabunganAwal;
                } else {
                    tabungan[i] = tabungan[i - 1] + kenaikan;
                }
            }
            for (int i = 0; i < tabungan.length; i++) {
                System.out.printf("Tabungan bulan ke-%d: Rp%,d%n", i + 1, tabungan[i]);
            }

            int totalTabungan = hitungTotalTabungan(tabungan);
            System.out.printf("%nTotal tabungan selama 12 bulan: Rp%,d%n", totalTabungan);
        }
    }