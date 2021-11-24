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

    public void joinGame(Guesser guesser){               // Upon joining game give a random number that needs to be guessed
        guesser.getNumberFromMaster(new Memento((int) Math.round(Math.random() * 100)));
    }

    public synchronized void checkNumber(Guesser guesser, int guess){
        Memento guesserMemento = (Memento) guesser.giveMementoToMaster();   // Cast the Object memento into a Memento

        if(guesserMemento.getCorrectNumber() == guess) {                    // Check if the guess is correct
            System.out.println("\u001B[32m" + guesser.getGuesserName() + " arvauksesi " + guess + " on oikein!" + "\u001B[0m");
            System.out.println(guesser.getGuesserName() + " on lopettanut arvaamisen " + guesser.getGuesses() + " yrityksen jälkeen!\n");
            guesser.stopGuessing();
        }else
            System.out.println(guesser.getGuesserName() + " arvauksesi " + guess + " on väärin!\n");
    }
}
