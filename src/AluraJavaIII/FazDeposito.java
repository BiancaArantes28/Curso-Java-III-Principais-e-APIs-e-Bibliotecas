/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AluraJavaIII;

/**
 *
 * @author Bianca Arantes
 */
public class FazDeposito implements Runnable{
    private final Conta conta;
    public FazDeposito(Conta conta){
        this.conta = conta;
    }
    public void run(){
        conta.deposita(100);
        
    }
    
}
