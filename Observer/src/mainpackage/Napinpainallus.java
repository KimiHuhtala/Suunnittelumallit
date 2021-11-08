package mainpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Napinpainallus implements ActionListener {

    private Kello kello = new Kello();
    @Override
    public void actionPerformed(ActionEvent e) {
        if (kello.timer.isRunning()){
            kello.stopClock();
        } else {
            kello.restartClock();
        }
    }
}
