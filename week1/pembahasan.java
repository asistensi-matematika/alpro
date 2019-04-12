/**
 * hello_world
 */

import java.util.Scanner; 

public class hello_world {
    public static void main(String[] args) {
        String apapun = "Hello World!";
        String bikinLagi = "ini adalah hello world kedua";
        int a = 42; 
        char sample = 'H'; 

        double pi = 3.14;
        
        int sisiA = 20; 
        int sisiB = 30; 
        int LuasAB = sisiA*sisiB;

        // alas =4
        int alas = 4; 

        // tinggi = 3.7 
        double tinggi =3.7; 

        // luas = 0.5 * alas * tinggi 
        double luas = 0.5 * alas * tinggi; 
        // System.out.println(luas);

        // C --> F
        // F = (9/5 * C) + 32
        int C = 100; 
        // double bagianF = ; 
        double Farenheit = (C*9/5) + 32; 

        
        
        
        //operator logika: OR, AND, XOR
        // z||, &&, ^
        boolean T = true;  
        boolean F = false; 

        // if(T && T == true){
        //     System.out.println("oke berhasil");
        // }

        int l3b1hd4r1s4tu;
        //XOR
        // T ^ T ==> F
        // T ^ F ==> T
        // F ^ F ==> F
        // F ^ T ==> T


        // System.out.println(bagianF);
        
        //scanner
        // nama: 
        // umur: 
        // hobby: 
        String hardcode_nama = "Tian"; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Masukkan nama anda: ");
        String nama = input.next(); 
        System.out.println("Masukkan umur anda: ");
        int umur = input.nextInt(); 
        System.out.println("Masukkan hobby anda: ");
        String hobby = input.next(); 
        
        System.out.println("Selamat datang di kelas asistensi ini " + nama+  "umur anda " + umur + "hobby anda " + hobby);
        

        //membuat konverter suhu 
        // C --> F
        // F = (9/5 * C) + 32
        // C --> K 
        // K = C + 273.15
        // input: x derajat C
        // output: F =  
        //         K =


        
    }
}





