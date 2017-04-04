package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();
        System.out.println("password stored");
        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);

        System.out.println(747902050^748576362);
    }
}
