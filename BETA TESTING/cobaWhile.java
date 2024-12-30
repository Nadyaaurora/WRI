import java.util.Scanner;

public class cobaWhile {

    //while
    //continue
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah karyawan: ");
        int jumlahKaryawan = sc.nextInt();
        int totalGaji;
        sc.nextLine();

        int i = 0;
        while (i < jumlahKaryawan) {
            int bonus = 1_000_000;
            System.out.print("Gaji karyawan ke- " + (i + 1) + ": ");
            int gaji = sc.nextInt();
            sc.nextLine();

            totalGaji = gaji + bonus;
            i++;
        }

        for (int j = 0; j < jumlahKaryawan; j++) {
            System.out.println("Gaji karyawan ke- " + (j + 1) + ": " + totalGaji);
        }
    }
}
