# Tarea: 1/2: Cohesión y acoplamiento

_**Cohesión**_ y _**acoplamiento**_ son conceptos fundamentales en el diseño de software, que determinan qué tan bien están organizados los componentes de un sistema y cómo interactúan entre sí. Las refactorizaciones de movimiento pueden desempeñar un papel crucial en la mejora de la cohesión y la reducción del acoplamiento dentro del código.

**_Cohesión_** se refiere a qué tan bien las partes de un módulo (como una clase o una función) están relacionadas y enfocadas en realizar un trabajo específico.
**Alta cohesión** significa que los elementos dentro del módulo trabajan estrechamente juntos y comparten un propósito común. Por otro lado, **baja cohesión** significa que los elementos dentro del módulo realizan varias tareas no relacionadas, haciendo que el módulo sea menos organizado y más difícil de entender.

Para mejorar la cohesión, asegúrate de que cada clase y método tenga una responsabilidad clara y singular.

_**Acoplamiento**_ se refiere a cuánto dependen unas partes de un programa de otras.
**Bajo acoplamiento** significa que las partes son más independientes, haciendo que sea más fácil cambiar una parte sin impactar a otras. Por otro lado, **alto acoplamiento** significa que las partes están estrechamente interconectadas, por lo que los cambios en una parte pueden afectar a muchas otras.

Para mejorar el acoplamiento, utiliza la refactorización de movimiento para reorganizar elementos del código, como métodos y campos, para reducir las dependencias directas entre diferentes módulos o clases.
Reducir el acoplamiento mientras se incrementa la cohesión conduce a una base de código más mantenible y flexible.