Feature: Navega por la web de eBay

  @PRODUCTO-EBAY
  Scenario Outline: Buscar y seleccionar un producto en la web de eBay
    Given Un usuario navega por la web de eBay
    And Completa el campo Buscar Articulos "<producto>"
    And Hace clic en Buscar
    When Hace clic en primer articulo
    Then Visualizara el resultado del producto buscado
    Examples:
      | producto        |
      | Electric Guitar |