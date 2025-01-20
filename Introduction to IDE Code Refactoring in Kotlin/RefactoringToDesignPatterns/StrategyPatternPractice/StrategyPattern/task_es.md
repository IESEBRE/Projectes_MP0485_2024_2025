Vamos a intentar implementar el patrón Strategy.

Veamos el ejemplo en el editor.
En el mundo del comercio electrónico, ofrecer diversas opciones de pago a los clientes es esencial.
Diferentes clientes tienen diferentes preferencias cuando se trata de métodos de pago.

En nuestro ejemplo, el proceso de pago se implementa directamente dentro de la clase `Order`.
Los diferentes métodos de pago se manejan usando declaraciones condicionales, lo que hace que el código sea complejo y estrechamente acoplado.