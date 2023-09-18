package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println("\nSource: ");
                ChessPosition source = UI.readChessPostion(sc);

                System.out.println("\nTarget: ");
                ChessPosition target = UI.readChessPostion(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
