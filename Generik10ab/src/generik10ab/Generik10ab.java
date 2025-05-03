/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generik10ab;

/**
 *
 * @author Kaiii
 */

import java.util.ArrayList;

public class Generik10ab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //Praktikum 7 
//        Kucing kucing1 = new Kucing("Momo");
//        Anjing anjing1 = new Anjing("Coco");
//        Burung burung1 =  new Burung("Nono");
//        
//        ArrayList<Anabul> Anabulpeliharaan = new ArrayList<>();
//        Anabulpeliharaan.add(kucing1);
//        Anabulpeliharaan.add(anjing1);
//        Anabulpeliharaan.add(burung1);
//
//        for(Anabul anabul : Anabulpeliharaan){
//            anabul.gerak();
//            anabul.bersuara();
//            System.out.println();
            
        //Praktikum 8 
        Datum<Kucing> kucing = new Datum<>(new Kucing("ScaraMeow"));
        Datum<Anjing> anjing = new Datum<>(new Anjing("Heli"));
        Datum<Burung> burung = new Datum<>(new Burung("Lofi"));
            
        ContohMetodeGenerik.tampilkan(kucing);
        ContohMetodeGenerik.tampilkan(anjing);
        ContohMetodeGenerik.tampilkan(burung);
        }
}    

