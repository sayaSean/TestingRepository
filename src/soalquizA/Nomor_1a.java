package soalquizA;

import java.util.Scanner;

public class Nomor_1a {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Berapa Yard");
        float a = scan.nextFloat();
        System.out.println("Berapa Kaki");
        float b = scan.nextFloat();
        System.out.println("Berapa Inch");
        float c = scan.nextFloat();
        double d = (a*25.4)/1000;
        double e = (b*30.48)/10;
        double f = (c*0.9144);
        
        System.out.println("Hasil Konversinya : "+(d+e+f));
        
    }
}