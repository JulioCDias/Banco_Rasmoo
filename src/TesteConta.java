public class TesteConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //Instancia de um objeto
        primeiraConta.agencia = 1;
        primeiraConta.numero = 86975;
        //primeiraConta.titular = "Julio Cesar Dias";
        primeiraConta.saldo = 6100.09;

        System.out.println("O titilar da Primeira conta é: "+primeiraConta.titular+
                "\n a Agencia é: "+primeiraConta.agencia+
                "\n o Numero da conta é: "+primeiraConta.numero+
                "\n e o Saldo é:"+primeiraConta.saldo);
    }
}
