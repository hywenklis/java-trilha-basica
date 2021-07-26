public class TestaMetodo {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.saldo = 100;
        conta.deposita(50);
        conta.saca(20);

        System.out.println("Saldo da conta1: R$" + conta.saldo);

        boolean conseguiuRetirar = conta.saca(20);

        if (conseguiuRetirar){
            System.out.println("Novo valor R$" +conta.saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar");
        }

        Conta conta2 = new Conta();

        conta2.deposita(1000);

        boolean sucessoTransferencia = conta2.transfere(300,conta);

        if (sucessoTransferencia){
            System.out.println("Transferência com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Novo valor da conta2: R$" + conta2.saldo);
        System.out.println("Novo valor da conta1: R$" + conta.saldo);


        conta.titular = "Paulo silveira";
        System.out.println(conta.titular);
    }
}
