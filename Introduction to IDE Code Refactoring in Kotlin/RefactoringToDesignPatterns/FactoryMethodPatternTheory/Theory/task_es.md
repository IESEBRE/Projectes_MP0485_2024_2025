# Tarea 1/1: patrón método fabrica – teoría

El **método fábrica** es un _patrón de diseño creacional_ que proporciona una interfaz para la creación de objetos en una superclase, mientras permite que las subclases alteren el tipo de objetos que se crearán. Este patrón promueve un acoplamiento débil y asegura que la decisión de creación de objetos se delegue a las subclases.

**Véase también:** [Clase sobre patrón de diseño de la fabrica en Kotlin](https://www.youtube.com/watch?v=1VWYP3S12Do&ab_channel=KotlinbyJetBrains)

**¿Cuándo aplicar el patrón método fábrica?** \
Aplica el patrón método fábrica cuando desees proporcionar una abstracción para la creación de objetos, permitiendo que las subclases decidan qué clases instanciar.