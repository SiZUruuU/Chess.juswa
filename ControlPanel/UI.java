package ControlPanel;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import Pieces.ChessPiece;

public class UI {

    Graphics2D g2;
    Panel panel;
    PieceHandler piece;
    ChessPiece chessPiece;

    BufferedImage blackPawn, whitePawn, whiteKing, blackKing, whiteQueen, blackQueen, whiteBishop, blackBishop, whiteNight, blackNight, whiteRook, blackRook;
    public BufferedImage blackPiece, whitePiece;

    public int boardX, boardY;
    public boolean repaint = false;
    public int xBox = 0, wBox = 100, hBox = 100;
    private int pieceHeight = 50, pieceWidth = 50;
    private int rows = 8, cols = 8;

    public UI(Panel panel, PieceHandler piece){
        this.panel = panel;
        this.piece = piece;

        whitePawn = imageSetUp("spr_pawn_white"); blackPawn = imageSetUp("spr_pawn_black");
        whiteKing = imageSetUp("spr_king_white"); blackKing = imageSetUp("spr_king_black");
        whiteQueen = imageSetUp("spr_queen_white"); blackQueen = imageSetUp("spr_queen_black");
        whiteBishop = imageSetUp("spr_bishop_white"); blackBishop = imageSetUp("spr_bishop_black");
        whiteNight = imageSetUp("spr_knight_white"); blackNight = imageSetUp("spr_knight_black"); 
        whiteRook = imageSetUp("spr_tower_white"); blackRook = imageSetUp("spr_tower_black"); 
    }

    public void draw(Graphics2D g2){
        drawChessBoard(g2);
        drawChessPiece(g2);
    }

    public void drawChessBoard(Graphics2D g2){
        int yBox = 0;
        g2.setColor(Color.BLACK);
        for(int i = 1; i <= rows + 1; i++){

            xBox = 0;
            
            if(i > 1){yBox = yBox + 100;}
            if(i % 2 == 0){
                for(int j = 1; j <= 4; j++){
                    g2.fillRect(xBox, yBox, wBox, hBox);
                    xBox = xBox + 200;
                }
            }
            else if(i % 2 == 1){
                for(int j = 1; j <= 4; j++){
                    g2.fillRect(xBox + 100, yBox, wBox, hBox);
                    xBox = xBox + 200;
                }
            }
        }
    }  
    
    public void drawChessPiece(Graphics2D g2){

        String name, color;

        for(int c = 0; c < cols; c++){
            if(piece.pieceLoc[c][0] != null){
                    name = piece.pieceLoc[c][0].name;
                    color = piece.pieceLoc[c][0].color;

                        switch(color){
                            case "White":
                                switch(name){
                                    case "Pawn" -> g2.drawImage(whitePawn, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Knight" -> g2.drawImage(whiteNight, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Rook" -> g2.drawImage(whiteRook, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Bishop" -> g2.drawImage(whiteBishop, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Queen" -> g2.drawImage(whiteQueen, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "King" -> g2.drawImage(whiteKing, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                }
                                break;
                            
                            case "Black": 
                                switch(name){
                                    case "Pawn" -> g2.drawImage(blackPawn, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Knight" -> g2.drawImage(blackNight, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Rook" -> g2.drawImage(blackRook, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Bishop" -> g2.drawImage(blackBishop, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Queen" -> g2.drawImage(blackQueen, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "King" -> g2.drawImage(blackKing, ((c * 100) + pieceWidth), ((0 * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                }
                                break;
                    }
                }
            for(int r = 0; r < rows; r++){
                if(piece.pieceLoc[c][r] != null){
                    name = piece.pieceLoc[c][r].name;
                    color = piece.pieceLoc[c][r].color;

                        switch(color){
                            case "White":
                                switch(name){
                                    case "Pawn" -> g2.drawImage(whitePawn, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Knight" -> g2.drawImage(whiteNight, ((c * 100) + pieceWidth), ((r * 100)+ pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Rook" -> g2.drawImage(whiteRook, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Bishop" -> g2.drawImage(whiteBishop, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Queen" -> g2.drawImage(whiteQueen, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "King" -> g2.drawImage(whiteKing, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                }
                                break;
                            
                            case "Black": 
                                switch(name){
                                    case "Pawn" -> g2.drawImage(blackPawn, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Knight" -> g2.drawImage(blackNight, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Rook" -> g2.drawImage(blackRook, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Bishop" -> g2.drawImage(blackBishop, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "Queen" -> g2.drawImage(blackQueen, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                    case "King" -> g2.drawImage(blackKing, ((c * 100) + pieceWidth), ((r * 100) + pieceHeight), pieceWidth, pieceHeight, panel);
                                }
                                break;
                    }
                }
            }
        }
    }

    public BufferedImage imageSetUp(String imagePath) {

        BufferedImage image = null;

        try{
            image = ImageIO.read(getClass().getResourceAsStream("/Assets/" + imagePath + ".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        return image;
    }

    // public void repaintPiece(Graphics2D g2){
    //     if(repaint){
    //         drawChessBoard(g2);
    //         drawChessPiece(g2);
    //         panel.repaint();
    //         repaint = false;
    //     }
    // }
}
