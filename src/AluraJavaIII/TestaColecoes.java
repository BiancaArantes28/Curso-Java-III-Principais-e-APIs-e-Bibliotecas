
package AluraJavaIII;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Bianca Arantes
 */
public class TestaColecoes {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Bianca");
        nomes.add("Thiago");
        
        System.out.println(nomes.get(0));
        System.out.println(nomes.contains("Thiago"));
        
        ArrayList<Conta> contas = new ArrayList<Conta>();
        
        Conta c1 = new Conta(700);
        Conta c2 = new Conta(500.50);
        
        contas.add(c1);
        contas.add(c2);
        
        Collections.sort(nomes);
        
        for(String nome : nomes){
            System.out.println(nome);
        }
        
    }
    
}
