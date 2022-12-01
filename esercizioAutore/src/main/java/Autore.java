public class Autore {
    private String nome, email;
    private char sesso;

    public Autore(String nome, String email, char sesso) {
        this.nome = nome;
        this.email = email;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public char getSesso() {
        return sesso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Autore[" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", sesso=" + sesso +
                "]";
    }
}
