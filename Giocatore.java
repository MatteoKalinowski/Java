public class Giocatore {

    private String nome;
    private String cognome;
    private String sesso;

    public Giocatore(String nome, String cognome, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
}