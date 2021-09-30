package soalquizA;

import java.util.Scanner;

public class Nomor_2a {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tujuannya ?");
        int a = scan.nextInt();
        System.out.println("Umur anda?");
        int b = scan.nextInt();
        int harga;
        
        if(a==1){
            harga=280000;
            if(b<=6||b>=60){
                System.out.println("Biayanya : Rp"+(harga-harga*50/100));
            }else if(b<=12){
                System.out.println("Biayanya : Rp"+(harga-harga*25/100));
            }else if(b<=59){
                System.out.println("Biayanya : Rp"+(harga));
            }
        }
        if(a==2){
            harga=600000;
            if(b<=6||b>=60){
                System.out.println("Biayanya : Rp"+(harga-harga*50/100));
            }else if(b<=12){
                System.out.println("Biayanya : Rp"+(harga-harga*25/100));
            }else if(b<=59){
                System.out.println("Biayanya : Rp"+(harga));
            }
        }
        if(a==3){
            harga=215000;
            if(b<=6||b>=60){
                System.out.println("Biayanya : Rp"+(harga-harga*50/100));
            }else if(b<=12){
                System.out.println("Biayanya : Rp"+(harga-harga*25/100));
            }else if(b<=59){
                System.out.println("Biayanya : Rp"+(harga));
            }
        }
        if(a==4){
            harga=475000;
            if(b<=6||b>=60){
                System.out.println("Biayanya : Rp"+(harga-harga*50/100));
            }else if(b<=12){
                System.out.println("Biayanya : Rp"+(harga-harga*25/100));
            }else if(b<=59){
                System.out.println("Biayanya : Rp"+(harga));
            }
        }
    }
}