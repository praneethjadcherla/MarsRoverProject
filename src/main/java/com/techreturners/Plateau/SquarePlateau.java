package com.techreturners.Plateau;

public class SquarePlateau extends Plateau {
    private final int MIN_X_COORDINATE=0;
    private final int MIN_Y_COORDINATE=0;
    public static int MAX_Y_COORDINATE;
    public static int MAX_X_COORDINATE;

    public SquarePlateau(String coordinates){
        super(coordinates);
        this.coordinates = coordinates;
    }

    @Override
    public int getMAX_X_COORDINATE(){
        this.MAX_X_COORDINATE=Integer.parseInt(String.valueOf(coordinates.charAt(0)));
        return MAX_X_COORDINATE;
    }

    @Override
    public int getMAX_Y_COORDINATE(){
        this.MAX_Y_COORDINATE=Integer.parseInt(String.valueOf(coordinates.charAt(2)));
        return MAX_Y_COORDINATE;
    }

}
