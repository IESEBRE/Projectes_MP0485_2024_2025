# Tarea 1/2: reglas de nombres

El nombrado es una de las partes más importantes de la escritura de código, ya que afecta significativamente la comprensibilidad del código. Un buen nombre debe ser **descriptivo** y **inequívoco** y reflejar claramente lo que hace el código. Nombres pobres conducen a la confusión y dificultan que otros desarrolladores comprendan y reutilicen el código.

Una de las refactorizaciones más frecuentemente utilizadas es la **Refactorización de Renombrado**. Cambiamos el nombre de un elemento de código para hacerlo más expresivo y cumplir con las convenciones de nombrado, o para corregir errores tipográficos.

Aquí hay un **conjunto de reglas** que recomendamos tener en mente cuando intentes crear un buen nombre:
- El nombre de un paquete suele ser un sustantivo en minúsculas o una combinación de sustantivos escritos en camelCase. 
  Por ejemplo, `org.example.project` o `org.example.myProject`.
- El nombre de una clase debe comenzar con una letra mayúscula y contener un sustantivo o una combinación de sustantivos escritos de acuerdo con la convención de nombrado 
  [camelCase](https://en.wikipedia.org/wiki/Camel_case). El nombre debe describir qué es la clase o qué hace. 
  Por ejemplo, `FileReader`, `NetworkManager` o `ErrorReporter`.
- Los nombres de funciones, propiedades y variables locales comienzan con una letra minúscula y usan el caso camel sin guiones bajos.
  Por ejemplo, `getType()`, `handleRecord()`, `createMetaObject()`.
- Utiliza el [Asistente de IA](https://blog.jetbrains.com/idea/2023/06/ai-assistant-in-jetbrains-ides/) para idear mejores nombres para entidades de código si te sientes atascado. 
  Es un plugin de IntelliJ IDEA que utiliza ChatGPT para ayudar con las tareas de programación (disponible solo en las versiones EAP).

**Ver También**: [Reglas de nombrado en Kotlin](https://kotlinlang.org/docs/coding-conventions.html#naming-rules)