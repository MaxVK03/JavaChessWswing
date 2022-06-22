/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadevclassobj;

public class GameState
{
    private int Time;
    private String P1InGameName;
    private String P2InGameName;
    
    public GameState(int TimeIn, String P1, String P2)
    {
        Time = TimeIn;
        P1InGameName = P1;
        P2InGameName = P2;
    }

    public int getTime()
    {
        return Time;
    }

    public String getP1InGameName()
    {
        return P1InGameName;
    }

    public String getP2InGameName()
    {
        return P2InGameName;
    }
    
    
}
