package com.eval.javaintroduction.narray.example;

public class Main {
    public static void main(String[] args) {

//        Arrays.
        String[][] chessBoard = new String[8][8];
        String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] chars = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                chessBoard[i][j] = numbers[i] + chars[j];
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.println();
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
        }
    }
}
