package org.mpsomaha.ConnectFour;
import java.util.*;
public class Coordinate
{
	private int x;
	private int y;
	private String coord;
	private boolean played;
	private boolean player;
	private int size;
	String mover;
	public Coordinate(int xIn, int yIn, int sIn)
	{
	x=xIn +1;
	y=yIn +1;
	size = sIn;
	coord = setCoord();
	}

	private String setCoord()
	{
		return "[     ]";
	}
	public void setCoord(String x)
	{
		this.coord = x;
	}
	public String getCoord()
	{
		return this.coord;
	}
	public void printCoord()
	{
		System.out.println(this.coord);
	}

	public void makeMove(boolean play)
	{
		this.player = play;
		this.played = true;
		this.coord = setCoord(play);
	}
	public String setCoord(boolean play)
	{
		if(play)
		{
			mover = "X";
		}
		else
		{ 
			mover  = "O";
		}

		if(this.size<10)
		{
			return("[  "+this.mover+"  ]");
		}
		else if(this.size<100)
		{
			return("[  "+this.mover+"  ]");
		}
		return null;

}
	
}


