public class Main {
    public static void main(String[] args) {
        Giocatore giocatore1 = new Giocatore("Chad", "Cognome", "M");
        Giocatore giocatore2 = new Giocatore("Stacy", "Cognome", "F");

        Squadra squadraCasa = new Squadra(1, 101);
        squadraCasa.setGiocatori(new Giocatore[]{giocatore1, null, null, null, null, null});

        Squadra squadraOspite = new Squadra(2, 202);
        squadraOspite.setGiocatori(new Giocatore[]{giocatore2, null, null, null, null, null});

        Partita partita = new Partita(squadraCasa, squadraOspite, 20240601, 3, 2, 3, 2);

        System.out.println("Set squadra casa: " + partita.getSet_squadra_casa());
        System.out.println("Set squadra ospite: " + partita.getSet_squadra_ospite());
        System.out.println("Punti casa: " + partita.getPunteggio_casa());
        System.out.println("Punti ospite: " + partita.getPunteggio_ospite());

    }
}
