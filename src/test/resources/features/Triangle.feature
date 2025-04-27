#language: es
@TriangleCalculator
Característica: Triangle Calculator


  Esquema del escenario: Validar la generacion de un triangulo SCALENE
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "SCALENE"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Y el usuario hace click en el boton Check
    Entonces el resultado es igual a "SCALENE"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 30     | 40     | 50     |


  Esquema del escenario: Validar la generacion de un triangulo ISOSCELES
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "ISOSCELES"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Y el usuario hace click en el boton Check
    Entonces el resultado es igual a "ISOSCELES"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 40     | 30     | 40     |


  Esquema del escenario: Validar la generacion de un triangulo EQUILATERAL
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "EQUILATERAL"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Y el usuario hace click en el boton Check
    Entonces el resultado es igual a "EQUILATERAL"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 30     | 30     | 30     |



  Esquema del escenario: Validar que no se muestre un triangulo si la suma de dos lados no supera al tercero
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "No es un triagulo"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Y el usuario hace click en el boton Check
    Entonces el resultado es igual a "NOT A TRIANGLE"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 10     | 20     | 30     |


  Esquema del escenario: Validar que no se muestre un triangulo con al menos un valor invalido
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "Datos invalidos"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Y el usuario hace click en el boton Check
    Entonces el resultado es igual a "INVALID INPUT"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | abc    | 10     | 30     |