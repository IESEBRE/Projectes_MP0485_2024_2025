### Tarea

En esta tarea, hay tres archivos:
- `Animal` - interfaz base para diferentes tipos de animales, contiene varios métodos.
- `Cat` - representa un gato e implementa la interfaz Animal.
- `Dog` - representa un perro e implementa la interfaz Animal.

Observa las clases `Cat` y `Dog` e identifica un método y propiedades que no son específicas de un tipo de animal y muévelas a la interfaz base `Animal` utilizando la refactorización Pull Up.

### Sugerencias

<div class="hint" title="Atajo para refactorizaciones Pull Up">

Usa el atajo &shortcut:Refactorings.QuickListPopupAction; (macOS) o `Shift+Ctrl+Alt+T` (Windows/Linux) para hacer Pull Up de un elemento de código.

</div>

<div class="hint" title="Sugerencia de refactorización">

Haz Pull Up de las propiedades `name` y `age` a la interfaz `Animal` y añade el modificador `override` antes de sus declaraciones en los constructores de `Cat` y `Dog`.

Haz Pull Up del método `play()` a la interfaz `Animal` y añade el modificador `override` antes de sus implementaciones en las clases `Cat` y `Dog`.
</div>