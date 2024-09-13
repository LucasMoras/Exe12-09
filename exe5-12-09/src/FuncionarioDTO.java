public class FuncionarioDTO {
    private String nome;
    private double salarioBase;
    private double horasExtras; // Aplicável apenas para Programador

    public FuncionarioDTO(String nome, double salarioBase, double horasExtras) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
}
