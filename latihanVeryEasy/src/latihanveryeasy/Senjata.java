/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanveryeasy;

/**
 *
 * @author Kaiii
 */

// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1


public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru -= 1;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis");
        }
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}

