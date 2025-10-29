public class Pedido {
    private EstadoPedido estadoAtual;
    private String pedidoId;

    public Pedido(String pedidoId) {
        this.pedidoId = pedidoId;
        this.estadoAtual = new PedidoNovoEstado();
        System.out.println("Pedido #" + pedidoId + " criado. Estado: " + estadoAtual.getNome());
    }

    public void setEstado(EstadoPedido novoEstado) {
        this.estadoAtual = novoEstado;
        System.out.println("Pedido #" + pedidoId + " mudou para o estado: " + estadoAtual.getNome());
    }

    public EstadoPedido getEstado() {
        return this.estadoAtual;
    }

    public void pagar() {
        estadoAtual.pagar(this);
    }

    public void enviar() {
        estadoAtual.enviar(this);
    }

    public void entregar() {
        estadoAtual.entregar(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }
}
