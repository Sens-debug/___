package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de numero a iterar(separados por ,)");
        String entrada = teclado.nextLine();
        String[] elementos = entrada.split(",");
        double[] elementos2 = new double[elementos.length];
        // double[] elementos3 = {1,2,3,4};

        for (int i = 0; i < elementos.length; i++) {
            elementos2[i] = Double.parseDouble(elementos[i]);
        }

        Arrays.sort(elementos2);
        int n = elementos2.length;
        if (n % 2 == 0) {
            double mediana = (elementos2[n / 2] + elementos2[n / 2 - 1]) / 2;
            System.out.println("La mediana es -->" + mediana);
        } else {

            double mediana = elementos2[n / 2];
            System.out.println("La mediana es -->" + mediana);
        }
        teclado.close();
    }
}