package co.com.sofka.app;

import java.util.Scanner;

public class MayorNumero {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Ingrese el primer número");
        x = reader.nextInt();

        System.out.println("Ingrese el segundo número");
        y = reader.nextInt();

        if (x == y)
            System.out.println("Los números ingresados son iguales");
        if (x > y)
            System.out.println("El número Mayor es: " + x);
        if (y > x)
            System.out.println("El número Mayor es: " + y);


    }

}


