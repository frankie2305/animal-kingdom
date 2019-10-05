package app;

import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {

        Jungle jungle;

        public App() {
            setPreferredSize(new Dimension(960, 720));
            jungle = new Jungle();
        }

        @Override
        public void paint(Graphics g) {
            jungle.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App app = new App();
        this.setContentPane(app);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
    
}