package mainpackage;

public class Main {

    static final long SLEEP_TIME = 100;

    public static void main(String[] args) throws InterruptedException {
        GuessMaster master = new GuessMaster();

        Guesser[] guessers = new Guesser[3];
        guessers[0] = new Guesser("Mikko", master);
        guessers[1] = new Guesser("Matti", master);
        guessers[2] = new Guesser("Petri", master);

        for (Guesser guesser : guessers)
            guesser.start();

        for (Guesser guesser : guessers)
            guesser.join();

        for (Guesser guesser : guessers)
            System.out.println(guesser.getGuesserName() + " arvasi oikean numeron " +
                    guesser.getGuesses() + " yrityksen jälkeen!");
    }
}
