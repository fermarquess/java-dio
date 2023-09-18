package edu.fernanda.segundasemana;
public class MinhaClasse {
    
public static void main(String[] args) {

    String primeiroNome = "Fernanda";
    String segundoNome = "Marques";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {

    return "resultado do retorno "+ primeiroNome.concat(" ").concat(segundoNome);
}

}
