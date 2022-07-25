import java.util.ArrayList;

/** Polina Chetnikova CS110 Final Project Spring 2022
 *  Fleet is an array of Ship objects
 */
public class Fleet {
    //initialize instance variables
    private Ship battleShip;
    private Ship aircraftCarrier;
    private Ship cruiser;
    private Ship sub;
    private Ship destroyer;

    /** Fleet constructor initializes Ship fields
     */
    public Fleet(){
        battleShip = new Battleship();
        aircraftCarrier = new AircraftCarrier();
        cruiser = new Cruiser();
        sub = new Sub();
        destroyer = new Destroyer();
    }

    /** updateFleet accepts any type of ShipType object and returns
     *  the status of the ship, if it has sunk or not
     *  @param st object of ShipType from enum class
     *  @return T or F whether the ship was hit
     */
    public boolean updateFleet(ShipType st){
        switch(st) {
            case ST_SUB:
                return sub.hit();

            case ST_CRUISER:
                return cruiser.hit();

            case ST_AIRCRAFT_CARRIER:
                return aircraftCarrier.hit();

            case ST_DESTROYER:
                return destroyer.hit();

            case ST_BATTLESHIP:
                return battleShip.hit();

            default:
                return false;
        }
    }

    /** gameOver() returns a boolean value to detect end of game
     *  Battleship ends when one player's whole fleet is sunk
     *  @return T or F if game is over
     */
    public boolean gameOver(){
          if (battleShip.getSunk() && aircraftCarrier.getSunk() &&
                cruiser.getSunk() && sub.getSunk() && destroyer.getSunk())
                return true;
          else
              return false;
     }
}
