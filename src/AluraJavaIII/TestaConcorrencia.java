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
public class TestaConcorrencia {
    public static void main(String[] args){
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);
        t1.start();
        
        
        CopiadorDeArquivos copiador = new CopiadorDeArquivos();
        Thread t2 = new Thread(copiador);
        t2.start();
        
        Conta c1 = new Conta(500);
        FazDeposito acao = new FazDeposito(c1);
        
        Thread t3 = new Thread(acao);
        Thread t4 = new Thread(acao);
        
        t3.start();
        t4.start();
        
        t3.join();
        t4.join();
    }
}
