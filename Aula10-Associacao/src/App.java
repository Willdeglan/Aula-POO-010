public class App {
    public static void main(String[] args) throws Exception {
        
        Pagamento p1 = new Pagamento();
        TipoPagamento tp = new TipoPagamento();

        tp.setValor(100);
        
        tp.credito();
        System.out.println(tp.toString());

        System.out.println(tp.credito());

        System.out.println(tp.debito());

    }
}
