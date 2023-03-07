package com.recapitulare.exercitiu1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y;
        int z;

        System.out.println("CE VREI BOSSULE, xy SAU z; DACA INTRODUCI ALTCEVA ITI VIRUSEZ PERSONAL PC-UL, LITERE MICI");
        Scanner alegereataeste = new Scanner(System.in);
        String alegerea = alegereataeste.nextLine();
        int raspuns1 = 1;


        if (alegerea.equals("xy")) {
            System.out.println("hai sa ne sinucidem impreuna mai departe incercand sa aflam z");
            System.out.println("Care vrei sa fie X-ul problemei, baga doar numere");
            Scanner astaex = new Scanner(System.in);
            String xul = astaex.nextLine();
            x = Integer.parseInt(xul);

            System.out.println("Care doamne fereste va fi y? baga doar numere");
            Scanner astaey = new Scanner(System.in);
            String yul = astaey.nextLine();
            y = Integer.parseInt(yul);
            int baza = 2;
            while (x > 0) {
                raspuns1 = baza * raspuns1;
                x--;
            }
            int paranteza = 2 * y + 1;
            z = raspuns1 * paranteza;
            z--;
            System.out.println("Z este teoretic, nu verific " + z);
        } else if (alegerea.equals("z")) {
            System.out.printf("Urasc partea astalalta, dar hai sa zicem, care sa fie Z, foloseste doar numere pls, altfel crapa.");
            Scanner astaey = new Scanner(System.in);
            String zul = astaey.nextLine();
            z = Integer.parseInt(zul);
            z++;
            while (z%2==0) {
                x++;
                z=z/2;
            }

            y=x-z;
            int div=2*x;
            y=y/div;
            y=y*-1;

            System.out.printf("X-ul este " + x + " ");
            System.out.println("Y-ul este " + y);

        } else {
            System.out.printf("NU STII SA CITESTI? MAI BAGA O FISA");

        }
    }
}