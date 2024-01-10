package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class generarInicio extends JFrame {

    public static void generarMenu(JFrame screen) {
        screen.setSize(1280, 720);
        screen.setLayout(null);

        int buttonHeight = 50;
        int buttonWidth = 120;

        JButton b1 = new JButton("Play");
        JButton b2 = new JButton("Settings");
        JButton b3 = new JButton("Quit");

        b1.setBounds(355, 250, buttonWidth, buttonHeight);
        b2.setBounds(355, 350, buttonWidth, buttonHeight);
        b3.setBounds(355, 450, buttonWidth, buttonHeight);

        screen.add(b1);
        screen.add(b2);
        screen.add(b3);

        JLabel label1 = new JLabel();
        ImageIcon image1 = new ImageIcon("Images/Backgrounds/Background.png");
        label1.setIcon(image1);
        screen.setLayout(new BorderLayout());
        screen.add(label1, BorderLayout.WEST);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.remove(label1);
                screen.remove(b1);
                screen.remove(b2);
                screen.remove(b3);
                screen.repaint();
                IntroPanel.generateIntroFrame(screen);


            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            generarInicio frame = new generarInicio();
            generarMenu(frame);
        });
    }
}
