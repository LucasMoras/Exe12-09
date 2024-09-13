public class ContasDTO {
    private String tipo;
    private double saldo;

    public ContasDTO(String tipo, double saldo) {
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
