import java.util.ArrayList;
import java.util.List;

public class CajaRegistradora {
    List<ComprobanteFiscal>comprobantes;

    public CajaRegistradora(){
        this.comprobantes = new ArrayList<>();
    }

    public void agregarComprobante(ComprobanteFiscal comprobante){
        comprobantes.add(comprobante);
    }


    public void procesarComprobante(double montoBase){
        System.out.println("=== INICIANDO EMISIÓN MASIVA DE COMPROBANTES ===");
        System.out.println("================================================\n");
        for(ComprobanteFiscal comprobante : comprobantes){
            comprobante.emitirComprobante(montoBase);
        }
    }

}
