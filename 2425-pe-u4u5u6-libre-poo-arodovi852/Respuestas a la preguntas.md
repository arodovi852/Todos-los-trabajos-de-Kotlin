#### **Criterio global 1: Instancia objetos y hacer uso de ellos**
- **(2.a, 2.b, 2.c, 2.d, 2.f, 2.h, 4.e, 4.f)**: Describe cómo has instanciado y utilizado objetos en tu proyecto. ¿Cómo has aplicado los constructores y pasado parámetros a los métodos? Proporciona ejemplos específicos de tu código.
  
Para poder calcular el daño total de todos los rayos, se tuvo primero que instanciar el daño en una variable para ir sumándole valores:
https://github.com/IES-Rafael-Alberti/2425-pe-u4u5u6-libre-poo-arodovi852/blob/2b9d2f62a3d71edce33c17d85b556b7597f42859/src/main/kotlin/procesos/procesos.kt#L59-L77

#### **Criterio global 2: Crear y llamar métodos estáticos**
- **(4.h)**: ¿Has definido algún método/propiedad estático en tu proyecto? ¿Cuál era el objetivo y por qué consideraste que debía ser estático en lugar de un método/propiedad de instancia?
- **(2.e)**: ¿En qué parte del código se llama a un método estático o se utiliza la propiedad estática?

#### **Criterio global 3: Uso de entornos**
- **(2.i)**: ¿Cómo utilizaste el IDE para el desarrollo de tu proyecto? Describe el proceso de creación, compilación, y prueba de tu programa.

  
Gracias al propio IDE, el proyecto pudo ser distribuido en distintas carpetas para una mejor organización de los roles y las secciones del código.
  ![imagen](https://github.com/user-attachments/assets/d223a9ca-d7cc-4449-8a45-8f1df58aa689)


#### **Criterio global 4: Definir clases y su contenido**
- **(4.a, 4.b, 4.c, 4.d, 4.g)**: Explica sobre un ejemplo de tu código, cómo definiste las clases en tu proyecto, es decir como identificaste las de propiedades, métodos y constructores y modificadores del control de acceso a métodos y propiedades, para representar al objeto del mundo real. ¿Cómo contribuyen estas clases a la solución del problema que tu aplicación aborda?

  Como todas las clases heredaban de alguna interfaz, todas sobreescribían una propiedad ya existente, sin embargo algunas también incluían sus métodos únicos:
https://github.com/IES-Rafael-Alberti/2425-pe-u4u5u6-libre-poo-arodovi852/blob/2b9d2f62a3d71edce33c17d85b556b7597f42859/src/main/kotlin/clases/Clases.kt#L20-L37

#### **Criterio global 5: Herencia y uso de clases abstractas e interfaces**
- **(4.g, 7.a, 7.b, 7.c, 7.i, 7.j)**: Describe sobre tu código cómo has implementado la herencia y/o utilizado interfaces en tu proyecto. ¿Por qué elegiste este enfoque y cómo beneficia a la estructura de tu aplicación? ¿De qué manera has utilizado los principios SOLID para mejorar el diseño de tu proyecto? Mostrando tu código, contesta qué principios has utilizado y qué beneficio has obtenido.

Las interfaces permitieron una mayor flexibilidad del código, donde todas las clases heredaban de una interfaz, bien fuese MunicionLimitada o Rayo:
https://github.com/IES-Rafael-Alberti/2425-pe-u4u5u6-libre-poo-arodovi852/blob/2b9d2f62a3d71edce33c17d85b556b7597f42859/src/main/kotlin/clases/Clases.kt#L3-L122

#### **Criterio global 6: Diseño de jerarquía de clases**
- **(7.d, 7.e, 7.f, 7.g)**: Presenta la jerarquía de clases que diseñaste. ¿Cómo probaste y depuraste esta jerarquía para asegurar su correcto funcionamiento? ¿Qué tipo de herencia has utilizado: Especificación, Especialización, Extensión, Construcción?

La jerarquía de clases fue distribuida de forma que existían 2 interfaces: Rayo y MunicionLimitada. De aquí, KitBase heredaba de esta interfaz y todos los rayos heredaban de KitBase y Rayo.
https://github.com/IES-Rafael-Alberti/2425-pe-u4u5u6-libre-poo-arodovi852/blob/2b9d2f62a3d71edce33c17d85b556b7597f42859/src/main/kotlin/clases/Clases.kt#L3-L95
Además, las 3 clases de Misil, SuperMisil y BombaDePoder heredaban de la interfaz MunicionLimitada.
https://github.com/IES-Rafael-Alberti/2425-pe-u4u5u6-libre-poo-arodovi852/blob/2b9d2f62a3d71edce33c17d85b556b7597f42859/src/main/kotlin/clases/Clases.kt#L102-L118


#### **Criterio global 7: Librerías de clases**
- **(2.g, 4.i)**: Describe cualquier librería externa que hayas incorporado en tu proyecto. Explica cómo y por qué las elegiste, y cómo las incorporaste en tu proyecto. ¿Cómo extendió la funcionalidad de tu aplicación? Proporciona ejemplos específicos de su uso en tu proyecto.

#### **Criterio global 8: Documentado**
- **(7.h)**: Muestra ejemplos de cómo has documentado y comentado tu código. ¿Que herramientas has utilizado? ¿Cómo aseguras que tu documentación aporte valor para la comprensión, mantenimiento y depuración del código?

En el menú se documentan varios casos de captura de excepciones y funcionalidad de cada apartado, ya que es la sección más enrevesada del código, por ejemplo:
https://github.com/IES-Rafael-Alberti/2425-pe-u4u5u6-libre-poo-arodovi852/blob/850aa6aada52675b53f4f60d396888bc690d3c59/src/main/kotlin/presentaci%C3%B3n/menu.kt#L11-L24
#### **Criterio global 9: Genéricos**
- **(6.f)**: Muestra ejemplos de tu código sobre cómo has implementado una clase con genéricos. ¿Qué beneficio has obtenido?

#### **Criterio global 10: Expresiones Regulares**
- **(6.g)**: Muestra ejemplos de tu código donde hayas utilizado las expresiones regulares. ¿Qué beneficio has obtenido?

