package ControlPanel;

import Pieces.Bishop;
import Pieces.ChessPiece;
import Pieces.King;
import Pieces.Knight;
import Pieces.Pawn;
import Pieces.Queen;
import Pieces.Rook;

public class PieceHandler {

    ChessPiece piece;

    public int col, row;
    public boolean isWhiteMove = true;
    public int[] chessPiece = new int[31];
    public ChessPiece[][] pieceLoc =  new ChessPiece[8][8]; //HOLDS PIECE COORDINATES


    //INITIAL PIECE POSITION SETUP
    public void setUp(){

        //PAWNS
        pieceLoc[0][6] = new Pawn("Pawn", "White", false);
        pieceLoc[1][6] = new Pawn("Pawn", "White", false);
        pieceLoc[2][6] = new Pawn("Pawn", "White", false);
        pieceLoc[3][6] = new Pawn("Pawn", "White", false);
        pieceLoc[4][6] = new Pawn("Pawn", "White", false);
        pieceLoc[5][6] = new Pawn("Pawn", "White", false);
        pieceLoc[6][6] = new Pawn("Pawn", "White", false);
        pieceLoc[7][6] = new Pawn("Pawn", "White", false);
        pieceLoc[0][1] = new Pawn("Pawn", "Black", false);
        pieceLoc[1][1] = new Pawn("Pawn", "Black", false);
        pieceLoc[2][1] = new Pawn("Pawn", "Black", false);
        pieceLoc[3][1] = new Pawn("Pawn", "Black", false);
        pieceLoc[4][1] = new Pawn("Pawn", "Black", false);
        pieceLoc[5][1] = new Pawn("Pawn", "Black", false);
        pieceLoc[6][1] = new Pawn("Pawn", "Black", false);
        pieceLoc[7][1] = new Pawn("Pawn", "Black", false);

        //ROOKS
        pieceLoc[0][7] = new Rook("Rook", "White", false);
        pieceLoc[7][7] = new Rook("Rook", "White", false);
        pieceLoc[0][0] = new Rook("Rook", "Black", false);
        pieceLoc[7][0] = new Rook("Rook", "Black", false);

        //KNIGHTS
        pieceLoc[1][7] = new Knight("Knight", "White", false);
        pieceLoc[6][7] = new Knight("Knight", "White", false);
        pieceLoc[1][0] = new Knight("Knight", "Black", false);
        pieceLoc[6][0] = new Knight("Knight", "Black", false);

        //BISHOPS
        pieceLoc[2][7] = new Bishop("Bishop", "White", false);
        pieceLoc[5][7] = new Bishop("Bishop", "White", false);
        pieceLoc[2][0] = new Bishop("Bishop", "Black", false);
        pieceLoc[5][0] = new Bishop("Bishop", "Black", false);

        //QUEENS
        pieceLoc[3][7] = new Queen("Queen", "White", false);
        pieceLoc[3][0] = new Queen("Queen", "Black", false);

        //KINGS
        pieceLoc[4][7] = new King("King", "White", false);
        pieceLoc[4][0] = new King("King", "Black",false);
    }

    //Helper Method to get X position digits
    public int mouseXPos(int num){

        int digit = 0;

        while (num != 0){
            num /= 10;
            digit++;
        }
        return digit;
    }

    //Helper Method to get Y position digits
    public int mouseYPos(int num){

        int digit = 0;

        while (num != 0){
            num /= 10;
            digit++;
        }
        return digit;
    }
}
