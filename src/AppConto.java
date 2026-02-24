public class AppConto {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("IT000141178069");

        conto.deposita(500);

        System.out.println("Numero conto:" + conto.getNumeroConto());
        System.out.println("Saldo corrente:" + conto.getSaldoCorrente());
    }
}
