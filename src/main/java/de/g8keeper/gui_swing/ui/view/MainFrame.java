package de.g8keeper.gui_swing.ui.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;


    private JPanel mainPanel;
    private JButton welcomeBtn;
    private JTextArea welcomeTA;

    public JButton getWelcomeBtn() {
        return welcomeBtn;
    }

    public JTextArea getWelcomeTA() {
        return welcomeTA;
    }

    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    public void addWindowListener() {

    }
}
