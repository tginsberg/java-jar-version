package com.ginsberg.version;

public class Main {
    public static void main(String[] args) {
        if(args.length == 1 && args[0].equals("kotlin")) {
            new KotlinLogVersion().logVersion();
        } else {
            new JavaLogVersion().logVersion();
        }
    }
}
