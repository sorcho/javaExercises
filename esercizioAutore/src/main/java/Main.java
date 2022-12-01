import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Autore a = new Autore("Marta","ma.pagliuso",'f');
        System.out.println(a.toString());
        a.setEmail("mail");
        System.out.print(a.toString());
    }
}
