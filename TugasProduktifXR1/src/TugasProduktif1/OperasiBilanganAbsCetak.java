/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProduktif1;

/**
 *
 * @author LENOVO
 */
public class OperasiBilanganAbsCetak {
    
//    OperasiBilanganAbs penjumlahan = new OperasiPenjumlahan();
//    OperasiBilanganAbs pengurangan = new OperasiPengurangan();
//    OperasiBilanganAbs perkalian = new OperasiPerkalian();
//    OperasiBilanganAbs pembagian = new OperasiPembagian();
//    
//    OperasiBilanganAbs[] objek = {penjumlahan, pengurangan, perkalian, pembagian };
//    
    
    public void cetakSemua(OperasiBilanganAbs[] Objek, double a, double b){
        for(int i = 0; i< Objek.length;i++){
            Objek[i].set_A(a);
            Objek[i].set_B(b);
            Objek[i].tampil();
            System.out.println("");
            

        }
    }
}