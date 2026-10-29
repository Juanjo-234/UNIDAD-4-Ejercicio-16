public class FacturaA implements ComprobanteFiscal{
    private double IVA = 0.21;
    private double Retencion_ganacias = 0.05;
    private double Retencion_IIBB = 0.03;

    @Override
    public void emitirComprobante(double montoNeto) {
        double ivaMonto = montoNeto * IVA;
        double retencionGanacias = montoNeto * Retencion_ganacias;
        double retencionIIBB = montoNeto * Retencion_IIBB;
        double total = montoNeto + ivaMonto + retencionGanacias + retencionIIBB;


        System.out.println("---FACTURA A (RESPONSABLE INSCRIPTO)---");
        System.out.println("Monto neto: " + montoNeto);
        System.out.println("IVA (21%): " + ivaMonto);
        System.out.println("Retencion Ganacias: " + retencionGanacias);
        System.out.println("Retencion IIBB: " + retencionIIBB);
        System.out.println("Total a pagar: " + total);
    }
}
