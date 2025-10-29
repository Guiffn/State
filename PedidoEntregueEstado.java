public class PedidoEntregueEstado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já foi entregue.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já foi entregue.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já foi entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já foi entregue. (Processo de devolução deve ser iniciado).");
    }

    @Override
    public String getNome() {
        return "Entregue";
    }
}
