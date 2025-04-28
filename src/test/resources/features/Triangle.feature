#language: es
@TriangleCalculator
Característica: Triangle Calculator

  @triangleScalene
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

  @triangleIsosceles
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

  @triangleEquilateral
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


  @LaSumaDeDosLadosNoSuperarAlTercero
  Esquema del escenario: Validar que no se muestre un triangulo si la suma de dos lados no supera al tercero
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "NO ES UN TRIANGULO"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Y el usuario hace click en el boton Check
    Entonces el resultado es igual a "NOT A TRIANGLE"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 10     | 20     | 30     |

  @ValorDeEntradaDiferenteAUnNumero
  Esquema del escenario: Validar que no se muestre un triangulo con al menos un valor invalido
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "DATOS INVALIDOS"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Y el usuario hace click en el boton Check
    Entonces el resultado es igual a "INVALID INPUT"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | abc    | 10     | 30     |


  @NumeroNegativos
  Esquema del escenario: Validar que la aplicacion no permita ingresar valores negativos en ningun cuadro de entrada
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "NUMEROS NEGATIVOS"
    Y se ingresa el lado "SideA" "<SideA>"
    Entonces se verifica que el lado "SideA" sea un numero positivo "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Entonces se verifica que el lado "SideB" sea un numero positivo "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Entonces se verifica que el lado "SideC" sea un numero positivo "<SideC>"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 30     | -40    | -50    |


  @CaracteresAlfanumericos
  Esquema del escenario: Validar que la aplicacion no permita ingresar caracteres alfanumericos en los cuadros de entrada
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "CARACTERES ALFABETICOS"
    Y se ingresa el lado "SideA" "<SideA>"
    Entonces se verifica que el lado "SideA" sea un numero positivo "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Entonces se verifica que el lado "SideB" sea un numero positivo "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Entonces se verifica que el lado "SideC" sea un numero positivo "<SideC>"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | cz1v     | -40    | -50    |


  @CerosAlaizquierda
  Esquema del escenario: Validar que la aplicacion no permita ingresar un numero con cero a la izquierda
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "CEROS A LA IZQUIERDA"
    Y se ingresa el lado "SideA" "<SideA>"
    Entonces se verifica que el lado "SideA" sea un numero positivo "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Entonces se verifica que el lado "SideB" sea un numero positivo "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Entonces se verifica que el lado "SideC" sea un numero positivo "<SideC>"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 030     | -40    | -50    |


  @EspacioEnBlancoAlInicioYFinal
  Escenario: Validar que la aplicacion no permita ingresar espacios iniciales y finales
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "ESPACIOS ADICIONALES"
    Y se ingresa el lado "SideA" " 30 "
    Entonces se verifica que el lado "SideA" sea un numero positivo " 30 "
    Y se ingresa el lado "SideB" " 40 "
    Entonces se verifica que el lado "SideB" sea un numero positivo " 40 "
    Y se ingresa el lado "SideC" " 50 "
    Entonces se verifica que el lado "SideC" sea un numero positivo " 50 "



  @NoIngresarNumeroMayorAlPermitido
    #Partamos de la premisa que el valor maximo por cada campo es 100
  Esquema del escenario: Validar que la aplicacion no permita ingresar un numero mayor al rango vlaido permitido
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "MAYOR A 100"
    Y se ingresa el lado "SideA" "<SideA>"
    Entonces se verifica que el lado "SideA" sea un numero positivo "<SideA>"
    Y se verifica que el lado "SideA" sea un numero menor al permitido "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Entonces se verifica que el lado "SideB" sea un numero positivo "<SideB>"
    Y se verifica que el lado "SideB" sea un numero menor al permitido "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Entonces se verifica que el lado "SideC" sea un numero positivo "<SideC>"
    Y se verifica que el lado "SideC" sea un numero menor al permitido "<SideC>"

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 100    | 99     | 101    |


  @BotonCheckDesactivado
  Esquema del escenario: Validar que la aplicacion muestre el boton desactivado mientras uno de los campos tenga valor vacio
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Y se muestra el campo de entrada "SideA"
    Y se muestra el campo de entrada "SideB"
    Y se muestra el campo de entrada "SideC"
    Y se muestra el boton Check
    Entonces se ingresa el nombre "BOTON DESACTIVADO"
    Y se ingresa el lado "SideA" "<SideA>"
    Y se ingresa el lado "SideB" "<SideB>"
    Y se ingresa el lado "SideC" "<SideC>"
    Entonces el boton CHECK se muestra desactivado

    Ejemplos:
      | SideA  | SideB  | SideC  |
      | 10     | 30     |        |


  @CamposConValorVacio
  Escenario: Validar que los campos de entrada sean de tipo numerico
    Dado que el usuario se conecta a la pagina web TriangleCalculator
    Entonces se muestra la pagina web cargada
    Y se muestra el campo YOURNAME
    Entonces se ingresa el nombre "VALORES VACIOS"
    Y se muestra el campo de entrada "SideA"
    Entonces el campo "SideA" es de tipo numerico
    Y se muestra el campo de entrada "SideB"
    Entonces el campo "SideA" es de tipo numerico
    Y se muestra el campo de entrada "SideC"
    Entonces el campo "SideA" es de tipo numerico