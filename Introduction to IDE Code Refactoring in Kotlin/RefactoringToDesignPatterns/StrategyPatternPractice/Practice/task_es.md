### Tarea

- Crea una interfaz base `PaymentStrategy` para las clases de estrategia de pago con el método `processPayment(amount: Double)`.
- Implementa una clase separada para cada método de pago: `CreditCardPayment`, `PayPalPayment`, y `BitcoinPayment`.
  Cada una de estas clases debe implementar la interfaz base `PaymentStrategy` y sobrescribir el método `processPayment()`.
- Crea una clase `PaymentProcessor` que encapsule el comportamiento de pago. 
  Esta clase debe recibir como parámetro del constructor `paymentStrategy: PaymentStrategy` 
  y debe contener el método `processOrderPayment`, que invoca el método `processPayment` de `paymentStrategy`.
- Transforma la clase `Order` en una `data class` que encapsule los detalles relacionados con el precio y la fecha del pedido.
- Dentro del método `Main::main`, instancia un objeto `Order` para cada pedido y un `PaymentProcessor` para cada tipo de pago.
  Asegúrate de pasar la estrategia de pago correspondiente al crear el objeto `PaymentProcessor`.

Usando el patrón de diseño **Strategy**, la lógica de procesamiento de pagos se separa de la clase `Order`, 
haciéndola más flexible y mantenible.
Agregar nuevos métodos de pago o modificar los existentes es más fácil y no afecta a la clase `Order`.
El código del cliente también se vuelve más limpio, ya que se centra en crear instancias de `PaymentProcessor` con las estrategias de pago deseadas.

### Pistas

<div class="hint" title="¿Por dónde empezar?">

El archivo donde debes escribir el código ya está abierto.
Por favor, crea una interfaz llamada `PaymentStrategy` y añade el método `processPayment(amount: Double)`.
</div>

<div class="hint" title="¿Cómo debería verse la clase PaymentProcessor?">

Aquí está el código de PaymentProcessor:

```kotlin
class PaymentProcessor(private val paymentStrategy: PaymentStrategy) {
  fun processOrderPayment(amount: Double) = paymentStrategy.processPayment(amount)
}
```

</div>

<div class="hint" title="¿Cómo deberían verse las subclases de PaymentStrategy?">

Por ejemplo, para un tipo de pago con tarjeta de crédito, el código sería:

```kotlin
class CreditCardPayment : PaymentStrategy {
    override fun processPayment(amount: Double) = println("Procesando pago con tarjeta de crédito: $amount")
}
```

</div>

<div class="hint" title="¿Cómo arreglar el método main?">

En el método main, **para cada pedido**, debes instanciar un objeto `Order`, proporcionándole el total correspondiente y la fecha.
Luego, necesitas instanciar un objeto `PaymentProcessor`, suministrándole la estrategia de pago adecuada como argumento.
Finalmente, debes invocar el método `processOrderPayment()`.
Por ejemplo, el código para procesar un pago con tarjeta de crédito sería:

```kotlin
val order1 = Order(100.0, LocalDate.of(2023, 3, 1))
val creditCardPayment = PaymentProcessor(CreditCardPayment())
creditCardPayment.processOrderPayment(order1.totalAmount)
```

</div>