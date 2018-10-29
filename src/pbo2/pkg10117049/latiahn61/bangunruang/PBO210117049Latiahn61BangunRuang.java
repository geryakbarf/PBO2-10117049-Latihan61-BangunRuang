/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latiahn61.bangunruang;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung volume Bangun
 * Ruang
 */
public class PBO210117049Latiahn61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola_Basket bola = new Bola_Basket();
        bola.setR(7);
        System.out.println("Jari Jari Bola : "+bola.getR()+" cm");
        System.out.println("Volume Bola : "+bola.hitungVolume() +" cm");
        System.out.println("");
        Tabung tabung = new Tabung();
        tabung.setH(21);
        tabung.setR(10);
        System.out.println("Tinggi Tabung : "+tabung.getH()+" cm");
        System.out.println("Jari Jari Tabung : "+tabung.getR()+" cm");
        System.out.println("Volume Tabung : "+Math.ceil(tabung.hitungVolume())+" cm");
        System.out.println("");
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Jari jari Kerucut : "+kerucut.getR()+" cm");
        System.out.println("Tinggi Kerucut : "+kerucut.getT()+" cm");
        System.out.println("Volume kerucut " + kerucut.hitungVolume()+" cm");
    }
    
}
