package mainpackage;

public class GuessMaster {

    public GuessMaster(){ }

    private class Memento {
        private final int correctNumber;

        public Memento(int num){
            correctNumber = num;
        }

        public int getCorrectNumber(){
            return correctNumber;
        }
    }

    public void joinGame(Guesser guesser){
        guesser.getNumberFromMaster(new Memento((int) Math.round(Math.random() * 100)));
    }

    public synchronized void checkNumber(Guesser guesser, int guess){
        Memento guesserMemento = (Memento) guesser.giveMementoToMaster();

        if(guesserMemento.getCorrectNumber() == guess) {
            System.out.println("\u001B[32m" + guesser.getGuesserName() + " arvauksesi " + guess + " on oikein!" + "\u001B[0m");
            System.out.println(guesser.getGuesserName() + " on lopettanut arvaamisen " + guesser.getGuesses() + " yrityksen jälkeen!\n");
            guesser.stopGuessing();
        }else
            System.out.println(guesser.getGuesserName() + " arvauksesi " + guess + " on väärin!\n");
    }
}
