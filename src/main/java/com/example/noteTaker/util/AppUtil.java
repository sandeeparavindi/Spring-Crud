package com.example.noteTaker.util;

import java.util.UUID;

public class AppUtil {
    public static String createNote(){
        return "NOTE-"+ UUID.randomUUID().toString();
    }

    public static String createUserId(){
        return "USER"+ UUID.randomUUID().toString();
    }

}
