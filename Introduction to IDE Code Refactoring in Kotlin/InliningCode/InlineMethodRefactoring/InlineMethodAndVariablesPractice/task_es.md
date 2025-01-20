# Tarea 2/2: Métodos y variables en línea

### Tarea

En esta tarea, necesitas identificar variables y métodos innecesarios e insertarlos en línea usando la refactorización automática Inline.

### Pistas

<div class="hint" title="Atajo para la refactorización Inline">
Para aplicar la refactorización Inline, selecciona el código que deseas insertar en línea y presiona el atajo &shortcut:Inline; (macOS) o Ctrl+Alt+N (Windows/Linux).
</div>

<div class="hint" title="Pista de refactorización">

La variable `totalPrice` en el método `calculateTotalPrice` es redundante y podría ser insertada en línea.

Las variables `text` y `file` en el método `logError` son redundantes y podrían ser insertadas en línea.

Dado que el método `logError` contiene solo una línea y se utiliza solo en un método, también podría ser insertado en línea.

</div>