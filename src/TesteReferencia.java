public class TesteReferencia {
    public static void main(String[] args) {
        Conta pConta = new Conta();

        System.out.println(pConta);

        Conta sConta = pConta;

        System.out.println(sConta);
    }
}
