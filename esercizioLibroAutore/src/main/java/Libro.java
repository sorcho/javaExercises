public class Libro {
    private String nome;
    private double prezzo;
    private int quantita;
    private Autore autore;

    public Libro(String nome, double prezzo, Autore autore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.autore = autore;
    }

    public Libro(String nome, double prezzo, int quantita, Autore autore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.autore = autore;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", quantita=" + quantita +
                ", autore=" + autore.toString() +
                '}';
    }
}
