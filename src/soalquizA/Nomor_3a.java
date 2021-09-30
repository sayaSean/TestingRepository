package soalquizA;

import java.util.Scanner;

public class Nomor_3a {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Berapa mangga yang akan di beli?");
        int a = scan.nextInt();
        System.out.println("Berapa apel yang akan di beli?");
        int b = scan.nextInt();
        System.out.println("Berapa jeruk yang akan di beli?");
        int c = scan.nextInt();
        int d = a/2;
        int e = (b+d)/3;
        System.out.println("Total buah yang diterima ada : "+a+" mangga "+(b+d)+" apel "+(e+c)+" jeruk ");
    }
}