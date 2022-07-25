import static java.lang.Integer.parseInt;

/** Polina Chetnikova CS110 Final Project Spring 2022
 *  Move Class moves an object on the board
 */
public class Move {
    //instance variables
    private int row;
    private int col;

    /** Move constructor accepts two int parameters
     *  @row integer with row number
     *  @col integer with column number
     */
    public Move(int row, int col){
        this.row = row;
        this.col = col;
    }

    /** Move alternate constructor accepts a String position
     *  The first char will be a letter and then rest of the string will contain int.
     *  Retrieve letter and save in char variable letter
     *  xPos = letter |  xPos = letter - 65; casts it from ASCII to an integer
     *  @param strPos A string containing a letter or number
     */
    public Move(String strPos){
        //retrieve letter value from String[0], ASCII - 65 = integer num
        char letter = strPos.charAt(0);
        this.row = letter - 65;


        //parse string to get the num and turn it into an int
        int yPos = parseInt(strPos.substring(1));
        this.col = yPos + 1;
    }

    /** Row() method returns the row position as integer
     */
    public int row(){
        return row;
    }

    /** Col() method returns the column position
     *
     */
    public int col(){
        return col;
    }

    /** toString methods returns a ships next position on the battlefield
     *  @return a String containing the next move by a player
     */
    @Override
    public String toString(){
        //convert row (int) back into letter
        char r = (char)(this.row + 65);

        return String.format("%c%d", r, this.col());
    }
}
