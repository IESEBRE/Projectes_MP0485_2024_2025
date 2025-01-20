### Tarea

- Crea una clase llamada `VideoConversionFacade`. Esta clase debe proporcionar una interfaz simplificada para la conversión de video, encapsulando las complejidades del proceso de conversión.

- Luego, dentro del método `Main::main()`, identifica las sentencias específicamente relacionadas con la conversión de video; estas deben cubrir la carga, el procesamiento, la codificación y el guardado del video. Después de identificarlas, extrae estas sentencias en un nuevo método. Nombra este método `convertVideo` y asegúrate de que acepte dos parámetros, ambos del tipo `String`. Luego, mueve este método a la clase `VideoConversionFacade` y hazlo `public`.

- Además, traslada las declaraciones de `videoLoader`, `videoProcessor`, `videoEncoder` y `videoSaver` para que se conviertan en propiedades `private` de la clase `VideoConversionFacade`.

- Finalmente, cambia el método principal: debe crear una instancia de la clase `VideoConversionFacade` e invocar el método `convertVideo`.

### Pistas

<div class="hint" title="¿Dónde empezar?">

El archivo donde debes escribir el código ya está abierto. Por favor, crea una nueva clase vacía llamada `VideoConversionFacade`.
</div>

<div class="hint" title="Pista de refactorización">

En el archivo `Main`, identifica las sentencias dentro del método `main` que manejan la conversión de video. Aplica el refactorización de extracción de método en estas sentencias y nombra el método resultante como `convertVideo`. Luego, necesitarás transferir manualmente este método recién formado a la clase `VideoConversionFacade`.

Por favor, ten en cuenta: hasta ahora, en Kotlin, la refactorización de mover método se limita a declaraciones de nivel superior y clases anidadas.
</div>

<div class="hint" title="Cómo arreglar el método principal">

En el método `main`, necesitas crear una nueva instancia de la clase `VideoConversionFacade` y luego llamar al método `convertVideo`, pasando dos parámetros: `originalMethodName` y `convertedMethodName`.
</div>