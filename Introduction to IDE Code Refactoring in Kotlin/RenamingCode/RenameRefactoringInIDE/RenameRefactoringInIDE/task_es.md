# Tarea 1/3: Refactorización de renombrar en IDE

Si deseas renombrar una entidad de código, puedes hacer clic en el nombre de la entidad y presionar el atajo **&shortcut:RenameElement;** (macOS) o **Shift+F6** (Windows/Linux). El IDE proporcionará varias opciones para renombrar; puedes elegir una de ellas o escribir tu propia versión. Después de elegir un nuevo nombre, el **IDE cambiará automáticamente todas las apariciones de la entidad** de acuerdo con el nuevo nombre, no solo en el código fuente sino también en los comentarios del código.

Alternativamente, puedes renombrar los elementos de código manualmente, pero es tedioso y no seguro. Puedes cambiar el nombre y luego usar los errores de compilación para rastrear todos los sitios de llamada al elemento renombrado. Este método puede funcionar, aunque es lento y propenso a errores. Pueden ocurrir algunos problemas al hacer un renombrado manual: por ejemplo, anulación accidental de métodos o sombreamiento accidental de nombres para variables y campos.

IntelliJ IDEA verifica la **ortografía** de todo el código fuente y los comentarios en el proyecto y destaca los errores tipográficos si los hay. También proporciona una corrección rápida para los errores tipográficos. Además, revisa la gramática en los archivos JavaDocs y README.md y ofrece correcciones automáticas.

**Ver También**: [Corrección ortográfica en IntelliJ IDEA](https://www.jetbrains.com/help/idea/spellchecking.html)