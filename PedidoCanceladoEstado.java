public class PedidoCanceladoEstado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível pagar um pedido cancelado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível enviar um pedido cancelado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível entregar um pedido cancelado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já está cancelado.");
    }

    @Override
    public String getNome() {
        return "Cancelado";
    }
}
