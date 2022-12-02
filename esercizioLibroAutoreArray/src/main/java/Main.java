import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Autore[] autori = new Autore[2];

        autori[0] = new Autore("nome1", "email1", '1');
        autori[1] = new Autore("nome2", "email2", '2');

        Libro libro = new Libro("nome", 12.3, autori);

        System.out.println(Arrays.toString(libro.getAutori()));
        System.out.println(libro.getNomeAutori());
    }
}
