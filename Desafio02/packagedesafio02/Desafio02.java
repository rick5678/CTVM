package packagedesafio02;

import javax.swing.JOptionPane;

public class Desafio02 {
    private static int contagemZero, maiorSequencia;

    public static void main(String[] args) {
        System.out.println("Descubra a Representação Binária de um número.");
        String numero = JOptionPane.showInputDialog("Digite um número: ");
        int numeroRep = Integer.parseInt(numero);
        System.out.println("A maior sequência de zeros é: " + representacaoBinaria(numeroRep));
    }

    public static int representacaoBinaria(int numeroRep) {
        while (numeroRep > 1) {
            if (numeroRep % 2 == 0) {
                contagemZero++;
            } else {
                maiorSequencia = contagemZero;
                contagemZero = 0;
            }
            numeroRep = numeroRep / 2;
            if (contagemZero > maiorSequencia) {
                maiorSequencia = contagemZero;
            }
        }  
        return maiorSequencia;
    }
}