/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveisjava;

/**
 *
 * @author Maciel Oliveira
 */
public class VariaveisJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // As variáveis Java são fortemente tipadas
        //exige que defina um tipo para a variável
        
        int x = 10;
        
        boolean y = false;
        
        //a partir do Java10 foi introduzida a variável "var"
        //Uso do var não obriga colocar o tipo, mas o interpretador entende qual é seu tipo
        var x2 = 20;
        
        var y2 = true;
        
        String nome = "Java";
        System.out.println(nome);
        
        
        
        //Casting - Altera��o de tipos de dados
        //int para long
        //long x = 10;
        
        double x = 35.3;
        
        float x = 40.2F;
        float z = (float)40.3;
        
        //Aqui n�o h� opera��o de casting
        short x = 100;
        
    }
    
    
}
