//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CajaRegistradora caja = new CajaRegistradora();

    caja.agregarComprobante(new FacturaA());
    caja.agregarComprobante(new FacturaB());
    caja.agregarComprobante(new NotaCredito());

    double montoVentaBase = 10000.00;
    caja.procesarComprobante(montoVentaBase);
}
