package org.example;

import java.util.ArrayList;

public class BackTracking {
    private static final int DAME = 1;
    private static int[][] schachbrett = new int[7][7];
    static{
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                schachbrett[i][j] =  0;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        System.out.println(damenproblem(schachbrett, points , 0, 0));
    }

    public static boolean dameInGefahr(int iPos,int jPos,int[][] schachbrett) {
        boolean gefahr = false;
        for(int i=0; i<8;i++){
            for(int j=0; j<8;j++){
                if((i!=iPos || j!=jPos) && schachbrett[i][j]== DAME ){
                    if(i==iPos || j==jPos){
                        gefahr = true;
                    } else if (iPos+jPos==i+j) {
                        gefahr = true;
                    }
                }
            }
        }
        return gefahr;
    }


    public static ArrayList<Point> damenproblem(int[][] schachbrett, ArrayList<Point> positionen,int nextI,int nextJ) {
        if(positionen.size()==8){
            for(Point pos: positionen){
                schachbrett[pos.xPos()][pos.yPos()]=0;
            }
            return positionen;
        }
        while(nextI<8 && nextJ<8) {
            if (!dameInGefahr(nextI, nextJ, schachbrett)) {
                positionen.add(new Point(nextI, nextJ));
                schachbrett[nextI][nextJ] = DAME;
                damenproblem(schachbrett, positionen, nextI + 1, nextJ);
            }
            nextI++;
            if(nextI == 8 && nextJ<8){
                nextI = 0;
                nextJ++;
            }
            if(nextI>positionen.size()+1 && nextJ>positionen.size()+1){
                Point lastPoint = positionen.getLast();
                schachbrett[lastPoint.xPos()][lastPoint.yPos()] = 0;
                positionen.removeLast();
                damenproblem(schachbrett,positionen, lastPoint.xPos()+1, lastPoint.yPos());
            }
        }


        return positionen;
    }





}
