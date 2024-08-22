Feature: Obtener todos los productos de la API

  @OBTENER-PRODUCTO
  Scenario: Verificar la API de obtencion de productos
    Given Un usuario accede a la url de obtencion de productos
    When paso la url de los productos en el request
    Then Recibira un codigo de respuesta 200

  @OBTENER-PRIMER-PRODUCTO
  Scenario Outline: Verificar que el precio del primer producto sea correcto
    Given Un usuario accede a la url de obtencion de productos
    When paso la url de los productos en el request
    Then Verificar que el precio del primer producto sea "<precioPrimerProducto>"
    Examples:
      | precioPrimerProducto |
      | 109.95               |