package com.xworkz.games;

public class GamesTester {
    public static void main(String[] args) {
        Games game1=new Games();
        game1.name="kabaddi";
        game1.type="outdoor";
        game1.player=7;
        game1.tools="no ";
        game1.place="tamil nadu";
        System.out.println(game1.name+" "+ game1.type +" "+ game1.player + game1.tools+" "+  game1.place);

        Games game2=new Games();
        game2.name="kho kho";
        game2.type="outdoor";
        game2.player=12;
        game2.tools="no";
        game2.place="maharashtra";
        System.out.println(game2.name+" "+ game2.type +" "+ game2.player + game2.tools+" "+ game2.place);

    }
}
