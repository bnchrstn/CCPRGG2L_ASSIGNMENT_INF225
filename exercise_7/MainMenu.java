import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    MainMenu() {

        JLabel imageLabel = new JLabel();
        ImageIcon snekImage = new ImageIcon("snek.jpg");
        imageLabel.setIcon(snekImage);
        this.add(imageLabel);

        JButton startButton = new JButton();
        startButton.setText("Start Game");
        startButton.setFont(new Font ("Arial", Font.BOLD,  15));
        this.add(startButton);
        
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(645, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new ColorMenu();
            dispose();
        }

    }
    
}
