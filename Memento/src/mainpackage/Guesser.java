package mainpackage;

public class Guesser extends Thread{

    private GuessMaster master;
    private Object memento;
    private final String name;
    private int guesses;

    private volatile boolean guessing;

    public Guesser(String name, GuessMaster master){
        this.name = name;
        this.master = master;
        guesses = 0;
        guessing = true;
    }

    public void getNumberFromMaster(Object memento){
        this.memento = memento;
    }

    public void guessNumber(int num){
        guesses++;
        master.checkNumber(this, num);
    }

    public Object giveMementoToMaster(){
        return memento;
    }

    public String getGuesserName() {
        return name;
    }

    public int getGuesses(){
        return guesses;
    }

    @Override
    public void run() {
        master.joinGame(this);
        System.out.println(name + " on aloittanut arvaamaan!");
        while(guessing){
            int guess = (int)Math.round(Math.random() * 100);
            guessNumber(guess);

            try{ Thread.sleep(Main.SLEEP_TIME); }
            catch (Exception e){ e.printStackTrace(); }
        }
    }

    public void stopGuessing(){
        guessing = false;
    }
}
