Resolución del ejercicio N°16 de la unidad 4 de prograamción 2.
El programa simula un sistema de facturación y gestión fiscal para una caja registradora aplicando los principios de la Programación Orientada a Objetos (POO). Su propósito principal es demostrar el uso de polimorfismo y herencia o interfaces para procesar de manera unificada diferentes tipos de comprobantes fiscales (Facturas A, Facturas B y Notas de Crédito), cada uno con sus propias reglas de negocio para el cálculo de impuestos, IVA y retenciones a partir de un monto neto.

Clases y Componentes Utilizados
ComprobanteFiscal (Clase Abstracta / Interfaz)

Propósito: Actúa como el contrato base para todos los comprobantes fiscales del sistema. Declara el método abstracto emitirComprobante(double montoNeto) que obliga a las clases concretas a implementar su lógica particular de cálculo y emisión.

FacturaA (Clase Concreta)

Propósito: Modela una factura de tipo A (habitualmente destinada a empresas o responsables inscriptos). Implementa la lógica para calcular el IVA discriminado (tasa general) y las retenciones impositivas correspondientes.

FacturaB (Clase Concreta)

Propósito: Modela una factura de tipo B (generalmente para consumidores finales). Sobrescribe el método de emisión calculando el monto total con el IVA ya incluido (o aplicando las alícuotas correspondientes a este tipo de comprobante).

NotaCredito (Clase Concreta)

Propósito: Modela una nota de crédito fiscal. Aplica una lógica de cálculo inversa o de devolución, restando o ajustando el impacto del importe neto y sus impuestos asociados sobre la operación.

CajaRegistradora (Clase Coordinadora)

Propósito: Funciona como el administrador del sistema de cobros. Mantiene una colección de comprobantes fiscales y permite procesar la emisión de manera masiva y polimórfica sobre todos los elementos registrados.
<img width="525" height="401" alt="Captura de pantalla 2026-10-29 153237" src="https://github.com/user-attachments/assets/091506e7-678a-45d5-803b-f4c296b8da18" />
