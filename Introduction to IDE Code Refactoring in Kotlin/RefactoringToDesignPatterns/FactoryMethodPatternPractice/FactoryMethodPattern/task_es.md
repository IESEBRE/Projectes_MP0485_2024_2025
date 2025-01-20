Intentemos utilizar el patrón de diseño **Factory Method** para encapsular la creación de objetos y proporcionar un enfoque más flexible y sostenible para manejar diferentes modos de transporte.

Echemos un vistazo al ejemplo en el editor. \
Si deseas añadir nuevos modos de transporte, tendrás que modificar el código del cliente existente en el método main. A medida que aumenta el número de modos de transporte, la estructura `if-else` puede volverse difícil de leer.