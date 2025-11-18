import javax.swing.JFrame;
import javax.swing.JLabel;  
import javax.swing.JPanel; 
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;


import javax.swing.ImageIcon;

public class Blackjack{

   static JFrame frame; 

    private class Card{
        String suit;
        String rank;
        String value;

        Card(){
            this.suit = suit;
            this.rank = rank;
            this.value = value;
        }
    }

    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> dealerHand = new ArrayList<Card>();

    String[] suit = {"D" , "A" , "C" , "S"};
    String[] rank = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" ,"K" ,"Q" ,"J" ,"A"};
    String[] value = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10", "10" , "10" , "11"};


    static void createFrame(){

        Color darkGreen = new Color(0, 100, 0);

        frame = new JFrame("Blackjack");
        frame.setSize(650,600);
        frame.setLocation(0,0);
        frame.setLayout(null);

        ImageIcon image = new ImageIcon("logo.png");

        frame.setIconImage(image.getImage());

        JPanel panel = new JPanel();
        
        panel.setBackground(darkGreen);
        panel.setBounds(0,0,650,600);
        panel.setLayout(null);

        ImageIcon hiddenCard = new ImageIcon
        ("cards/playing-cards-master/playing-cards-master/back_light.png");

        Image scaledImage = hiddenCard.getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel hiddenLabel = new JLabel(scaledIcon);
        hiddenLabel.setBounds(320, 320 , 120, 160);

        panel.add(hiddenLabel);

        frame.add(panel);
        
        frame.setVisible(true);

        // Creates own colour using RGB scene
    }

    public static void main(String[] args){
        createFrame();



        
    }

    }

   