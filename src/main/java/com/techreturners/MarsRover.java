package com.techreturners;

public class MarsRover {
    private int x_coordinate;
    private int y_coordinate;
    DirectionFacing directionFacing;

    public MarsRover(int x_coordinate,int y_coordinate,DirectionFacing directionFacing){
        this.x_coordinate=x_coordinate;
        this.y_coordinate=y_coordinate;
        this.directionFacing=directionFacing;
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public DirectionFacing getDirectionFacing() {
        return directionFacing;
    }

    public void setDirectionFacing(DirectionFacing directionFacing) {
        this.directionFacing = directionFacing;
    }


    public String instructionsToMoveRover(String instructions) {
        for(int letter=0;letter<instructions.length();letter++){
            if(instructions.charAt(letter) == 'L'){
                if(getDirectionFacing().equals(DirectionFacing.N)){
                    setDirectionFacing(DirectionFacing.W);
                } else if (getDirectionFacing().equals(DirectionFacing.W)) {
                    setDirectionFacing(DirectionFacing.S);
                } else if (getDirectionFacing().equals(DirectionFacing.S)) {
                    setDirectionFacing(DirectionFacing.E);
                } else {
                    setDirectionFacing(DirectionFacing.N);
                }
            } else if (instructions.charAt(letter) == 'R') {
                if(getDirectionFacing().equals(DirectionFacing.N)){
                    setDirectionFacing(DirectionFacing.E);
                } else if (getDirectionFacing().equals(DirectionFacing.W)) {
                    setDirectionFacing(DirectionFacing.N);
                } else if (getDirectionFacing().equals(DirectionFacing.S)) {
                    setDirectionFacing(DirectionFacing.W);
                } else {
                    setDirectionFacing(DirectionFacing.S);
                }
            } else if (instructions.charAt(letter) == 'M') {
                if(getDirectionFacing().equals(DirectionFacing.N)){
                    setY_coordinate(getY_coordinate()+1);
                } else if (getDirectionFacing().equals(DirectionFacing.W)) {
                    setX_coordinate(getX_coordinate()-1);
                } else if (getDirectionFacing().equals(DirectionFacing.S)) {
                    setY_coordinate(getY_coordinate()-1);
                } else {
                    setX_coordinate(getX_coordinate()+1);
                }
            }
        }
        return x_coordinate+" "+y_coordinate+" "+directionFacing;
    }
}
