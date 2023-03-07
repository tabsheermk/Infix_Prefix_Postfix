package com.example.infix_prefix_postfix;

import android.content.Context;

public class MemoryData {
    static String postfix = "";
    static String prefix = "";

    public static void savePrefix(Context context, String pre) {
        prefix = pre;
    }

    public static void savePostfix(Context context, String post){
        postfix = post;
    }

    public static String getPrefix(Context context){
        String pre = prefix;
        prefix = "";
        return pre;
    }

    public static String getPostfix(Context context){
        String post = postfix;
        postfix = "";
        return post;
    }
}
