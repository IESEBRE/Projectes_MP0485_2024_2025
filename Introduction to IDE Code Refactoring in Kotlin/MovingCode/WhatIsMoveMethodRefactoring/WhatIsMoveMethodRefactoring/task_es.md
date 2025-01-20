El siguiente refactorización que discutiremos en este curso es **_Move refactoring_**, que es un proceso de mover una entidad de código (por ejemplo, un método o una clase) de un lugar a un lugar más apropiado, haciendo que la base de código esté más organizada y sea más fácil de entender. Aplicamos el Move refactoring cuando queremos mejorar la estructura del código y mejorar su legibilidad, mantenibilidad y extensibilidad.

A veces, una función o propiedad se utiliza más a menudo en otra clase que en su propia clase. Otras veces, una clase colabora principalmente con otras clases de otro paquete. Estos son todos ejemplos del mal olor de código conocido como **_Feature Envy_**. Para resolver esto, movemos la entidad de código más cerca de las entidades con las que interactúa.

Para realizar el Move refactoring, haz clic en el elemento de código que deseas mover y presiona el atajo **F6**. Cuando aparezca el cuadro de diálogo de refactorización, especifica la clase/paquete de destino y haz clic en Refactorizar. También es posible ver la vista previa de la refactorización.

<p align="center">
    <img src="../../../util/src/main/resources/images/MovingCode/WhatIsMoveMethodRefactoring/move_refactoring.png" alt="Move Dialog" width="400"/>
</p>

Actualmente, en Kotlin, la refactorización de mover **está restringida solo a las declaraciones de nivel superior y clases anidadas**. Para otros escenarios, necesitarás realizar la refactorización de mover manualmente.