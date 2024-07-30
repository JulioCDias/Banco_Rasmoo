public class TesteMetodoReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(2000);
        System.out.println("O Saldo da primera Conta é:"+primeiraConta.saldo);
        System.out.println("O Saldo da Segunda Conta é:"+segundaConta.saldo);

        primeiraConta.transferir(1000, segundaConta);
        System.out.println("O Saldo da primera Conta é:"+primeiraConta.saldo);
        System.out.println("O Saldo da Segunda Conta é:"+segundaConta.saldo);
    }
}
