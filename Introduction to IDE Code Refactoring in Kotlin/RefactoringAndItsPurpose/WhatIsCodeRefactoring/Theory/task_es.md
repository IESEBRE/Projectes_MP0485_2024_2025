# Tarea 1/2: ¿Qué es la refactorización de código?

**_Refactorización_** es un proceso de modificar el código fuente sin alterar su comportamiento. Por ejemplo, renombrar un método o extraer una _constante mágica_ en una variable separada. Mejora la legibilidad del código, pero no cambia lo que hace.

El propósito de la refactorización es **mejorar la legibilidad del código y simplificar su mantenimiento**. Por lo general, los desarrolladores de software trabajan en equipos en bases de código y pasan un tiempo considerable leyendo el código de otros, por lo que es importante hacer tu código claro y limpio.

Veamos dos fragmentos de código a continuación.

**Antes de la refactorización:**

```kotlin
fun calculate(r: Double): Double {
    return 3.14159 * r * r
}

fun main() {
    val n = 5.0
    val result = calculate(n)
    println("Circle area is: $result")
}
```

En este fragmento de código, el nombre del método `calculate` no es descriptivo, lo que hace poco claro lo que calcula. La variable `n` y el parámetro del método `r` no proporcionan ninguna información sobre su propósito. La constante `3.14159` está codificada dentro del método, lo que lleva a una falta de claridad.

**Después de la refactorización:**

```kotlin
const val PI_VALUE = 3.14159

fun calculateCircleArea(radius: Double): Double = PI_VALUE * radius * radius

fun main() {
    val circleRadius = 5.0
    val area = calculateCircleArea(circleRadius)
    println("Circle area is: $area")
}
```

Para mejorar la legibilidad del fragmento de código original, se aplicaron las siguientes refactorizaciones:

- El método `calculate` fue **renombrado** a `calculateCircleArea` para expresar mejor su propósito: calcular el área de un círculo.
- Se omitieron las llaves y la instrucción return porque la función contiene solo una expresión única.
- La variable `n` fue **renombrada** a `circleRadius` para mejorar la claridad del código.
- El parámetro `r` fue **renombrado** a `radius` para mejorar la claridad del código.
- Se **extrajo** la constante `PI_VALUE` para contener el valor de `Pi`, haciendo la fórmula de cálculo más comprensible y reutilizable.