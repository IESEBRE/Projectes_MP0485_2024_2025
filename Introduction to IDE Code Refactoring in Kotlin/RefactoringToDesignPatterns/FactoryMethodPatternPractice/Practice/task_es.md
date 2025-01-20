### Tarea

- Crea una clase `TransportationServiceFactory` con el método `getTransportation(transport: String)`.
  Este método debe devolver un transporte apropiado basado en el nombre de transporte dado, utilizando la construcción `when`.

- En el método principal, crea una instancia de la clase `TransportationServiceFactory`, añade una invocación del
  método `getTransportation`, e invoca el método `drive`.

### Consejos

<div class="hint" title="¿Dónde comenzar?">

El archivo donde debes escribir el código ya está abierto.
Por favor, crea una nueva clase llamada `TransportationServiceFactory` e implementa el método `getTransportation`.
</div>

<div class="hint" title="¿Cómo debería ser la clase TransportationServiceFactory?">

Examina el código en el método `main` para identificar las líneas que crean transportes específicos basados en sus nombres.
Luego, mueve esas líneas manualmente al método `getTransportation(transport: String)` en la clase `TransportationServiceFactory`.

</div>

<div class="hint" title="¿Cómo arreglar el método main?">

```kotlin
fun main(args: Array<String>) {
    val transportName = args[0]
    val driveMessage = TransportationServiceFactory().getTransportation(transportName).drive()
    println(driveMessage)
}
```

</div>