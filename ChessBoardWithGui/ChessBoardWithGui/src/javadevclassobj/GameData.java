package javadevclassobj;

/**
 *
 * @author Max
 */
public class GameData
{
    //declares all fields
    private int GameID;
    private int PlayerID;
    private int MoveNumber;
    private String Move;
    private int MoveID;
    private static int GNO = 1;
    
    //constructs the Game Data objects
    public GameData(int GmID, int PlayerID, int MoveNO, String Movement,int GMMOveID)
    {
        //sets this Classes attributes to the attributes passed in
        GameID = GmID;
        this.PlayerID = PlayerID;
        MoveNumber = MoveNO;
        Move = Movement;
        MoveID = GMMOveID;
                
    }   
    //Used to obtain the move
    public String getMove()
    {
        return Move;
    }
    //used to obtain the move number
    public int getMoveNo()
    {
        return MoveNumber;
    }
    //used to obtain the game ID
    public int getGameID()
    {
        return GameID;
    }
    //convertes the game data to a string which can be interpretud by users
    public String GameDataToString()
    {
        //constructs the string
        String out = ("PlayerID = " + PlayerID + " | Move Number = " + MoveNumber + " | " + Move);
        //returns the string
        return out;
    }
    
    
    
    
}
