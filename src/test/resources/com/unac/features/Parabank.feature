Feature: Registro y apertura de nueva cuenta en Parabank

  Scenario: Registro de usuario y apertura de nueva cuenta
    Given navego a la página de registro de Parabank "https://parabank.parasoft.com/parabank/register.htm"
    When registro con nombre "Ángel", apellido "Salazar", dirección "Calle 123", ciudad "Ciudad", estado "Estado", código postal "12345", número de teléfono "555-6789", SSN "987-65-4321", nombre de usuario "angelsalazar", y contraseña "contraseña"
    When abro una nueva cuenta
    Then debería ver la nueva cuenta en la vista general de cuentas
