package de.g8keeper.gui_swing.ui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import de.g8keeper.gui_swing.ui.view.MainFrame;

public class MainFrameController {

    private MainFrame mainFrame;
    private JButton welcomeBtn;
    private JTextArea welcomeTA;

    public MainFrameController(){
        initComponents();
        initListeners();

    }

    public void showMainFrameWindow(){
        mainFrame.setVisible(true);
    }

    private void initListeners() {
        welcomeBtn.addActionListener(new WelcomeBtnListener());
//        welcomeBtn.addActionListener(e -> welcomeTA.append("Welcome IntelliJ EDEA Swing Creator!!!\n"));
        mainFrame.addWindowListener(new MainWindowListener());
        mainFrame.addWindowStateListener(new MainWindowStateListener());
    }

    private void initComponents() {
        mainFrame = new MainFrame();

        welcomeBtn = mainFrame.getWelcomeBtn();
        welcomeTA = mainFrame.getWelcomeTA();
    }

    private class MainWindowStateListener implements WindowStateListener{

        @Override
        public void windowStateChanged(WindowEvent e) {
            System.out.println("MainWindowStateListener: windowStateChanged: " + e);
        }
    }


    private class MainWindowListener implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("MainWindowListener: windowOpened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("MainWindowListener: windowClosing: " + e);

            int res = JOptionPane.showConfirmDialog(mainFrame,"Soll das Programm geschlossen werden?","Programm beenden",JOptionPane.YES_NO_OPTION );

            if (res == 0) System.exit(0);

        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("MainWindowListener: windowClosed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("MainWindowListener: windowIconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("MainWindowListener: windowDeiconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("MainWindowListener: windowActivated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("MainWindowListener: windowDeactivated");
        }
    }

    private class WelcomeBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            welcomeTA.append("Welcome IntelliJ EDEA Swing Creator!!!");
        }
    }
}
