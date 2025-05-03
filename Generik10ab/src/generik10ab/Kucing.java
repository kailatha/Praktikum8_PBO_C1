/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik10ab;

/**
 *
 * @author Kaiii
 */
// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1

public class Kucing extends Anabul{

    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan cara melata");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi meong");
    }
}
