public class Partita {

    private Squadra squadra_casa;
    private Squadra squadra_ospite;
    private int data;
    private int punteggio_casa;
    private int punteggio_ospite;
    private int set_squadra_casa;
    private int set_squadra_ospite;

    public Partita(Squadra squadra_casa, Squadra squadra_ospite, int data,int punteggio_casa,  int punteggio_ospite, int set_squadra_casa, int set_squadra_ospite) {

        this.squadra_casa = squadra_casa;
        this.squadra_ospite = squadra_ospite;
        this.data = data;
        this.punteggio_casa = punteggio_casa;
        this.punteggio_ospite = punteggio_ospite;
        this.set_squadra_casa = set_squadra_casa;
        this.set_squadra_ospite = set_squadra_ospite;
    }

    public Squadra getSquadra_casa() {
        return squadra_casa;
    }

    public Squadra getSquadra_ospite() {
        return squadra_ospite;
    }

    public int getData() {
        return data;
    }

    public int getPunteggio_casa() {
        return punteggio_casa;
    }

    public int getPunteggio_ospite() {
        return punteggio_ospite;
    }

    public int getSet_squadra_casa() {
        return set_squadra_casa;
    }

    public int getSet_squadra_ospite() {
        return set_squadra_ospite;
    }

    public void setSquadra_casa(Squadra squadra_casa) {
        this.squadra_casa = squadra_casa;
    }

    public void setSquadra_ospite(Squadra squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPunteggio_casa(int punteggio_casa) {
        this.punteggio_casa = punteggio_casa;
    }

    public void setPunteggio_ospite(int punteggio_ospite) {
        this.punteggio_ospite = punteggio_ospite;
    }

    public void setSet_squadra_casa(int set_squadra_casa) {
        this.set_squadra_casa = set_squadra_casa;
    }

    public void setSet_squadra_ospite(int set_squadra_ospite) {
        this.set_squadra_ospite = set_squadra_ospite;
    }
}