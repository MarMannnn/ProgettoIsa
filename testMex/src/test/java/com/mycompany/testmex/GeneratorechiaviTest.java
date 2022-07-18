/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmex;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author marman
 */
public class GeneratorechiaviTest {
    final BigInteger P= new BigInteger("98119457177177456194561724762503888691938293642142451297968507870583737771514159291299379638843494312511987054774798425528620093256045677540267506368412110655769152899066022717382899231969388620230724848564583398802062701246682361958217103771200807946141870029213354432546296183847887638587751445008949682347");
    final BigInteger Q = new BigInteger("149336347147865278549887965757749952865985907212076429225371224200250696756834223269154275743380004182792683912899651862144353623425164765006925042161442020631777141612339616187492161886057689765039496777934852122926312447851830367844031442614398559621497552003378503400258700330187571405953939832942662475707");
    final BigInteger PHI =  P.subtract(BigInteger.ONE).multiply(Q.subtract(BigInteger.ONE));
    
    /** testiamo il metodo genE verificando che il numero fornito da tale metodo sia relativamente primo
     *  con PHI (gcd(e,PHI) = 1)
     */
    @Test
    public void genETest(){
        System.out.println("test del metodo genE");
        Generatorechiavi gen = new Generatorechiavi();
        BigInteger e = gen.genE();
        assertTrue(e.gcd(PHI).equals(new BigInteger("1")));
    }
    
    /** il metodo genD utilizza un'operazione matematica fornita dalla libreria java.math.BigInteger*/
}
