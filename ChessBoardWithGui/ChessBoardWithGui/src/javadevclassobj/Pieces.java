
package javadevclassobj;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Pieces 
{
    //Fields
    private int x = 0;
    private int y = 0;
    private int w = 50;
    private int h = 50;
    private String INtype;
    private boolean isYellow = false;
    private char PieceType;
    private int PieceNum;
    private Image image;
    private boolean selected = false;
    private BoardPanel board = null;
    private int PieceVal = 0;
    
    //Defualt constructor for piece
    public Pieces()
    {
        loadImage("item.png");
    }
    //constructor for the piece
    public Pieces(int x, int y)
    {
        //sets the attributes
        this.x = x;
        this.y = y;
        loadImage("item.png");
    }
    
    public Pieces(int x, int y, String imgName, BoardPanel b, String type)
    {
        //declares X position to inputted x position
        this.x = x; 
         //declares Y position to inputted x position
        this.y = y;
        //Inputs the board object
        board = b; 
        //loads the image in, Image Name made up in constructor of method in BoardPanel
        loadImage(imgName); 
        //declares INType to lower case to avoid error checking
        this.INtype = type.toLowerCase(); 
        //Checks if the first char is Y indicating if the piece is yellow or not
        if (INtype.charAt(0)== 'y') 
        {
            isYellow = true; //if true then sets isYellow to true
        }
        //Extracts the piece type which is stored by the first letter of the 
        //piece name
        PieceType = INtype.charAt(1);
        
        //uses the piece type to determine the pieces value
        if (PieceType == 'p')
        {
            PieceVal = 1;
        }
        else if (PieceType == 'b')
        {
            PieceVal = 3;
        }
        else if (PieceType == 'n')
        {
            PieceVal = 3;
        }
        else if (PieceType == 'q')
        {
            PieceVal = 9;
        }
        else if (PieceType == 'k')
        {
            PieceVal = 1000;
        } 
        else if (PieceType == 'r')
        {
            PieceVal = 5;
        }
       
        
        
        //There are more than one of each piece, to distinguish each piece is
        //given a number
        int PieceNum = INtype.charAt(2);
        
        
      
    }
    
    //used to return the type of piece the selected piece is
    public String getType()
    {   
        //returns the type of piece
        return INtype;
    }
    //used to determine the piece colour
    public boolean isIsYellow()
    {
        //returns the piece colour, if false then we know it is blue
        return isYellow;
    }
    //Gets the piece value
    public int PValue()
    {
        return PieceVal;
    }

    //Returns the X CoOrd of the piece
    public int getX()
    {
        //returns the X CoOrd
        return x;
    }
    
    //Returns the Y CoOrd of the piece
    public int getY()
    {
        //returns the Y CoOrd
        return y;
    }
    
    //Take in a X CoOrd as a integer
    public void setX(int x)
    {
        //Sets the pieces X CoOrd to the inputted int
        this.x =x;
    }
    //Take in a Y CoOrd as a integer
    public void setY(int y)
    {
        //Sets the pieces Y CoOrd to the inputted int
        this.y = y;
    }
    //Gets the selected
    public boolean getSelected()
    {
        return selected;
    }
    //sets that piece to b, to see if it is selected
    public void setSelected(boolean b)
    {
        selected = b;
    }
    //Sees if there is a piece on that tile
    public boolean OnPiece(Pieces P)
    {
        return false;
    }
    
    //Used to load the image from the file
    public void loadImage(String imgName)
    {
        ImageIcon ii = new ImageIcon("ChessBoardWithGui/ChessBoardWithGui/src/img/" + imgName);
        image = ii.getImage();
    }
//Used to paint the piece to the board
    public void paint(Graphics2D g)
    {
        g.drawImage(image, x * w, y * h, w, h, null);
    }
//the method to return a string representaion of the piece
    @Override
    public String toString() {
        return "Pieces{" + "x=" + x + ", y=" + y + ", type=" + INtype + '}';
    }

  

    
    
    
}
