import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGUI extends JFrame implements ActionListener, UserInterface
{   private JTextArea display;
    private JTextField inField;
    //    private TwoPlayerGame game;    // Generic game;
    private Game game;    // Generic game;
    private JMenuBar mBar = new JMenuBar();
    private JMenu playMenu = new JMenu("Play");
    private JMenuItem nimItem, multItem, nWayItem;    

    public GameGUI(String title)
    {   buildGUI();
        buildMenuBar();
        setTitle(title);
        pack();
        setVisible(true);
     } // GameGUI()

    //    public void callBack(TwoPlayerGame game) {
    public void callBack(Game game) {
        this.game = game;
	display.setText(game.getRules());
        display.append(((Playable)game).report());
        display.append(((Playable)game).prompt());
    }
   
    private void buildMenuBar() {
        mBar.add(playMenu);
        nimItem = new JMenuItem("OneRowNim");
        nimItem.addActionListener(this);
        multItem = new JMenuItem("MultiplicationGame");
        multItem.addActionListener(this);
        nWayItem = new JMenuItem("NWayMultiplication");
        nWayItem.addActionListener(this);
  	playMenu.add(nimItem);
        playMenu.add(multItem);
        playMenu.add(nWayItem);
        this.setJMenuBar(mBar);
    }

    private void buildGUI()
     {   Container contentPane = getContentPane();
         contentPane.setLayout(new BorderLayout());
         display = new JTextArea(20,30);
         JScrollPane scroll = new JScrollPane(display);
         inField = new JTextField(10);
         inField.addActionListener(this);
         JPanel inputPanel = new JPanel();
         inputPanel.add(new JLabel("Input: "));
         inputPanel.add(inField);
	 //         contentPane.add("Center", display);
         contentPane.add("Center", scroll);
         contentPane.add("South", inputPanel);
     } // buildGUI

     public void actionPerformed(ActionEvent e) {   
	 if (e.getSource() == nimItem) {
             game = new OneRowNim();
             ((Playable) game).play(this);
             inField.setEnabled(true);
	 } 
	 if (e.getSource() == multItem) {
             game = new MultiplicationGame();
             ((Playable) game).play(this);
             inField.setEnabled(true);
	 } 
	 if (e.getSource() == nWayItem) {
             game = new NWayMultiplication();
             ((Playable) game).play(this);
             inField.setEnabled(true);
	 } 
         
	 if (e.getSource() == inField)
         {   String s = game.move(inField.getText());
             inField.setText("");
             display.append(s);
             if (game.gameOver()) 
		 inField.setEnabled(false);
         } //if
     } //actionPerformed()

    /** From the UserInterface interface */

    public String getUserInput(){ return ""; }

    public void report (String s) {
        display.append(s);
    }
    public void prompt (String s) {
        display.append(s);
    }

    public static void main(String args[]) {
        GameGUI gui = new GameGUI("GamePlayerGUI");
    }
} // GameGUI
