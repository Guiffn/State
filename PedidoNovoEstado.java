public class PedidoNovoEstado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Processando pagamento...");
        pedido.setEstado(new PedidoPagoEstado());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível enviar um pedido que não foi pago.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível entregar um pedido que não foi pago.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Cancelando pedido novo...");
        pedido.setEstado(new PedidoCanceladoEstado());
    }

    @Override
    public String getNome() {
        return "Novo";
    }
}
