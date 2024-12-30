import java.util.Scanner;

/**
 * wriKedua
 */
public class wriKedua {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("username :");
    String username = sc.nextLine();
    System.out.println("password :");
    String password = sc.nextLine();

    if (username.equalsIgnoreCase("Admin")) {
        System.out.println("WAZEKK BENAR");
    }else {
        System.out.println("salah anjai");
    }
    
    if (password.equals("rahasia")) {
        System.out.println("Selamat datang di Kabupaten");
    }else {
        System.out.println("PULANG!!!");
    }
}
}