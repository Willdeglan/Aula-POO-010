public class Pagamento {
    
    private TipoPagamento tipoPagamento;

    
    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "{" +
            " tipoPagamento='" + getTipoPagamento() + "'" +
            "}";
    }
}
