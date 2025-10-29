public class PedidoPagoEstado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já está pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Separando e enviando o pedido...");
        pedido.setEstado(new PedidoEnviadoEstado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido ainda não foi enviado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Cancelando pedido pago. (Iniciando processo de estorno)...");
        pedido.setEstado(new PedidoCanceladoEstado());
    }

    @Override
    public String getNome() {
        return "Pago";
    }
}
