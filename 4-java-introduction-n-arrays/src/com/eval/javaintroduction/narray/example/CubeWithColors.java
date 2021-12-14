package com.eval.javaintroduction.narray.example;

import javafx.scene.paint.Color;

import java.util.Random;

public class CubeWithColors {
    public static void main(String[] args) {
        int r;
        int g;
        int b;
        Random rand = new Random();
        String[][][] cube = new String[4][4][4];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[0].length; j++) {
                for (int k = 0; k < cube[0][0].length; k++) {
                    r = rand.nextInt(255);
                    g = rand.nextInt(255);
                    b = rand.nextInt(255);
                    cube[i][j][k] = String.valueOf(Color.rgb(r, g, b));
                    System.out.println(i + " " + j + " " + k + ": " + cube[i][j][k]);
                }
            }
        }
    }
}
