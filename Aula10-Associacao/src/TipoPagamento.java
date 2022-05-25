public final class TipoPagamento {
    
    private double valor;
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double credito(double valor){
        return valor*1.05;
    }

    public double debito(double valor){
        return valor;
    }

    @Override
    public String toString() {
        return "{" +
            " valor='" + getValor() + "'" +
            "}";
    }
}
