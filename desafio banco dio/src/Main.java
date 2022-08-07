public class Main {

    public static void main(String[]args){
        // Crianddo conta
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        //Depositar
        cc.depositar(600);
        poupanca.depositar(300);

        //Sacar
        cc.sacar(150);
        poupanca.sacar(187);


        //Imprimindo valores
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }

}
