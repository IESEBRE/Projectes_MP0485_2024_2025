Intentemos implementar un patrón Facade para encapsular las interacciones entre diferentes clases.

Echemos un vistazo al ejemplo en el editor.

Hay cuatro clases: `VideoLoader`, `VideoProcessor`, `VideoEncoder` y `VideoSaver`.  
En el método `main`, creamos un objeto de cada clase e invocamos algunos métodos.

En general, al código le falta una interfaz limpia para que el cliente interactúe con el sistema, lo que puede derivar en desafíos de mantenimiento.  
Aquí es donde el patrón de diseño **Facade** puede ayudar al **proporcionar una interfaz de alto nivel** y encapsular la complejidad del sistema.