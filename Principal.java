public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Simulação 1: Fluxo Completo ---");
        Pedido pedido1 = new Pedido("A001"); // Estado: Novo

        pedido1.enviar();   // Ação inválida
        pedido1.pagar();    // Novo -> Pago
        pedido1.pagar();    // Ação inválida
        pedido1.enviar();   // Pago -> Enviado
        pedido1.cancelar(); // Ação inválida
        pedido1.entregar(); // Enviado -> Entregue
        pedido1.entregar(); // Ação inválida

        System.out.println("\nEstado final do Pedido #A001: " + pedido1.getEstado().getNome());

        System.out.println("\n--- Simulação 2: Fluxo de Cancelamento ---");
        Pedido pedido2 = new Pedido("B002"); // Estado: Novo

        pedido2.pagar();    // Novo -> Pago
        pedido2.cancelar(); // Pago -> Cancelado
        pedido2.enviar();   // Ação inválida

        System.out.println("\nEstado final do Pedido #B002: " + pedido2.getEstado().getNome());

        System.out.println("\n--- Simulação 3: Cancelamento Imediato ---");
        Pedido pedido3 = new Pedido("C003"); // Estado: Novo
        pedido3.cancelar(); // Novo -> Cancelado
        pedido3.pagar();    // Ação inválida

        System.out.println("\nEstado final do Pedido #C003: " + pedido3.getEstado().getNome());
    }
}
