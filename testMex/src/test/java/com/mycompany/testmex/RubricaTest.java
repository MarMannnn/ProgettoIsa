/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author marman
 */
public class RubricaTest {
    
    
    /** test del metodo lstUtn della classe rubrica*/
    @Test
    public void lstUtnTest(){
        System.out.println("test metodo lstUtn");
        Rubrica r = new Rubrica("martino");
        String[] expRis = new String[20];
        expRis[0] = "alessandro";
        expRis[1] = "maria";
        String[] ris = r.lstUtn();
        assertArrayEquals(ris,expRis);
    }
    
    /** test del metodo lstMsg della classe rubrica */
    @Test
    public void lstMsgTest(){
        System.out.println("test metodo lstMsg");
        Rubrica r = new Rubrica("martino");
        String[] expRis = new String[20];
        expRis[0] = "maria: 9972321520000173003957193193942105492000139380717240387015855851104498093048350430263342674451979107083719547894049347642916332179872148295892717632864222450550921180059491589828432556953709196149659360073276623163703747533189842956652895724324134219757520784400801132578794890459253607294864453500277030510323576629371707477124713846677043392072588647070182639164349359230954988718392703482615828388615675930943253091584302475918728870157662578364748865299888124815214907621089213384428630417064339537126959140630839423398563701696557433715791039078891429102098297675647033428165905975432395578761389683213210143103";    
        String[] ris = r.lstMsg();
        assertArrayEquals(ris,expRis);
    }
     
    
    
}
