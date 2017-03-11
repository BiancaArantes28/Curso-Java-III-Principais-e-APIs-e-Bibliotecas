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
public class BarraDeProgresso implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=1000;i++){
            System.out.println("Barra de progresso");
        }
        
    }
}
