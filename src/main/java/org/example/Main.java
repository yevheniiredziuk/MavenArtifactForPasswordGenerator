package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pwd = PasswordGenerator.generatePassword(10);
        System.out.println("Generated password: " + pwd);
        String pw2 = PasswordGenerator.generatePassword(10);
        System.out.println("Generated password: " + pw2);
    }
}