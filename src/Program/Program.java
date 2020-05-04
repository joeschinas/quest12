/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import entidades.ConjuntoDeNotas;
import entidades.Notas;
import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Quantas desejar salvar ?");
        Integer n = read.nextInt();
        ConjuntoDeNotas conjuNotas = new ConjuntoDeNotas();
        for(int i=1; i<=n; i++){
                 
        System.out.println("Digite nota #"+i+":");
        Double notas= read.nextDouble();
        
        Notas nota = new Notas(notas);    
      
        conjuNotas.addNotas(nota); 
       
        }
        System.out.println("Media dos alunos"+conjuNotas.mediaNotas());
        conjuNotas.maxNotas();
        conjuNotas.minNotas();
   
        read.close();
    }
}
