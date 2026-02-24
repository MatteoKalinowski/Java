public class Squadra {

    private int numero;
    private int numero_alfanumerico;
    private Giocatore[] giocatori;

    public Squadra(int numero, int numero_alfanumerico) {
        this.numero = numero;
        this.numero_alfanumerico = numero_alfanumerico;
        this.giocatori = new Giocatore[6]; 
    }

    public int getNumero() {
        return numero;
    }

    public int getNumero_alfanumerico() {
        return numero_alfanumerico;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumero_alfanumerico(int numero_alfanumerico) {
        this.numero_alfanumerico = numero_alfanumerico;
    }

    public Giocatore[] getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(Giocatore[] giocatori) {
        this.giocatori = giocatori;
    }
}