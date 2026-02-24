public class ContoBancario {
    
    private String numeroConto;
    private double saldo;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public void deposita(double importo){
        if (importo > 0) {
            saldo += importo;
        }
    }

    public String getNumeroConto() {
        return numeroConto;
    }
    public double getSaldoCorrente() {
        return saldo;
    }




}

