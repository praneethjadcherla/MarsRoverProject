package com.techreturners.Plateau;

public abstract class Plateau {
    protected String coordinates;

       public Plateau(String coordinates){
          this.coordinates=coordinates;
       }

       public abstract int getMAX_X_COORDINATE();
       public abstract int getMAX_Y_COORDINATE();
}
