public class Libro {
    private String nome;
    private double prezzo;
    private int quant;
    private Autore[] autori;

    public Libro(String nome, double prezzo, int quant, Autore[] autori) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quant = quant;
        this.autori = autori;
    }

    public Libro(String nome, double prezzo, Autore[] autori) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.autori = autori;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuant() {
        return quant;
    }

    public Autore[] getAutori() {
        return autori;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getNomeAutori() {
        String nomi = "";

        for(Autore i: autori){
            nomi += i.getNome() + " ";
        }

        return nomi;
    }
}