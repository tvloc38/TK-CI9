import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameWindow extends JFrame {

    GameCanvas canvas;

    public GameWindow() {
        // Setup game window

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("WindowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("WindowClosing");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        this.setSize(600, 800);
        this.setResizable(false);
        this.setTitle("Micro-war");


        // Setup canvas
        canvas = new GameCanvas();
        this.setContentPane(canvas);



        this.setVisible(true); // sau cung
    }
}
