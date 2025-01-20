### Tarea

En el archivo `Animal`, hay métodos comunes para todos los tipos de animales como `sleep()` y `eat()`. Necesitas identificar métodos que son específicos para algunos animales y aplicar la refactorización de Push Down para moverlos a las clases correspondientes desde la interfaz base.

### Sugerencias

<div class="hint" title="Atajo para refactorizaciones Push Down">

  Utiliza el atajo &shortcut:Refactorings.QuickListPopupAction; (macOS) o `Shift+Ctrl+Alt+T` (Windows/Linux) para realizar un Push Down de un elemento de código.
</div>

<div class="hint" title="Sugerencia de refactorización">

Asegúrate de eliminar los métodos no relevantes después de la refactorización en las clases `Cat` y `Dog`. Por ejemplo, el método `meow()` debería estar solo en la clase `Cat`.
</div>