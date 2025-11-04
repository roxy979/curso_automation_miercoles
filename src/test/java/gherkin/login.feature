
Feature:Registro

  Background
    Given estoy en pagina web clockify

  Scenario Outline:Registro <tipo>

    When presiono boton "Sign up free"
    And completo el campo <email>
    And presiono boton "Continuar con correo electronico"
    Then visualizo <leyenda>

    Examples:

      |tipo			     		            |email			|leyenda                                         |
      |fallido por campo mail vacio		    |""   			|"Se requiere correo electronico"                |
      |fallido por direccion mail invalido	|martin@mail	|"El formato del correo electrónico no es válido"|