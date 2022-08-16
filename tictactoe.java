package com.kody;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String p1 = "X";
        String p2 = "O";
        Scanner scanner = new Scanner(System.in);
        System.out.println("7|8|9");
        System.out.println("-----");
        System.out.println("4|5|6");
        System.out.println("-----");
        System.out.println("1|2|3");
        String[] board = new String[10];
        board[1] = " ";
        board[2] = " ";
        board[3] = " ";
        board[4] = " ";
        board[5] = " ";
        board[6] = " ";
        board[7] = " ";
        board[8] = " ";
        board[9] = " ";
        System.out.println("Let's play tic-tac-toe");
        showBoard(board);
        for (int i = 0; i < 9;) {
            if(i%2==0) {
                System.out.println("Player 1 - X, where would you like your piece to go?");
                int placement = scanner.nextInt();
                editBoard(board, p1, placement);
                i++;
                showBoard(board);
            } else if(i%2==1) {
                System.out.println("Player 2 - O, where would you like your piece to go?");
                int placement = scanner.nextInt();
                editBoard(board, p2, placement);
                i++;
                showBoard(board);
            } else {
                System.out.println("Error!");
            }

        }

    }

    public static void showBoard(String[] board) {
        System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
        System.out.println("-----");
        System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
        System.out.println("-----");
        System.out.println(board[1] + "|" + board[2] + "|" + board[3]);

    }
    public static void editBoard(String[] board, String player, int position) {
        board[position] = player;
    }
}
