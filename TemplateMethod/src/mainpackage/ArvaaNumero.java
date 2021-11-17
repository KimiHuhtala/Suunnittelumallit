package mainpackage;

public class ArvaaNumero extends Peli {

    private int randomNum;
    private boolean isDone = false;
    private int winner;

    @Override
    protected void initGame(int playerCount) {
        System.out.println("Valitsit arvaa numero pelin!");
        System.out.println("Arvaa numero 0 ja 10 väliltä!");
        randomNum = (int) Math.round(Math.random() * 10);
    }

    @Override
    protected void play(int player) {
        System.out.println("Pelaaja " + player + " valitse numerosi:");
        int yourNum = Lue.readInt();
        if(yourNum == randomNum){
            System.out.println("Oikein!");
            winner = player;
            isDone = true;
        }else
            System.out.println("Väärin!");
    }

    @Override
    protected boolean endGame() {
        return isDone;
    }

    @Override
    protected void printWinner() {
        System.out.println("Pelaaja " + winner + " voittaa!");
    }
}
