public class Main {
    public static void main(String[] args){
        Libro libro = new Libro("Libro 1", 25.4, new Autore("mattia", "mattias", 'm'));

        System.out.print(libro.toString());
    }
}
