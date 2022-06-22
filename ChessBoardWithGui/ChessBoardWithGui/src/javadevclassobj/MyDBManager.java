package javadevclassobj;
//All imports used
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MyDBManager
{
    //sets the connection to null
    private static Connection conn = null;
    //method used to establish a connection to the database
    public MyDBManager()
    {
        
        //Trys to connect to the DataBase
        try
        {
            //attempts to establish a connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://92.205.5.21/PatExDB?useSSL=false&allowPublicKeyRetrieval=true", "PeterWood", "]SNPJHA@zK{R");
            //conn = DriverManager.getConnection("jdbc:mysql://92.205.5.21/PatExDB?useSSL=false&allowPublicKeyRetrieval=true"
            //        + "user=MvKAdmin&password=Sb8bC3zhg#4bekr@");
            //if connection is succsesful outputs appropriate message
            System.out.println("Connected Successfully");
            
            //Alerts user that this is all the data present
            System.out.println("END OF RECORDS");    
        }
        //Occurs if there is a error connecting to the database
        catch (ClassNotFoundException | SQLException e)
        {
            //outputs the error message to user
            System.out.println("ERROR connecting to DB  " + e);
          
        }
    }
    //used to get all the game stats
    public ArrayList<GameStatsData> getAllGameStatsData() 
    {
        //attempts to pass the query message to the Database
        try
        {
            // The query to be executed
            String sql = "SELECT * FROM gamestatsdata";
            System.out.println(sql);
            // Link the SQL to the connected database
            PreparedStatement ps = conn.prepareStatement(sql);
            // Execute the query and store the results in rs
            ResultSet rs = ps.executeQuery();
            //creates a new array to store the Game stats data
            ArrayList arr = new ArrayList<GameStatsData>();
            //happens while it contains more objects
            while (rs.next())
            {
                //creates new variable
                int p1id = rs.getInt("Player_1_ID");
                System.out.println(p1id);
                //creates new variable
                int p2id = rs.getInt("Player_2_ID");
                //creates new variable
                int winid = rs.getInt("Winner_ID");
                //creates new variable
                int moves = rs.getInt("Game_Moves");
                //creates new variable
                String Endtype = rs.getString("EndType");
                //creates new variable
                int gameid = rs.getInt("GameID");
                
                //Creates a new object to store the extracted data
                GameStatsData GSD = new GameStatsData(p1id, p2id, winid, moves, Endtype, gameid);
                //adds the object to the array
                arr.add(GSD);
            }
            
            //returns the array
            return arr;
        
        }
        //catches the error if the message is unnsucsesful
        catch (SQLException sqle)
        {
            //displays a error message
            JOptionPane.showMessageDialog(null, "An error occured!");
            return null;
        }
    }
    //used to get an array of all the game data
    public ArrayList<GameData> getAllGameData() 
    {
        //attempts to connect to the db and pass the appropriate message
        try
        {
            // The query to be executed
            String sql = "SELECT * FROM gamedata";
            System.out.println(sql);
            // Link the SQL to the connected database
            PreparedStatement ps = conn.prepareStatement(sql);
            // Execute the query and store the results in rs
            ResultSet rs = ps.executeQuery();
            //creates a new array to store game data
            ArrayList arr = new ArrayList<GameData>();
            //happens while there is more left in the database
            while (rs.next())
            {
                //creates new variable
                int GmID = rs.getInt("Game_ID");
                //creates new variable
                int PlayerID = rs.getInt("Player_ID");
                //creates new variable
                int MoveNO = rs.getInt("Move_number");
                //creates new variable
                String Movement = rs.getString("Move");
                //creates new variable
                int GMMOveID = rs.getInt("GameMoveID");
                
                //creates a new game data object with the data
                GameData GD = new GameData(GmID, PlayerID, MoveNO, Movement, GMMOveID);
                //adds the object to the array
                arr.add(GD);
            }
            //returns the array
            return arr;
        
        }
        //happens if there is an error
        catch (SQLException sqle)
        {
            //displays the error
            JOptionPane.showMessageDialog(null, "An error occured!");
            return null;
        }   
    }
    //used to obtain player data
    public ArrayList<PlayerData> getAllPlayerData() 
    {
        try
        {
            // The query to be executed
            String sql = "SELECT * FROM PlayerData";
            System.out.println(sql);
            // Link the SQL to the connected database
            PreparedStatement ps = conn.prepareStatement(sql);
            // Execute the query and store the results in rs
            ResultSet rs = ps.executeQuery();
            //declares a new player data array
            ArrayList arr = new ArrayList<PlayerData>();
            //Happens while rs has more data to be read
            while (rs.next())
            {
                //sets the player name
                String Pname = rs.getString("Player_name");
                //sets the Player Date of birth
                String PDOB = rs.getString("DOB");
                //sets the player wins
                int PWins = rs.getInt("Wins");
                //sets player losses
                int PLosses = rs.getInt("Losses");
                //sets player draws
                int PDraws = rs.getInt("Draws");
                //Sets player ID
                int PID = rs.getInt("PlayerID");
                
                //Creates a new player data object
                PlayerData PD = new PlayerData(Pname, PDOB, PWins, PLosses, PDraws, PID);
                //Adds the item to the array
                arr.add(PD);
            }
            //returns the array of PlayerData
            return arr;
        
        }
        catch (SQLException sqle)
        {
            //Outputs an error messages
            JOptionPane.showMessageDialog(null, "An error occured!");
            //Returns nothing
            return null;
        }
    }
    
    //method used to delete players
    public void deletePlayer(int Pid)
    {
        //If no errors occur this happens
        try
        {
            // The query to be executed
            String sql = "DELETE FROM PlayerData WHERE PlayerID = ?";
            //sends in the prepared statement
            PreparedStatement ps = conn.prepareStatement(sql);
            //Sends in the player ID to be deleted
            ps.setInt(1, Pid);
            //executes the statement
            ps.executeUpdate();
        
        }
        //If a error occurs this happens
        catch (SQLException sqle)
        {
            //outputs the appropriate error message
            JOptionPane.showMessageDialog(null, "An error occured deleting the student!");
        }
    }
    //Used to add player datas
    public void addPlayer(PlayerData st)
    {
        //WIll happen if no errors occur
        try
        {
            // The query to be executed
            String sql = "INSERT INTO PlayerData (Player_name, DOB, Wins, Losses, Draws) "
                    + " VALUES (?, ?, ?, ?, ?);";
                 
            //Sends in the prepared statement
                PreparedStatement ps = conn.prepareStatement(sql);
                //Sets the various variables to what it gets out of the table
                ps.setString(1, st.getPlayerName());
                ps.setString(2, st.getPDOB());
                ps.setInt(3, st.getPWins());
                ps.setInt(4, st.getPLosses());
                ps.setInt(5, st.getPDraws());
                //Executes the update
                ps.executeUpdate();
        
        }
        //happens if there are errors
        catch (SQLException sqle)
        {
            //Appropriate error message
            JOptionPane.showMessageDialog(null, "An error occured Adding the student!");
        }
    }
}
