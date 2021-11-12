package com.company;

public class Main {

    static String[][] table = new String[7][6];
    private static int x;
    private static int y;

    public static void main(String[] args) {
        table();
        tablePrint();
    }

    private static void table() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                table[x][y] = "[ ]";
            }
        }
    }
    private static void tablePrint() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println("");
        }
    }
}