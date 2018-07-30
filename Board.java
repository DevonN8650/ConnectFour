package com.midwestoxidation.ConnectFour;
import java.io.*;
public class Board{
	int boardSize;
	Coordinate[][] board=new Coordinate[boardSize][boardSize];
	public Board(int size){
		boardSize = size;
	}
	public int getBoardSize(){
		return this.boardSize;
	}
	public void printBoard(){
		clearScreen();
		for(int row=0;row<board.length;row++){
			for(int col=0;col<board[row].length;col++){
				board[row][col].printCoord();
			}
			System.out.println();
		}
		for(int i=0;i<boardSize;i++)
			System.out.print("-------");
		System.out.println();
		for(int i=1;i<boardSize+1;i++){
			String x=String.valueOf(i);
			if(x.length()>2)
				System.out.print("[ "+x+" ]");
			if(x.length()>1)
				System.out.print("[  "+x+" ]");
			else
				System.out.print("[  "+x+"  ]");
		}
		System.out.println();
	}
	public void clearScreen(){
		try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
        catch(IOException e){
            System.out.println("IOException");
        }
	}
	public Board getBoard(){
		return this;
	}
	public Coordinate[][] getBoardArray(){
		return this.board;
	}
	
}