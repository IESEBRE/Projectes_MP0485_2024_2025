# Tarea 1/4: ¿Qué es el formateo?

El **_estilo de código_** es un conjunto de pautas utilizadas en un equipo de desarrollo sobre cómo escribir código.
Generalmente, el estilo de código depende del lenguaje de programación y las preferencias de los desarrolladores e incluye reglas sobre el formateo,
documentación, convenciones de nomenclatura y otros aspectos que afectan la legibilidad del código.

El **_formateo de código_** se refiere a la disposición del código, incluyendo la sangría, el espaciado, los saltos de línea y otras convenciones estilísticas.
Una sangría consistente, un espaciado claro y saltos de línea lógicos ayudan a los desarrolladores a entender rápidamente la estructura del código,
el flujo y las relaciones entre los diferentes elementos del código.

Veamos dos fragmentos de código simples.

**Antes de corregir el formateo:**
```kotlin
fun calculateRectangleArea(length:Double,width:Double): Double{
    return length*width }

fun main(){
    val l= 5.0; val w=3.0; val area=calculateRectangleArea(l,w)
    println("Rectangle area: $area")
}
```
Este fragmento de código no tiene una sangría consistente ni un espaciado adecuado, lo que hace que el código sea difícil de leer y entender.

**Después de corregir el formateo:**
```kotlin
fun calculateRectangleArea(length: Double, width: Double) = length * width

fun main() {
    val length = 5.0
    val width = 3.0
    val area = calculateRectangleArea(length, width)
    println("Rectangle area: $area")
}
```
En Kotlin, puedes omitir las llaves y la declaración de retorno si una función tiene solo una expresión.
Esto hace que el código sea más conciso y fácil de leer.

La **versión refactorizada** demuestra un mejorado formateo y nomenclatura, lo que lleva a una mejor legibilidad y mantenibilidad.

<div class="hint" title="role del formateo de código en la revisión de código">

Uno de los ejemplos que muestra cómo la falta de consistencia puede ser confusa es el proceso de revisión de código.
En la vida real, los desarrolladores utilizan sistemas de control de versiones para compartir su código con colegas, y **el formateo inconsistente
complica el proceso de revisión de código**.
Imagina que tú y tu colega utilizan estilos de formateo diferentes, y tu colega hace un cambio menor en el código pero luego lo formatea según su estilo.
Esto conducirá a una situación en la que ves muchos cambios en las líneas de código, pero en realidad solo un par de líneas contienen cambios funcionales.
Es uno de los ejemplos de por qué debes prestar atención al formateo.
</div>