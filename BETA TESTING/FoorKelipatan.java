import java.util.Scanner;

public class FoorKelipatan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        
        System.out.print("Masukkan bilangan kelipatan (1-9):");
        kelipatan = scan.nextInt();
        scan.close();

        for (int i = 1; i < 50; i++) {
            if(i % kelipatan == 0) {
                jumlah += i;
                counter ++;
            }
        }
    }
}
