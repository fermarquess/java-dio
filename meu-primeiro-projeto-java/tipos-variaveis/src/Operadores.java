public class Operadores {
    public static void main(String[] args) {
        // operadores lógicos

        boolean condicao1=true;
        boolean condicao2=true;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");
        
}

}



         /* operador de atribuição 
        String nome = "Fernanda";
        int idade = 29;
        double peso = 63.1;
        char sexo = 'F';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date();

         operador aritméticos

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
        */
        /*String nomeCompleto = "linguagem " + "Java";
        System.out.println(nomeCompleto);*/
        /* 
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }


      int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = + numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);


        int numero = 5;
        
        //x repetição
        //numero++;
        //numero = numero + 1;

        System.out.println( ++ numero);

        System.out.println(numero);


        boolean variavel = true;

        variavel = !variavel;
        
        System.out.println(variavel);


        // operador ternário

         int a, b;

        a = 6;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);


        // operador relacional

         int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }else
            System.out.println("a nossa condição é falsa");

        System.out.println("numeroUm é igual a numeroDois? " + simNao);


        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois ?" + simNao);


        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois ?" + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior ou igual a numeroDois ?" + simNao);

        String nomeUm = "Fernanda";
        String nomeDois = new String("Fernanda");

        System.out.println(nomeUm.equals(nomeDois));

        // método .equals deve ser utilizado para objetos
   
*/