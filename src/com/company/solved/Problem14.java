package com.company.solved;

/*
Given three inputs, two of them are an inputs (int row, int column) for ticket reservation
place in Cinema, and third one is about predefined reserved places grid as per mentioned
below, imagine cinema is about grid consists of 7 rows starting from 0 to 6 and 9 columns
starting from 0 to 8, each X as mentioned below means that this place is reserved

14.1. Grayed places are not allowed to be reserved, it is about free spaces inside the
Cinema, so for example, if the inputs for example are about (0 , 0) or (6 , 4) or
(4 , 8), the program should print “Invalid place, this place is not allowed for
reservation”

14.2 Already reserved places for example such as (0 , 1) or (1 , 2) or (4 , 1) or (2 , 5)
cannot be reserved again, so if the inputs are already reserved such as (0 , 1) or
any or reserved places, the program should print “This place is already
reserved, please choose another one”

14.3 If the inputs are about a place not reserved before such as for example (1 , 1) or
(3 , 2) or (3 , 7), the program should reserve this place and print “It is Ok, this
place is reserved for you now”, once this place is reserved, the program
shouldn’t accept to be reserved again as step # 14.2
 */
public class Problem14 {
    private int[][] cinemagrid = new int[7][9];

    public Problem14(){
        addCannotReserved();
        addReserved();
    }

    public void start(int row , int column , int[][]grid){
        if(checkAllCond(row,column,grid))
            return;
        reserve(row,column,grid);
    }

    public  void reserve(int row , int column , int[][]grid){

        grid[row][column] = 1;
        System.out.println("It is Ok, this place is reserved for you now");

    }
    public boolean checkAllCond (int row , int column , int[][]grid){
        if(checkInputs(row,column))
            return  true;
        if(checkForInvalid(row,column,grid))
            return true;
        if(checkForReserved(row,column,grid))
            return true;

        return false;
    }

    public boolean checkInputs(int row,int column){
        if(row<0 || row > 7){
            System.out.println("Invalid row number ( min 0 - max 7 )");
            return true;
        }
        if(row<0 || row > 9){
            System.out.println("Invalid column number ( min 0 - max 9 )");
            return true;
        }
        return false;
    }

    public boolean checkForInvalid (int row , int column,int[][]grid){
        if(grid[row][column]==2){
            System.out.println("Invalid place, this place is not allowed for reservation");
            return true;
        }
        return false;
    }

    public boolean checkForReserved (int row , int column,int[][]grid){
        if(grid[row][column]==1){
            System.out.println("This place is already reserved, please choose another one");
            return true;
        }
        return false;
    }

    public void addReserved(){
        cinemagrid[0][1] = 1;
        cinemagrid[1][2] = 1;
        cinemagrid[4][1] = 1;
        cinemagrid[2][5] = 1;
    }

    public void addCannotReserved(){
        cinemagrid[0][0] = 2;
        cinemagrid[6][4] = 2;
        cinemagrid[4][8] = 2;
    }


    public int[][] getCinemagrid() {
        return cinemagrid;
    }

    public void setCinemagrid(int[][] cinemagrid) {
        this.cinemagrid = cinemagrid;
    }
}
