Feature: Obtener todos los productos de la API

  @OBTENER-PRODUCTO
  Scenario: Verificar la API de obtencion de productos
    Given Un usuario accede a la url de obtencion de productos
    When paso la url de los productos en el request
    Then Recibira un codigo de respuesta 200