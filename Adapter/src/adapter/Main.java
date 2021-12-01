package adapter;

/**
 * @author  Kimi Huhtala
 */

public class Main {
    public static void main(String[] args){
        Muoto shape = new MuotoViiva(50, 50, 100);
        shape.boundingBox();
        shape.draw();
        shape = new MuotoYmpyrä(90, 70, 200);
        shape.boundingBox();
        shape.draw();
        shape = new MuotoSuorakulmio(20, 20, 200, 200);
        shape.boundingBox();
        shape.draw();
    }
}