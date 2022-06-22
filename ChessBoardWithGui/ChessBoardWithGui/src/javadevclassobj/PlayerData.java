package javadevclassobj;


public class PlayerData
{
    //Field
    private String Pname;
    private String PDOB;
    private int PWins;
    private int PLosses;
    private int PDraws;
    private int PID;
    
    //constructor which includes a Player ID
    public PlayerData(String Name, String DOB, int wins, int losses, int draws, int ID)
    {
        //sets this classes fields to the parameters
        Pname = Name;
        PDOB = DOB;
        PWins = wins;
        PLosses = losses;
        PDraws = draws;
        PID = ID;
    }
    //constructor which does not includes a Player ID
    public PlayerData(String Name, String DOB, int wins, int losses, int draws)
    {
        //sets this classes fields to the parameters
        Pname = Name;
        PDOB = DOB;
        PWins = wins;
        PLosses = losses;
        PDraws = draws;
        //PID = ID;
    }
    //returns the player name
    public String getPlayerName()
    {
        return Pname;
    }
    //returns the player Date of birth
    public String getPDOB() {
        return PDOB;
    }
    //returns the players wins
    public int getPWins() {
        return PWins;
    }
    //returns the players losses
    public int getPLosses() {
        return PLosses;
    }
    //returns the players draws
    public int getPDraws() {
        return PDraws;
    }
    //returns the players ID
    public int getPlayerID()
    {
        return PID;
    }
    //returns the player data as a string
    public String PlayerDataToString()
    {
        //constructs the string to return
        String out = (Pname + " " + PWins + "-" + PLosses + "-" + PDraws);
        //returns the string
        return out;
    }
            
            
 }
