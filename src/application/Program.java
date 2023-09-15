package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println("\nSource: ");
            ChessPosition source = UI.readChessPostion(sc);

            System.out.println("\nTarget: ");
            ChessPosition target = UI.readChessPostion(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
