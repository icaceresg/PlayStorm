# PlayStorm
A simulation of online video game store like Steam

#### Base de Datos:
 - Con la libreria de Serializar de Java
#### Lenguaje:
 - Java
#### Interfaz:
 - Con la que nos proporciona Java
#### Javadoc dentro de la carpeta tarjet2 en GitHub, en la entrega está en tarjet.
 
# Patrones:

## Patrones de Creación: 
 - **Abstract Factory:** Se va a utilizar a la hora de crear un usuario nuevo. 
   - Fabrica Abstracta: UserFactory.
   - Fabrica Concreta: SubscriberFactory, NotSubscriberFactory.
   - Producto Abstracto: IntClient, IntCompany.
   - Producto Concreto: SubscriberClient, SubscriberCompany, NotSubscriberClient, NotSubscriberCompany.
   - Cliente: ClientSingUp, CompanySignUp.
 - **Singleton:** Para crear un admin. 
   - Administrator: Clase con este patrón.
 
## Patrones Estructurales:
 - **Adaptador:** Para cifrar y descifrar contraseñas.
   - Objetivo: PasswordEncode.
   - Adaptable: Password.
   - Adapatador: PasswordAdapter.
 - **Proxy:** Para por ejemplo borrar un cliente, el proxy se encarga de comprobar que realmente eres un admin. 
   - Sujeto: Administrator
   - Proxy: AdminProxy
   - Sujeto Real: AllProducts, AllClients, AllCompanies
   - Cliente: IntAdmin
 
## Patrones de Comportamiento:
 - **Template Method:** Se va utilizar cuando hacemos una herencia de Client con SubscriberClient y NotSubscriberClient. 
   - Clase Abstracta: Client.
   - Clase Concreta: SubscriberClient, NotSubscriberClient.
 - **Iterator:** Para recorrer los objetos. 
   - Agregado: ClientContainer, CompanyContainer, ProductContainer, OrderContainer
   - Iterador: ClientIterator, CompanyIterator, ProductIterator, OrderIterator
   - Interfaz Iterador: IntContainer 
   - Interfaz Agregado:  IntIterator
 - **State:** Para ver el estado del pedido. 
   - Estado: OrderState
   - Estado Concreto: NewOrderState, ProcessingOrderState.
   - Contexto: Order
 - **Observer:** Actualización del valor de la cartera del cliente cada vez que añade dinero o compra productos. 
   - Observador Concreto: SumObserver
   - Sujeto Concreto: SumSubject
   - Sujeto: Subject
   - Observador: Observer
 - **Command:** Cada vez que se cierre sesión, que el código sea implementado con Command. 
   - Comando: IntLogOut
   - Invocado: LogOutCommand
   - Invocador: AdminMenu, CompanyMenu, GameSearch
 - **Strategy:** Cada vez que se realice una búsqueda, dependiendo de los parámetros dados, buscará los productos. 
   - Context: Finder
   - Estrategia: SearchStrategy
   - Estrategias Concretas: SearchByCategory, SearchByName, SearchByPrice 
