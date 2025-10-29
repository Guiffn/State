public class PedidoEnviadoEstado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já foi pago e enviado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já foi enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Confirmando a entrega do pedido...");
        pedido.setEstado(new PedidoEntregueEstado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível cancelar um pedido que já está em trânsito.");
    }

    @Override
    public String getNome() {
        return "Enviado";
    }
}
