package cl.cehd.cleancode.examples;

import java.util.ArrayList;
import java.util.List;

public class NamesAKLSDÑFJKLÑFGDJWEQKLHRKH {

    //Date mm/dd/yy
    String d;

    //Date in format mm/dd, year doesn't matter, it's just for logging purpose
    String d2;


    //Classic example from clean code book
    public List<int[]> getThem() {
        int[][] theList = new int[2][2];
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    //Kind of refactor method
    public List<Cell> getFlaggedCells() {
        List<Cell> gameBoard = new ArrayList<Cell>();
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }


    void m() {
        int a = l;

        if (0 == O) {
            System.out.printf("they are equals LOL");
        }

        while ((Boolean) DO) {
            System.out.printf("Here im doing the dum of myself");
        }

        klass k = new klass();

        if (bolean.isTrue()) {
            System.out.printf("Who knows!! it's true");
        }

        String cliImpRsFrCDDB = "none";

        //0 means female
        int gender=0;

    }


    //Aux vars to makes it compile
    int l;

    Object O;

    Object DO;

    class Cell {
        public boolean isFlagged() {
            return true;
        }
    }

    class klass {
    }

    bolean bolean = new bolean();

    class bolean {
        boolean bolean = true;

        public boolean isTrue() {
            return bolean;
        }
    }

}
