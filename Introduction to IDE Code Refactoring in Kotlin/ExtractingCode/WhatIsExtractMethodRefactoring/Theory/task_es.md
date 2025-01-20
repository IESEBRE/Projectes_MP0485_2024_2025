# Tarea 1/2: ¿Qué es la refactorización de Método de Extracción?

Como mencionamos antes, **el código duplicado puede llevar a efectos indeseables**, como cuando corriges un bug en un lugar
pero olvidas corregirlo consistentemente en las duplicaciones.
El bug seguirá presente y ahora será incluso más difícil de encontrar.

Recomendamos evitar el código duplicado, pero ¿qué puedes hacer si ya existe?
La solución es **extraer el código duplicado a una nueva función separada** y reemplazar todos los fragmentos de código duplicados
con llamadas a la nueva función introducida.
Esto se llama **Método de Extracción**.

Además, aplicamos la refactorización de Método de Extracción cuando encontramos **métodos largos**.
Aunque no hay un límite fijo en el número de líneas que debe tener un método, **considera extraer 
un bloque de instrucciones de código a un método separado** si esas instrucciones son cohesivas
y exponen una pieza de funcionalidad que puede reutilizarse en otros lugares.
Esto también mejora la legibilidad y organización del código.

Funciones más pequeñas hacen que el código sea más fácil de leer y entender, ya que cada método tiene una sola responsabilidad,
haciendo que el flujo general sea más evidente.