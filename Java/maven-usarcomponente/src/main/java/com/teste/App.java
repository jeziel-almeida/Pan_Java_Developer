package com.teste;

import com.example.Parser;

/**
 * Classe principal
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        User user = new User("jeziel-almeida", "12345");

        user.enable();
        System.out.println(user.getStatus());

        user.disable();
        System.out.println(user.getStatus());

        StatusUser[] enumValues = StatusUser.values();
        
        for (StatusUser statusUser : enumValues) {
            System.out.println(statusUser);
        }

        Parser parser = new Parser();
        parser.message();
    }
}
