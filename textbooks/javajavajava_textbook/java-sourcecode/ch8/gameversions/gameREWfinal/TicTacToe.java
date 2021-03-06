public class TicTacToe extends TwoPlayerGame implements CLUIPlayable
{   public static final String BLANK = " ";
    public final int DRAW = 0;
    private String one = BLANK, two = BLANK, three = BLANK, four = BLANK, five = BLANK, six = BLANK,
	seven = BLANK, eight = BLANK, nine = BLANK;
    private int winner;

    public TicTacToe() { 
    }

    public String getRules() {
        return "\n*** The Rules of Tic Tac Toe ***\n" +
	    "                 1 2 3\n" +
	    "                 4 5 6\n" +
	    "                 7 8 9\n" +
	    "Player 1 is X and player 2 is O\n";
    }

    public String getSquare(int n)
    {   switch (n)
        {   case 1: return one;
	          case 2: return two;
	          case 3: return three;
	          case 4: return four;
	          case 5: return five;
	          case 6: return six;
	          case 7: return seven;
	          case 8: return eight;
	          case 9: return nine;
	      }//switch
	      return "";
    }

    public String getWinner() {
        if (winner == 0)
	          return "It's a draw!\n";
        return "Player " + winner;
    }

    public String reportState() {
        return  "\n" +
            one + " | " + two + " | " + three + "\n" +
            "----------\n" +
	    four + " | " + five + " | " + six + "\n" +
            "----------\n" +
	    seven + " | " + eight + " | " + nine + "\n";
    }

    public String prompt() {
        return "\nPlayer " + getPlayer() + ": Type in an empty square, 1 to 9 :  ";
    }

    public String move(String s)
    {   int square = Integer.parseInt(s);
        String mark="";
        if (getPlayer()==PLAYER_ONE)
            mark = "X";
      	else
	          mark = "O";
        if (makeLegalMove(square,mark))
        {   String str = "Player " + getPlayer() + " puts a " +
                mark + " at square " + square + "\n";
            changePlayer();
            return str;
	      } //if
        return "Oops. " + square + " is an illegal move.\n";
    }

    public boolean gameOver() {
        return xWins() || oWins() || itsADraw();
    }

    private boolean itsADraw() {
        for (int k = 0; k<= 9; k++) 
            if (getSquare(k).equals(BLANK))
		            return false;
        winner = DRAW;
	      return true;
    }

    private boolean xWins()
    {if (one.equals("X") && one.equals(two) && two.equals(three) ||
	    four.equals("X") && four.equals(five) && five.equals(six) ||
	    seven.equals("X") && seven.equals(eight) && eight.equals(nine) ||
	    one.equals("X") && one.equals(five) && five.equals(nine) ||
      one.equals("X") && one.equals(four) && four.equals(seven) ||
	    two.equals("X") && two.equals(five) && five.equals(eight) ||
	    three.equals("X") && three.equals(six) && six.equals(nine) ||
	    three.equals("X") && three.equals(five) && five.equals(seven))
     { winner = PLAYER_ONE;
	     return true;
     } //if
	   return false;
    }

     private boolean oWins() {
        if (one.equals("O") && one.equals(two) && two.equals(three) ||
	    four.equals("O") && four.equals(five) && five.equals(six) ||
	    seven.equals("O") && seven.equals(eight) && eight.equals(nine) ||
	    one.equals("O") && one.equals(five) && five.equals(nine) ||
      one.equals("O") && one.equals(four) && four.equals(seven) ||
	    two.equals("O") && two.equals(five) && five.equals(eight) ||
	    three.equals("O") && three.equals(six) && six.equals(nine) ||
	    three.equals("O") && three.equals(five) && five.equals(seven))
      {   winner = PLAYER_TWO;
	        return true;
	    } //if
	    return false;
    }


    public boolean makeLegalMove(int m, String s)
    { switch(m)
      { case 1: if (one.equals(BLANK)) {one = s; return true; } break;
        case 2: if (two.equals(BLANK)) {two = s; return true;}; break;
        case 3: if (three.equals(BLANK)) {three = s; return true; } break;
        case 4: if (four.equals(BLANK)) {four = s; return true; } break;
        case 5: if (five.equals(BLANK)) {five = s; return true; } break;
        case 6: if (six.equals(BLANK)) {six = s; return true; } break;
        case 7: if (seven.equals(BLANK)) {seven = s; return true; } break;
        case 8: if (eight.equals(BLANK)) {eight = s; return true; } break;
        case 9: if (nine.equals(BLANK)) { nine = s; return true; } break;
      } //switch
        return false;
    }

    public static void main(String args[]) {
        TicTacToe game = new TicTacToe();
        CLUIGamePlayer gp = new CLUIGamePlayer(game);
        gp.play();

        System.out.println("\n\n\n\nNow play person versus computer");
        game = new TicTacToe();
        ComputerPlayable cp = (ComputerPlayable)(new TicTacToePlayer(game));
        gp = new CLUIGamePlayer(game,cp);
        gp.play();
    } //main()

}
