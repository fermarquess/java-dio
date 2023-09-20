public class CaixaEletronico {

    //escopo de método
    public static void main(String[] args) {
        //variáveis locais
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        //controle de fluxo - condicional simples e composta

        if(valorSolicitado < saldo){

            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);

        }else 
            System.out.println("Saldo insuficiente");    

    }
}
