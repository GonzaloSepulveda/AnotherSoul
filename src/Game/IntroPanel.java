package Game;

import Characters.randomSetters;
import FileManagement.writeJson;
import Functions.socialClass;
import gameEvents.beingBorn;

import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JFrame {

    public static void generateIntroFrame(JFrame screen) {
        socialClass.chooseCharacter();
        randomSetters.getRandomLegacyName();
        beingBorn.bornMessage();
        String[] socialClass = {"peasant","peasant","peasant","peasant","peasant",
                "peasant","peasant","peasant","peasant","peasant",
                "peasant","peasant","peasant","peasant","peasant",
                "crafter","crafter","crafter","crafter","crafter",
                "crafter","crafter","crafter","crafter","crafter",
                "burgher","burgher","burgher","burgher","burgher",
                "noble","noble","noble","king","king"};
        screen.setTitle("Intro");
        JLayeredPane layeredPane = new JLayeredPane();
        ImageIcon backgroundIcon = new ImageIcon("Images/Backgrounds/BackgroundColour.png");
        JLabel backgroundLabel = new JLabel(backgroundIcon);
        backgroundLabel.setBounds(0, 0, 1280, 720);

        JLabel textLabel = new JLabel("<html>A " +
                socialClass[writeJson.checkJsonInt("character")] +
                " has been born under the banner of " + writeJson.checkJsonString("legacy") + "!</html>"  );
        textLabel.setBounds(500, 100, 500, 100);

        // Set text color to beige
        textLabel.setForeground(new Color(245, 245, 220));

        // Set font size to 20
        Font labelFont = textLabel.getFont();
        textLabel.setFont(new Font(labelFont.getName(), Font.PLAIN, 16));

        layeredPane.add(backgroundLabel, Integer.valueOf(0));
        layeredPane.add(textLabel, Integer.valueOf(1));

        screen.setContentPane(layeredPane);

        screen.setSize(1280, 720);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        generateIntroFrame(frame);
    }
}
