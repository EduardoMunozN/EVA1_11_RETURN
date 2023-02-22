/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_11_return;

/**
 *
 * @author eduar
 */
public class EVA1_11_RETURN {

    public static void main(String[] args) {
        int resu;
        resu  = square (10);//llamada a función
        System.out.println("Resultado es: "+resu);
    }
    public static int square(int num){
       return num * num;
    }
}
