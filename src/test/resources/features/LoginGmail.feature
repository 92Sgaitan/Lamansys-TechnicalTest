Feature: Login Gmail

  @LOGIN-EXITO
Scenario Outline: Inicio de sesion exitoso en la web de Gmail
  Given Un usuario navega por la web de Gmail
  And Completa el campo correo electronico o telefono "<emailTelefono>"
  And Hace clic en siguiente
  And Completa el campo contrasenia "<contrasenia>"
  When Hace clic en siguiente contrasenia
  Then Verificara la pagina de inicio

  Examples:
    | emailTelefono             | contrasenia   |
    | pruebaexamen698@gmail.com | Pruebas123456 |

  @LOGIN-FALLIDO-USER
  Scenario Outline: Inicio de sesion con correo o telefono erroneo en la web de Gmail
    Given Un usuario navega por la web de Gmail
    And Completa el campo correo electronico o telefono "<emailTelefono>"
    When Hace clic en siguiente
    Then Visualizara un "<mensaje>" de validacion de correo o telefono erroneo
    Examples:
      | emailTelefono | mensaje                                                    |
      |               | Ingresa un correo electrónico o número de teléfono         |
      | json          | No pudimos encontrar tu Cuenta de Google                   |
      | json@js.com   | No pudimos encontrar tu Cuenta de Google                   |
      | json@js       | Ingresa un número de teléfono o correo electrónico válidos |
      | 35168         | Ingresa un número de teléfono o correo electrónico válidos |


  @LOGIN-FALLIDO-PASS
  Scenario Outline: Inicio de sesion con contrasenia erronea en la web de Gmail
    Given Un usuario navega por la web de Gmail
    And Completa el campo correo electronico o telefono "<emailTelefono>"
    And Hace clic en siguiente
    And Completa el campo contrasenia "<contrasenia>"
    When Hace clic en siguiente contrasenia
    Then Visualizara un "<mensaje>" de validacion contrasenia erronea
    Examples:
      | emailTelefono             | contrasenia | mensaje                                                     |
      | pruebaexamen698@gmail.com |             | Ingresa una contraseña                                      |
      | pruebaexamen698@gmail.com | Pruebas     | La contraseña es incorrecta. Vuelve a intentarlo o haz clic |