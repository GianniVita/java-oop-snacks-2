public class ContoBancario {
    
    private String numeroConto;
    private double saldo;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    // Condizioni per depositare e prelevare

    public void deposita(double importo){
        if (importo > 0) {
            saldo += importo;
        }
    }

    public void preleva(double importo) {
        if(importo > 0 && importo <= saldo) {
            saldo -= importo;
        }
    }

    
    // setGetters

    public String getNumeroConto() {
        return numeroConto;
    }

    public double getSaldoCorrente() {
        return saldo;
    }




}

