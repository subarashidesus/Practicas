import java.util.Scanner;

public class EstadoPedido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el estado de pago y envío
        System.out.println("Estado de pago (pagado/pendiente): ");
        String estadoPago = scanner.nextLine().toLowerCase();
        
        System.out.println("Estado de envío (enviado/pendiente): ");
        String estadoEnvio = scanner.nextLine().toLowerCase();
        
        // Determinar el estado del pedido
        if (estadoPago.equals("pagado")) {
            if (estadoEnvio.equals("enviado")) {
                System.out.println("El pedido ha sido pagado y enviado.");
            } else if (estadoEnvio.equals("pendiente")) {
                System.out.println("El pedido ha sido pagado pero aún no ha sido enviado.");
            } else {
                System.out.println("Estado de envío inválido.");
            }
        } else if (estadoPago.equals("pendiente")) {
            if (estadoEnvio.equals("enviado")) {
                System.out.println("El pedido está pendiente de pago pero ya ha sido enviado.");
            } else if (estadoEnvio.equals("pendiente")) {
                System.out.println("El pedido está pendiente de pago y de envío.");
            } else {
                System.out.println("Estado de envío inválido.");
            }
        } else {
            System.out.println("Estado de pago inválido.");
        }
        
        scanner.close();
    }
}
