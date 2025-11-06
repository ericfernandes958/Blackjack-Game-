import javax.swing.JFrame;
import javax.swing.JLabel;  
import javax.swing.JPanel; 
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.FlowLayout;


import javax.swing.ImageIcon;

public class Blackjack{

   static JFrame frame; 

    static void createFrame(){
        frame = new JFrame("Blackjack");
        frame.setSize(650,600);
        frame.setLocation(0,0);
        frame.setLayout(null);

        ImageIcon image = new ImageIcon("logo.png");

        frame.setIconImage(image.getImage());

        JPanel panel = new JPanel();
        
        panel.setBounds(0,0,650,600);
        panel.setLayout(null);

        ImageIcon hiddenCard = new ImageIcon
        ("cards/playing-cards-master/playing-cards-master/back_light.png");

        Image scaledImage = hiddenCard.getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel hiddenLabel = new JLabel(scaledIcon);
        hiddenLabel.setBounds(0, 0, 120, 160);

        panel.add(hiddenLabel);

        frame.add(panel);
        
        frame.setVisible(true);

        // Creates own colour using RGB scene




        }

    public static void main(String[] args){
        createFrame();

        
    }

    }

   