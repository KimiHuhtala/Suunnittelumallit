package mainpackage;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

    public class MuodostaKello implements Observer {

        private Kello kello = new Kello();
        private JLabel label = new JLabel();
        private JButton button = new JButton("Aloita/Lopeta");
        private static JFrame frame = new JFrame("Kello");

        public MuodostaKello() {
            this.mountDisplay();
            kello.addObserver(this);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MuodostaKello main = new MuodostaKello();
                }
            });
        }
        // Sovelluksen layout

        public void mountDisplay() {
            JPanel panel = new JPanel();

            panel.add(label);
            panel.add(button);
            panel.setLayout(new FlowLayout(FlowLayout.CENTER));

            label.setFont(new Font("Arial", Font.ITALIC, 25));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.setResizable(false);
            frame.setBounds(200, 200, 500, 110);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            button.addActionListener(new Napinpainallus());
            label.setText(kello.getTime());
        }

        @Override
        public void update(Observable arg0, Object arg1) {
            System.out.println("Aika on: " + arg1);
            label.setText((String) arg1);
        }
    }