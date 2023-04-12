package org.example.diamond;

public class Diamond1 {

    public static void main(String[] args) {

        int rowNumber = 10;

        drawLeftBottomCenterDiamond(rowNumber);
        System.out.println();
        drawLeftTopCenterDiamond(rowNumber);

    }

    public static void drawLeftBottomCenterDiamond(int rowNumber){

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void drawLeftTopCenterDiamond(int rowNumber){

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < rowNumber; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
