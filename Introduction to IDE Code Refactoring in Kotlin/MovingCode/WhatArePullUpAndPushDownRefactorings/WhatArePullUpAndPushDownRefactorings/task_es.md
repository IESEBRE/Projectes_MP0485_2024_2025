Para evitar la duplicación de código y asegurar la consistencia, utilizamos la _**refactorización Pull Up**_. Si múltiples clases hermanas en una jerarquía de clases definen las mismas propiedades o métodos con la misma firma y cuerpos de métodos idénticos, los movemos a una clase base común. De esta manera, eliminamos el código redundante. Así, cuando solucionamos un problema en un lugar, queda resuelto en todos los lugares donde se reutiliza, lo que previene inconsistencias.

Aplicamos la _**refactorización Push Down**_ cuando una propiedad/método en una superclase es utilizado solo por una de sus subclases. Al mover la propiedad/método a la subclase específica, simplificamos la jerarquía de clases y mejoramos la organización del código. Esta refactorización es el inverso de la refactorización Pull Up.

Para invocar la refactorización Pull Up o Push Down, haz clic en el elemento que deseas mover, presiona **&shortcut:Refactorings.QuickListPopupAction;** (macOS) o **Shift+Ctrl+Alt+T** (Windows/Linux), y selecciona la opción _Pull Members Up_ o _Push Members Down_.

<p align="center">
    <img src="../../../util/src/main/resources/images/MovingCode/WhatArePullUpAndPushDownRefactorings/pull_up_push_down_refactoring.png" alt="Diálogo de Pull Up y Push Down" width="400"/>
</p>