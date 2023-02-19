package com.techreturners.model.Plateau;

public class SquarePlateau extends Plateau {
    public static final int MIN_X_COORDINATE = 0;
    public static final int MIN_Y_COORDINATE = 0;
    public static int max_X_Coordinate;
    public static int max_Y_Coordinate;

    public SquarePlateau(String coordinates) {
        super(coordinates);
        this.coordinates = coordinates;
        max_X_Coordinate = Integer.parseInt(String.valueOf(coordinates.charAt(0)));
        max_Y_Coordinate = Integer.parseInt(String.valueOf(coordinates.charAt(2)));
    }

    @Override
    public int getMax_X_Coordinate() {
        return max_X_Coordinate;
    }

    @Override
    public int getMax_Y_Coordinate() {
        return max_Y_Coordinate;
    }

}
