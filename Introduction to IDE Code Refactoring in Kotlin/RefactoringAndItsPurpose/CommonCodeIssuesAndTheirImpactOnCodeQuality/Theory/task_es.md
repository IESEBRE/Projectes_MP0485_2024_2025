# Tarea 1/2: Problemas comunes de código y su impacto en la calidad del código

Martin Fowler introdujo el término **_code smell_**, que indica que el código podría tener algunos problemas o deficiencias en su implementación. Esto no significa necesariamente que el código tenga errores, pero el código con malos olores hace que la comprensión, desarrollo y mantenimiento del mismo sea mucho más complejo.

Ignorar los code smells lleva a un aumento de la deuda técnica. Resolver los code smells mediante la refactorización mejora la calidad del código base y lo hace más claro y extensible.

En este curso, echaremos un vistazo a varios problemas de calidad del código, como métodos largos, listas largas de parámetros, código duplicado, clases grandes, envidia de características y hombre intermedio.

Echemos un vistazo a los fragmentos de código anteriores.

**Antes de la refactorización:**

```kotlin
class Order(
    val customerId: Int,
    val orderId: Int,
    val productName: String,
    val productCategory: String,
    val productPrice: Double,
    val productStockQuantity: Int,
    val productSupplier: String,
    val quantity: Int,
    val shippingAddress: String,
) {

    fun processOrder() {
        // Procesa el pedido con los parámetros proporcionados
    }
}
```

En este fragmento de código, la clase `Order` toma **9** parámetros en el constructor, lo cual hace que el código sea menos legible y más difícil de entender. Una situación en la que una clase o método toma muchos parámetros se llama **_Long Parameter List_** (lista larga de parámetros). A medida que aumenta el número de parámetros, se vuelve desafiante hacer un seguimiento de su orden y propósito, lo que lleva a potenciales errores y dificultades de mantenimiento.

**Después de la refactorización:**

```kotlin
data class Product(
    val name: String,
    val category: String,
    val price: Double,
    val stockQuantity: Int,
    val supplier: String,
)

class Order(
    val customerId: Int,
    val orderId: Int,
    val product: Product,
    val quantity: Int,
    val shippingAddress: String,
) {

    fun processOrder() {
        // Procesa el pedido usando los detalles del producto
    }
}
```

La refactorización abordó el problema de la _Long Parameter List_ introduciendo una clase de datos separada llamada `Product` para encapsular los parámetros relacionados con el producto. El código se volvió más legible ya que los datos relacionados con el producto están encapsulados en un solo objeto `Product`, promoviendo mejores principios de diseño.