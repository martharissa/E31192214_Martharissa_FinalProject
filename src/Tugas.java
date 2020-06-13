/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

public class Tugas {
int x = 3;
int y = 7;

    public static void main(String[] args) {
        int a = 100, b = 200;
        // Sebelum
        System.out.println("Sebelum");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //Kalkulasi
        //tanda dari XOR adalah (^)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        //sesudah
        System.out.println("Sesudah");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}

