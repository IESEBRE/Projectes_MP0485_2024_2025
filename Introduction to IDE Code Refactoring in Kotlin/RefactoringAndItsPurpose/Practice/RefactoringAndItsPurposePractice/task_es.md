# Tarea 1/1: Identificar problemas de código y solucionarlos

### Tarea

En esta tarea, practicarás identificando y corrigiendo imperfecciones de código y malas prácticas.
Observa la función de Kotlin `calculate_area`, encuentra problemas relacionados con los nombres, el uso de variables y la legibilidad, y corrígelos.

### Pistas

<div class="hint" title="Pista de variable redundante">

Las variables `length` y `width` son redundantes en este ejemplo, ya que son equivalentes a los parámetros `l`
y `w`.
Por lo tanto, no es necesario crear variables separadas, y se pueden eliminar sin problemas.
</div>

<div class="hint" title="Pista de nombres">

En Kotlin, los nombres de funciones típicamente comienzan con una letra minúscula y siguen la convención `camelCase`, sin guiones bajos.
Por ejemplo, `calculateArea()` parece ser un nombre adecuado para una función, mientras que `calculate_area` o `CalculateArea` son menos preferibles.

Los nombres de los parámetros `l` y `w` no son lo suficientemente claros. Renombrarlos a `length` y `width` mejoraría enormemente la claridad.
</div>

<div class="hint" title="Pista de formato">
En Kotlin, puedes omitir el uso de llaves y la declaración explícita de retorno cuando una función consiste únicamente en una expresión.
Por ejemplo,

```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

podría transformarse en

```kotlin
fun sum(a: Int, b: Int): Int = a + b
```

lo que se conoce como una _función de expresión única_.
</div>