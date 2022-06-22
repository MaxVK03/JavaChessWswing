package javadevclassobj;

public class GameStatsData
{
    //Declares all fields
    private int Player1;
    private int Player2;
    private int winner;
    private int Moves;
    private String Ending;
    private int ID;
     
    //constructor of the class
    public GameStatsData(int p1ID, int p2ID, int winnerID, int GameMoves, String EndType, int GameID)
    {
        //Sets the this classes fields to the paremters passed in
        Player1 = p1ID;
        Player2 = p2ID;
        winner = winnerID;
        Moves = GameMoves;
        Ending = EndType;
        ID = GameID;           
    }
    //returns player 1 ID
    public int getPlayer1()
    {
        return Player1;
    }
    //returns player 2's ID
    public int getPlayer2()
    {
        return Player2;
    }
    
    //returns the ending type
    public String getEndings()
    {
        return Ending;
    }
    //the two string of Game stats data
    public String GameStatsDataToString()
    {
        //constructs the string
        String GMStatsString = ("Player 1 ID = " + Player1 + " | Player 2 ID = " + Player2 + " | winnerID = " + winner + " | Game moves = " + Moves + " | Endtype = " + Ending
                + " | GameID = " + ID);
        //returns the string
        return GMStatsString;
    }
    //Takes in a integer
    public String SpecificGameStatsDataToString(int n)
    {
        //sets up a default return
        String SpecGMStatsString = "";
        //sees if the n is equal to the ID passed in
        if (n==ID)
        {
            //Adds neccasarey data to the string
            SpecGMStatsString = ("Player 1 ID = " + Player1 + " | Player 2 ID = " + Player2 + " | winnerID = " + winner + " | Game moves = " + Moves + " | Endtype = " + Ending
                + " | GameID = " + ID);
        }
        //returns the string
        return SpecGMStatsString;
    }
    
    
}
