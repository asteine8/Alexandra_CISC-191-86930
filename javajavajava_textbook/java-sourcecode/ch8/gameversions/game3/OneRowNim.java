import javax.swing.JFrame;

public class OneRowNim extends TwoPlayerGame implements Playable
{   public static final int MAX_PICKUP = 3;
    public static final int MAX_STICKS = 11;
    
    private int nSticks = MAX_STICKS;
    private KeyboardReader kb;
    private JFrame gui;

    public OneRowNim()
    {
    } //OneRowNim() constructor1
    public OneRowNim(int sticks)
    {   nSticks = sticks;
    }  // OneRowNim() constructor2
    public OneRowNim(int sticks, int starter)
    {   nSticks = sticks;
        setPlayer(starter);
    }  // OneRowNim() constructor3
    public String getRules() {
        return "\n*** The Rules of One Row Nim ***\n" +
        "(1) A number of sticks between 7 and " + MAX_STICKS + " is chosen.\n" + 
        "(2) Two players alternate making moves.\n" + 
        "(3) A move consists of subtracting between 1 and\n\t" + 
            MAX_PICKUP + " sticks from the current number of sticks.\n" + 
        "(4) A player who cannot leave a positive\n\t" + 
        " number of sticks for the other player loses.\n";
    }
    public boolean takeSticks(int num)
    {   if (num < 1 || num > MAX_PICKUP || num > nSticks) 
	    return false;                // Error
        else                             // Valid move
        {   nSticks = nSticks - num;
            return true;
	} //else
    }//takeSticks
    public int getSticks()
    {   return nSticks;
    } //getSticks
    public String report()
    {   return ("\nNumber of sticks left: " + getSticks()
		+ "\nNext turn by player " + getPlayer() + "\n");
    }   // report()

    /** From TwoPlayerGame */
    public boolean gameOver()
    {   return (nSticks <= 0);
    } // gameOver()

    /** From TwoPlayerGame */
    public int getWinner()
    {   if (nSticks < 1) 
	    return getPlayer();
        else return 0;         // Game is not over
    } // getWinner()

    public void play(GameGUI gui) {
        this.gui = gui;
        gui.callBack(this);
    }

    /** From Playable interface */
    public void play(KeyboardReader reader) {
        kb = reader;
        kb.display(getRules());
	while(!gameOver())
        {   kb.prompt(report());               // Prompt the user
	    kb.prompt("You can pick up between 1 and " + Math.min(MAX_PICKUP,nSticks) + " :");
	    int sticks = kb.getKeyboardInteger(); // Get move
	    if (takeSticks(sticks))   
                changePlayer(); // Do move
	    kb.display("\n");
        } // while
	kb.display(report());  // The game is now over
	kb.display("Game won by player " + getWinner() + "\n");
    }

    private String prompt() {
        return "\nYou can pick up between 1 and " + Math.min(MAX_PICKUP,nSticks);
    }

    public String move(String s) {
        int sticks = Integer.parseInt(s);
        if (takeSticks(sticks)) {
            changePlayer();
            if (gameOver()) {
                return report() + "\nGame won by player" + getWinner() + "\n";
	    } else {
                return report() + prompt();
	    }
	}
        return "\nOops. " + sticks + " is an illegal move." + prompt();
    }

    /**
     * A OneRowNim Keyboard Application Program
     */
    public static void main(String args[]) {
	//        KeyboardReader kb = new KeyboardReader();
	//        OneRowNim nim = new OneRowNim(OneRowNim.MAX_STICKS);
	//        nim.play(kb);
	//        OneRowNimGUI gui = new OneRowNimGUI("One Row Nim Game");
	//        nim.play(gui);        
    }
} // OneRowNim class
