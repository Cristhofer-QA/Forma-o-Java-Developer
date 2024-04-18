package edu.cristhofer.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Cristhofer";
        String segundoNome = "Mian";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}