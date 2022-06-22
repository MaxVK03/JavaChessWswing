
package javadevclassobj;
//all the needed imports
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author maxvo
 */





//Declares the class
public class BoardPanel extends JPanel implements MouseListener 
{
    //Declares the Array of pieces
    protected ArrayList<Pieces> PieceArr = new ArrayList<Pieces>(); 
    //Declares the number of rows attribute
    public static final int ROWS = 8; 
    //declares the number of Colums attribute
    public static final int COLS = 8; 
    //Number of clicks, not used in program but in testing
    int numClicks = 0; 
    //A variable that stores the piece object to move
    Pieces toMove = null;   
    //A variable that keeps track of whether or not a piece is selected
    boolean pieceIsSelected = false; 
    //Stores the piece object that is selected
    Pieces selected = null; 
    //Keeps track of which players turn it is
    private boolean YellowMove = true; 
    //GamePieceState current = new GamePieceState();
    //GamePieceState GSS = new GamePieceState();
    //used in testing
    private int num; 
    //Declares a Main Scrn object and sets it to null
    private MainScrn parent = null;
    //Used to score Yellows score
    private int YScore = 0;
    //Used to score Blues score
    private int BScore = 0;
    
    
    //the constructor method for the panel class where the Game State takes place
    public BoardPanel() 
    {
        //Calls the parent class to construct the panel
        super(); 
        
        //System.out.println("Num"); Used in testing
        this.addMouseListener(this); //implements a Mouse listener for this class
        //addMouseListener(this);
        //For loop that loops through the number of B
        for(int i = 0; i < 8; i++) 
        {
            //Calles the constructor of the piece class to create a new piece
            Pieces tmp = new Pieces(i, 1, "BP" +(i+1) + ".png", this, ("BP" + (i+1))); 
            //String type = tmp.toString(); //used for testing
            //System.out.println(type); //used for testing
            PieceArr.add(tmp); //Adds the piece the piece array
        }
        
        for(int i = 0; i < 8; i++)
        {
            //Calles the constructor of the piece class to create a new piece
            Pieces tmp = new Pieces(i, 6, "YP" +(i+1) + ".png", this, "YP"+ (i+1));
            //String type = tmp.toString(); //used for testing
            //System.out.println(type); //used for testing
            //Adds the piece the piece array
            PieceArr.add(tmp); 
        }
        //Declares a new piece
        Pieces tmp = new Pieces(4, 7, "YK1" + ".png", this, "Yk1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(3, 0, "BK1" + ".png", this, "Bk1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(3, 7, "YQ1" + ".png", this, "YQ1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(4, 0, "BQ1" + ".png", this, "BQ1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(0, 7, "YR1" + ".png", this, "YR1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(7, 7, "YR2" + ".png", this, "YR1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(0, 0, "BR2" + ".png", this, "BR1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(7, 0, "BR2" + ".png", this, "YR2");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(2, 0, "BN1" + ".png", this, "BK1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(5, 0, "BN2" + ".png", this, "BK2");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(5, 7, "YN1" + ".png", this, "YK1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(2, 7, "YN2" + ".png", this, "YK2");
        //Adds the piece to the array
        PieceArr.add(tmp);
        tmp = new Pieces(1, 7, "YB1" + ".png", this, "YB1");
        PieceArr.add(tmp);
        //Adds the piece to the array
        //Declares a new piece
        tmp = new Pieces(6, 7, "YB2" + ".png", this, "YB2");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(1, 0, "BB1" + ".png", this, "BB1");
        //Adds the piece to the array
        PieceArr.add(tmp);
        //Declares a new piece
        tmp = new Pieces(6, 0, "BB2" + ".png", this, "BB2");
        //Adds the piece to the array
        PieceArr.add(tmp);
        
        //sets the dimensions of the JPanel, will not differ as JFrame size cannot be changed by user
        setPreferredSize(new Dimension(400, 400)); 
        //Sets the background colour of the JPanel
        setBackground(Color.DARK_GRAY); 
        
    }
    
    //Constructor used to pass information between Jpanel and JFrame
    public BoardPanel(MainScrn p)          
    {
        //Calls the default constructor
        this();
        //Assigns the passed in value to the parent field
        parent = p;
    }
    
    //Called to get pieces
    public ArrayList<Pieces> getPieces()
    {
        //returns an array of the pieces
        return PieceArr;
    }
    
    //Used when the drawlines method is called, takes in a graphics2D component
    //Graphics 2d is the Java updated Graphics components
    public void drawLines(Graphics2D g2d)
    {
        //For loop that repeats for the number of rows in the board
        //for the case of a chess board it is always 8
        for(int i = 0; i < ROWS; i++)
        {
            //Draws the rows onto the Jpanel
            g2d.drawLine(0, (i+1) * 50, ROWS * 50, (i+1) * 50); 
        }
        //For loop that repeats for the number of Columns in the board
        //for the case of a chess board it is always 8
        for(int i = 0; i < COLS; i++)
        {
            //Draws the Columns onto the Jpanel
            g2d.drawLine((i+1) * 50, 0, (i+1) * 50, COLS * 50);
        }
    }
     
     
     
     
     
    //This is the method used to create the checker board look of the board
    //It fills the Board with a Black paint, It then removes all of the White 
    //Sqaures
    @Override
    public void paintComponent(Graphics g)
    {
        //Calls the parents method, In this case the JPanel and paints the 
        //g graphics component onto the board
        super.paintComponent(g);
        //Fills the JPanel, It has dimensions of 400*400
        g.fillRect(0, 0, 400, 400);
        
        //Loops through the Array for every 100
        for (int i = 0; i <= 400; i+= 100)
        {
            for (int j = 0; j <= 400; j+=100) 
            {
                //Clears a 50*50 rectangle
                g.clearRect(i, j, 50, 50);
            }
        }
         
        //Loops through the Array for every 100
        for (int i = 50; i <= 450; i+= 100) 
        {
            for (int j = 50; j <=450; j+=100)
            {
                //Clears a 50*50 rectangle
                g.clearRect(i, j, 50, 50);
            }
        }
        //sets the g2d variable equal to the graphics g component
        Graphics2D g2d  = (Graphics2D) g;
        
        //Loops through the piece array
        for(int i = 0; i < PieceArr.size(); i++)
        {
            //Paints the piece image onto the board
            PieceArr.get(i).paint(g2d);
        }
        //Draws the lines from the grid taken from the G2D component
        drawLines(g2d);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        //Gets the x position of where the mouse is clicked
        int clickedX = e.getX();
        //gets the Y position of where the Y is clicked
        int clickedY = e.getY();
        
        
        //Used to pass to main screen
        String PieceMain = null;
        //Used to pass to Main Screen
        
        //Checks to make sure not moving onto piece of same colour
        boolean diffCol = true;
        
        //System.out.println("Mouse Clickedon pos " + clickedX + " " + clickedY);
        //System.out.println("");
        
        //Adds one to the numClicks attribute everytime the mouse is clicked
        numClicks++;
        //Convertes a Mouse Click into CoOrdinates
        int XCoOrd = e.getX()/50;
        //Convertes a Mouse Click into CoOrdinates
        int YCoOrd = e.getY()/50;
        //System.out.println(XCoOrd + " " + YCoOrd);
        //executed if a piece is still to be selected
        if (pieceIsSelected==false)
        {
            //Loops through the array
                for (int i = 0; i < PieceArr.size(); i++)
                {
                    //Sets the selected piece to the piece at position i
                    selected = PieceArr.get(i);
                    //Checks if the CO ords mathc
                    if (XCoOrd == selected.getX() && YCoOrd == selected.getY())
                        {
                            //System.out.println("Piece selected is " + 
                            //selected.getType());
                            //Sends this back to the parent to be displayed on
                            //the jframe
                            parent.update(selected.getType(), BScore, YScore);
                            //sets this to selected equal to true
                            selected.setSelected(true);
                            //Sets piece is selected to true
                            pieceIsSelected = true;
                            //sets to move to the selected piece
                            toMove = selected;
                            //System.out.println(toMove.isIsYellow());
                            
                            
                        }
                    }
            
        
        }
        //executed if a piece is selected
        else if (pieceIsSelected)
        {
            //Loops through the array
            for (int i = 0; i < PieceArr.size(); i++) 
            {
                //Check if the piece is moved onto a piece
                if ((XCoOrd == PieceArr.get(i).getX() && YCoOrd == PieceArr.get(i).getY()) && toMove.isIsYellow() == YellowMove)
                {
                    //Checks that the piece isnt moving onto its own sqaure
                    if (!PieceArr.get(i).equals(toMove)) 
                    {
                        
                        //System.out.println("Clicked to delete");
                        //Checks which colour took which piece
                        if (PieceArr.get(i).isIsYellow()) 
                        {
                            //If blue then updates accordingly
                            BScore = BScore + PieceArr.get(i).PValue();
                        }
                        else
                        {
                            //if yellow then updates accordingly
                             YScore = YScore + PieceArr.get(i).PValue();
                        }
                        
                        //System.out.println("Piece is " + PieceArr.get(i).getType());
                        //Checks that they are not the some colour
                        if (!(PieceArr.get(i).isIsYellow() == toMove.isIsYellow()))
                        {
                            //removes the piece
                            PieceArr.remove(PieceArr.get(i));
                        }
                        else
                        {
                            //sets the different colour att to false
                            diffCol = false;
                        }
                    }
                }
            }
            //If it is yellow move and move legal
            if ((toMove.isIsYellow() == YellowMove && (toMove.getX()!= XCoOrd || toMove.getY()!= YCoOrd)) &&diffCol == true)
            {
                //sets the Y coordinates
                toMove.setY(YCoOrd);
                //sets the x coordinates
                toMove.setX(XCoOrd);
                //Sets it to the next players move
                YellowMove = !YellowMove;
                //sends the message to the Jframe
                parent.update("None Selected", BScore, YScore);
            }
            else
            {
                //Allows selection of next piece
                pieceIsSelected=false;
            }
              //System.out.println(toMove.getY());
                
        }
        //repaints attribute and changes take place
         this.repaint();
    }
    @Override
    public void mousePressed(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}