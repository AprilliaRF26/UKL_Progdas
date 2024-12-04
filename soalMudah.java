import java.util.Scanner;

public class soalMudah {
    public static boolean isPrima(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=== MENGHITUNG BILANGAN PRIMA ATAU BUKAN ===");
        System.out.print("Masukkan jumlah bilangan yang ingin diperiksa: ");
        int jumlah = s.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = s.nextInt();
            if (isPrima(bilangan)) {
                System.out.println("Bilangan " + bilangan + " adalah bilangan prima.");
            } else {
                System.out.println("Bilangan " + bilangan + " bukan bilangan prima.");
            }
        }

        s.close();
    }
}