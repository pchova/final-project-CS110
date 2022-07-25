import hwAssignments.Tweet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/** Polina Chetnikova CS110 Final Project Spring 2022
 *  Board class initializes layout, initially setting all cells
 *  to CellStatus.NOTHING. Gets information from file and add
 *  ships to the layout. Initializes Fleet
 */
public class Board {
    private static ArrayList<ArrayList<CellStatus>> layout;
    private Fleet fleet;
    public static final int SIZE = 10;

    /**
     * Board constructor initializes layout, initially setting
     * all cells to CellStatus.NOTHING. Gets information
     * from file and add ships to the layout. Initializes Fleet
     */

    public Board(String strMoves) throws IOException {
        //initialize AL of AL to have 10 rows
        layout = new ArrayList<ArrayList<CellStatus>>(SIZE);

        //create n lists one by one and append to the master list
        ArrayList<CellStatus> r1 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r1.add(CellStatus.NOTHING);
        }
        layout.add(r1);

        ArrayList<CellStatus> r2 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r2.add(CellStatus.NOTHING);
        }
        layout.add(r2);

        ArrayList<CellStatus> r3 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r3.add(CellStatus.NOTHING);
        }
        layout.add(r3);

        ArrayList<CellStatus> r4 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r4.add(CellStatus.NOTHING);
        }
        layout.add(r4);

        ArrayList<CellStatus> r5 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r5.add(CellStatus.NOTHING);
        }
        layout.add(r5);

        ArrayList<CellStatus> r6 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r6.add(CellStatus.NOTHING);
        }
        layout.add(r6);

        ArrayList<CellStatus> r7 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r7.add(CellStatus.NOTHING);
        }
        layout.add(r7);

        ArrayList<CellStatus> r8 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r8.add(CellStatus.NOTHING);
        }
        layout.add(r8);

        ArrayList<CellStatus> r9 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r9.add(CellStatus.NOTHING);
        }
        layout.add(r9);

        ArrayList<CellStatus> r10 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r10.add(CellStatus.NOTHING);
        }
        layout.add(r10);

        //gets info from  user file and adds ships to the layout
        String lineFromFile = null;
        Scanner scan = new Scanner(new File(strMoves));

        while (scan.hasNext()){
            lineFromFile = scan.nextLine();

            char type;
            String pos1, pos2;

            String[] splitLine = lineFromFile.split("\\s+");
            type = splitLine[0].charAt(0);

            pos1 = splitLine[1];
            pos2 = splitLine[2];

            System.out.println(type);
            System.out.println(pos1);
            System.out.println(pos2);

            //case if type is ABCDS
            switch(type) {
                case 'A':
                    Move aircraft1 = new Move(pos1);
                    Move aircraft2 = new Move(pos2);

                    layout.get(aircraft1.row()).set(aircraft2.col(), CellStatus.AIRCRAFT_CARRIER);
                case 'B':
                    Move battleship1 = new Move(pos1);
                    Move battleship2 = new Move(pos2);

                    layout.get(battleship1.row()).set(battleship2.col(), CellStatus.BATTLESHIP);
                case 'C':
                    Move cruiser1 = new Move(pos1);
                    Move cruiser2 = new Move(pos2);

                    layout.get(cruiser1.row()).set(cruiser1.col(), CellStatus.CRUISER);
                case 'D':
                    Move destroyer1 = new Move(pos1);
                    Move destroyer2 = new Move(pos2);

                    layout.get(destroyer1.row()).set(destroyer2.col(), CellStatus.DESTROYER);
                case 'S':
                    Move sub1 = new Move(pos1);
                    Move sub2 = new Move(pos2);

                    layout.get(sub1.row()).set(sub2.col(), CellStatus.SUB);
            }
        }
        scan.close();

        //gets info from computer file and adds ships to the layout
        String readLineFromFile = null;
        Scanner scan2 = new Scanner(new File("ComputerBoard.txt"));

        while (scan.hasNext()){
            readLineFromFile = scan.nextLine();

            char type;
            String pos1, pos2;

            String[] splitLine = readLineFromFile.split("\\s+");
            type = splitLine[0].charAt(0);

            pos1 = splitLine[1];
            pos2 = splitLine[2];

            System.out.println(type);
            System.out.println(pos1);
            System.out.println(pos2);

            switch(type) {
                case 'A':
                    Move aircraft1 = new Move(pos1);
                    Move aircraft2 = new Move(pos2);

                    layout.get(aircraft1.row()).set(aircraft2.col(), CellStatus.AIRCRAFT_CARRIER);
                case 'B':
                    Move battleship1 = new Move(pos1);
                    Move battleship2 = new Move(pos2);

                    layout.get(battleship1.row()).set(battleship2.col(), CellStatus.BATTLESHIP);
                case 'C':
                    Move cruiser1 = new Move(pos1);
                    Move cruiser2 = new Move(pos2);

                    layout.get(cruiser1.row()).set(cruiser1.col(), CellStatus.CRUISER);
                case 'D':
                    Move destroyer1 = new Move(pos1);
                    Move destroyer2 = new Move(pos2);

                    layout.get(destroyer1.row()).set(destroyer2.col(), CellStatus.DESTROYER);
                case 'S':
                    Move sub1 = new Move(pos1);
                    Move sub2 = new Move(pos2);

                    layout.get(sub1.row()).set(sub2.col(), CellStatus.SUB);
            }
        }
        scan2.close();

        //initializes fleet constructor creates a new ship object for all types
        Fleet fleet = new Fleet();
    }

    /** Applies a move to layout. If the targeted cell does not contain a ship, it is set to
     *  CellStatus.NOTHING_HIT. If it contains a ship, the cell is changed from, for instance,
     *  CellStatus.SUB to CellStatus.SUB_HIT.
     *  @param m
     *  @return the original CellStatus of the targeted cell
     */
   public CellStatus applyMoveToLayout(Move m){

       if (layout.get(m.row()).get(m.col()) == CellStatus.AIRCRAFT_CARRIER) {
           layout.get(m.row()).set(m.col(), CellStatus.AIRCRAFT_CARRIER_HIT);
           return CellStatus.AIRCRAFT_CARRIER_HIT;

       }else if (layout.get(m.row()).get(m.col()) == CellStatus.BATTLESHIP) {
           layout.get(m.row()).set(m.col(), CellStatus.BATTLESHIP_HIT);
           return CellStatus.BATTLESHIP_HIT;

       }else if (layout.get(m.row()).get(m.col()) == CellStatus.CRUISER) {
           layout.get(m.row()).set(m.col(), CellStatus.CRUISER_HIT);
           return CellStatus.CRUISER_HIT;

       }else if (layout.get(m.row()).get(m.col()) == CellStatus.DESTROYER) {
           layout.get(m.row()).set(m.col(), CellStatus.DESTROYER_HIT);
           return CellStatus.DESTROYER_HIT;

       }else if (layout.get(m.row()).get(m.col()) == CellStatus.SUB) {
           layout.get(m.row()).set(m.col(), CellStatus.SUB_HIT);
           return CellStatus.SUB_HIT;

       }else
           return CellStatus.NOTHING_HIT;
   }

    /** Takes a move as a parameter and determines if the spot is available
     *  @param m
     *  @return T or False to know if spot is open
     */
    public boolean moveAvailable(Move m){
        if (layout.get(m.row()).get(m.col()) == CellStatus.NOTHING)
            return true;
        else
            return false;
    }

    /** Returns a reference to the layout (not a deep copy!)
     * @return ref to layout
     */
    public ArrayList<ArrayList<CellStatus>> getLayout(){
        return layout;
    }

    /** Returns a reference to the Fleet object
     * @return deep copy of a Fleet
     */
    public Fleet getFleet(){
        return fleet;
    }

    /** Returns true if all ships have been sunk, false otherwise.
     * @return T or F if game is over
     */
    public boolean gameOver(){
        if (fleet.gameOver() == true)
            return true;
        return false;
    }
}

