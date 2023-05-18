package com.xworkz.chats;
import java.util.Scanner;
public class ChatsTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Chats chat=new Chats();
        for(int i=0; i<chat.names.length ;i++){
            System.out.println("enter chat names");
            String name=sc.next();
            chat.addNames(name);
        }
        chat.getNames();
    }
}
