
Feature: Login Gmail

Scenario Outline: Inicio de sesion exitoso en la web de Gmail
  Given Un usuario navega por la web de Gmail
  And Hace clic en Acceder
  And Completa el campo correo electronico o telefono "<emailTelefono>"
  And Hace clic en siguiente
  And Completa el campo contrasenia "<contrasenia>"
  Then Hace clic en siguiente
  When Verificara la pagina de inicio

  Examples:
    | emailTelefono             | contrasenia   |
    | pruebaexamen698@gmail.com | Pruebas123456 |

  Scenario Outline: Inicio de sesion con correo o telefono erroneo en la web de Gmail
    Given Un usuario navega por la web de Gmail
    And Hace clic en Acceder
    And Completa el campo correo electronico o telefono "<emailTelefono>"
    Then Hace clic en siguiente
    When Visualizara un "<mensaje>" de validacion

    Examples:
      | emailTelefono | mensaje                                                    |
      |               | Ingresa un correo electrónico o número de teléfono         |
      | json          | No pudimos encontrar tu Cuenta de Google                   |
      | json@js.com   | No pudimos encontrar tu Cuenta de Google                   |
      | json@js       | Ingresa un número de teléfono o correo electrónico válidos |
      | 35168         | Ingresa un número de teléfono o correo electrónico válidos |

  Scenario Outline: Inicio de sesion con contrasenia erronea en la web de Gmail
    Given Un usuario navega por la web de Gmail
    And Hace clic en Acceder
    And Completa el campo correo electronico o telefono "<emailTelefono>"
    And Hace clic en siguiente
    And Completa el campo contrasenia "<contrasenia>"
    Then Hace clic en siguiente
    When Visualizara un "<mensaje>" de validacion

    Examples:
      | emailTelefono             | contrasenia | mensaje                                                                                                        |
      | pruebaexamen698@gmail.com |             | Ingresa una contraseña                                                                                         |
      | pruebaexamen698@gmail.com | Pruebas     | La contraseña es incorrecta. Vuelve a intentarlo o haz clic en "¿Olvidaste la contraseña?" para restablecerla. |