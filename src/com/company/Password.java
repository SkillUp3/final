package com.company;

/**
 * Created by idejesus on 28/03/2017.
 */
public class Password {
    private static final int key = 748576362;
    public final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private final int  encryptDecrypt(int password) {
        return password ^ key;
        // 10 (1010) ^ 7 (0111) = 13 (1101)
        // 10 (1010) ^ 13 (1101) = 7 (0111)
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public final boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }

}
