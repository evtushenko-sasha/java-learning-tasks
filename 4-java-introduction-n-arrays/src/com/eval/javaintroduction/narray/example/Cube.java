package com.eval.javaintroduction.narray.example;

public class Cube {
    public static void main(String[] args) {
        String[][][] cube = new String[4][4][4];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[0].length; j++) {
                for (int k = 0; k < cube[0][0].length; k++) {
                    cube[i][j][k] = i + " " + j + " " + k;
                    System.out.println(cube[i][j][k]);
                }
            }
        }
    }
}
