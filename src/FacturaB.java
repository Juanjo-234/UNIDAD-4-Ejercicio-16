public class FacturaB implements ComprobanteFiscal{
    double IVA = 0.21;

    @Override
    public void emitirComprobante(double montoNeto) {
        double ivaMonto = montoNeto * IVA;
        double total = montoNeto + ivaMonto;

        System.out.println("---FACTURA B (CONSUMIDOR FINAL/EXCENTO)---");
        System.out.println("Monto neto: " + montoNeto);
        System.out.println("IVA (21%): " + ivaMonto);
        System.out.println("Total a pagar: " + total);
    }
}
