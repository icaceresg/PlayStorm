# PlayStorm
A simulation of online video game store like Steam

#### Trello:
 - https://trello.com/b/vTLc0V7J/patrones-software
 
#### Base de Datos:
 - Con la libreria de Serializar de Java
#### Lenguaje:
 - Java
#### Interfaz:
 - Con la que nos proporciona Java
 
# Patrones:

## Patrones de Creación: **(FINALIZADO)**
 - **Abstract Factory:** Se va a utilizar a la hora de crear un usuario nuevo. **(FINALIZADO)**
   - FabricaAbstracta: AbstractFactory.
   - FabricaConcreta: SubscriberFactory, NotSubscriberFactory.
   - ProductoAbstracto: IntClient, IntCompany.
   - ProductoConcreto: SubscriberClient, SubscriberCompany, NotSubscriberClient, NotSubscriberCompany.
   - Cliente: ClientSingUp, CompanySignUp.
 - **Singleton:** Para crear un admin. **(FINALIZADO)**
   - Administrator: Clase con este patrón.
 
## Patrones Estructurales:
 - **Adaptador:** Para cifrar y descifrar contraseñas. **(FINALIZADO)**
   - Objetivo: PasswordEncode.
   - Adaptable: Password.
   - Adapatador: PasswordAdapter.
 - **Composite:** Un estudio puede tener a su vez varios estudios,  calcular por ejemplo el capital total de ese estudio, sumando el de todos sus estudios por debajo
 - **Proxy:** Para por ejemplo borrar un cliente, el proxy se encarga de comprobar que realmente eres un admin. **(FINALIZADO)**
   - Sujeto: Administrator
   - Proxy: AdminProxy
   - SujetoReal: AllProducts, AllClients, AllCompanies
   - Cliente: IntAdmin
 
## Patrones de Comportamiento:
 - **Template Method:** Se va utilizar cuando hacemos una herencia de Client con SubscriberClient y NotSubscriberClient. **(FINALIZADO)**
   - ClaseAbstracta: Client.
   - ClaseConcreta: SubscriberClient, NotSubscriberClient.
 - **Iterator:** Para recorrer los objetos. **(FINALIZADO)**
   - Agregado: ClientContainer, CompanyContainer, ProductContainer
   - Iterador: ClientIterator, CompanyIterator, ProductIterator
   - Interfaz Iterador: IntContainer 
   - Interfaz Agregado:  IntIterator
 - **State:** Para ver el estado del pedido.
   - Estado: OrderState
   - EstadoConcreto: NewOrderState, ProcessingOrderState.
   - Contexto: Order
 - **Observer:** Actualización del valor de la cartera del cliente cada vez que añade dinero o compra productos.
   - ConcreteObserver: AdministratorObserver
   - Subject: Money
   - Observador: Observer
 - **Command:** Cada vez que se cierre sesión, que el código sea implementado con Command. **(FINALIZADO)**
   - Comando: IntCommand
   - Invocado: LogOutCommand
   - Invocador: AdminMenu, CompanyMenu, GameSearch
