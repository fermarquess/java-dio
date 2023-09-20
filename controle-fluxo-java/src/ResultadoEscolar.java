public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 9;
        //condição ternária - maneira de abreviar uma condição encadeada
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }
}

/**
 * //variável local
        int nota = 5;

        //condicional composta e encadeada
        if (nota >= 7)
        System.out.println("Aprovado");

        else if(nota >= 5 && nota <7) // true or false
        System.out.println("Recuperação");

        else
        System.out.println("Reprovado");
 */