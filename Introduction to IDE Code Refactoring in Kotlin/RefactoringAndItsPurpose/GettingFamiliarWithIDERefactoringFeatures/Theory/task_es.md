# Tarea 1/1: Familiarizándose con las funciones de refactorización del IDE

Hay dos lugares para explorar las acciones de refactorización disponibles en el IDE: los diálogos **Refactor This** y **Search Everywhere**.

### Refactor This
Para invocar la refactorización en IntelliJ IDEA, selecciona un elemento a refactorizar (una variable, método, clase, paquete, etc.) y presiona **&shortcut:Refactorings.QuickListPopupAction;** (macOS) o **Shift+Ctrl+Alt+T** (Windows/Linux) para abrir una lista de refactorizaciones que se pueden aplicar. También puedes usar un atajo para invocar una refactorización específica.

Es posible deshacer cualquier refactorización presionando **&shortcut:$Undo;** (macOS) o **Ctrl + Z** (Windows/Linux).

<p align="center">
    <img src="../../../util/src/main/resources/images/RefactoringAndItsPurpose/GettingFamiliarWithIDERefactoringFeatures/refactor_this.png" alt="Refactor This" width="400"/>
</p>

### Search Everywhere
Si deseas refactorizar algún código y no estás familiarizado con los atajos de refactorización del IDE, puedes abrir el diálogo **Search Everywhere** y escribir el nombre de la acción que te gustaría realizar.

Para abrir el diálogo **Search Everywhere**, presiona **⇧⇧** (macOS) o **Shift+Shift** (Windows/Linux).

Por ejemplo, si deseas extraer una función o explorar cualquier posibilidad de extracción en el IDE, abre el diálogo **Search Everywhere**, escribe “Extract” y te mostrará las opciones disponibles.
<p align="center">
    <img src="../../../util/src/main/resources/images/RefactoringAndItsPurpose/GettingFamiliarWithIDERefactoringFeatures/search_everywhere.png" alt="Search Everywhere" width="400"/>
</p>

Además, para algunas refactorizaciones, IntelliJ IDEA permite a los usuarios ver una vista previa antes de aplicar los cambios. Puede ser útil si no estás seguro de cómo los cambios de refactorización afectarían tu código y quieres asegurarte de que funcionará como esperas.

### Atajos de refactorización
Aquí hay una tabla con las refactorizaciones más populares y los atajos para invocarlas:

| Tipo de refactorización | Descripción                                                          | Atajo                                                             |
|-------------------------|----------------------------------------------------------------------|-------------------------------------------------------------------|
| **Refactor This**       | Muestra las opciones de refactorización disponibles.                 | ⌃T (macOS) o Shift+Ctrl+Alt+T (Windows/Linux)                     |
| **Rename**              | Cambia el nombre del elemento de código.                             | &shortcut:RenameElement; (macOS) o Shift+F6 (Windows/Linux)       |
| **Change Signature**    | Permite cambiar el nombre del método, parámetros y tipo de retorno. | &shortcut:ChangeSignature; (macOS) o Ctrl+F6 (Windows/Linux)      |
| **Introduce Variable**  | Extrae un valor en una nueva variable.                               | &shortcut:IntroduceVariable; (macOS) o Ctrl+Alt+V  (Windows/Linux)|
| **Inline**              | Remueve una variable/método y pone su cuerpo en el lugar donde se usa. | &shortcut:Inline; (macOS) o Ctrl+Alt+N (Windows/Linux)           |
| **Extract Function**    | Crea un nuevo método y mueve un fragmento de código seleccionado a él. | &shortcut:ExtractMethod; (macOS) o Ctrl+Alt+M (Windows/Linux)    |
| **Move**                | Mueve un método/clase a otro lugar en la base de código.             | &shortcut:DatabaseView.MoveToGroup; (macOS) o F6 (Windows/Linux) |

Discutiremos estas y otras refactorizaciones en las siguientes lecciones.

**Ver también**: [Hoja de atajos de teclado de IntelliJ IDEA](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)