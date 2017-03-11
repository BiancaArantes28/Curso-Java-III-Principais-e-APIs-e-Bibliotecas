
package AluraJavaIII;

/**
 *
 * @author Bianca Arantes
 */
public class Conta {
    public double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    } 
    public synchronized void deposita(float valor){
        
          this.saldo += valor;

    }
}
