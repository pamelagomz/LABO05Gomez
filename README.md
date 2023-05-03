------------------------LAB0 07-------------------------------------
5. To do:
1. ¿Qué ventajas tiene el utilizar LiveData?
Nos ayuda a mantener los datos siempre actualizados y no es necesario un control manual del ciclo de vida. 

2. ¿Qué patrón de diseño utiliza LiveData?
LiveData sigue el patrón de diseño observador.

3. Menciona que se debe agregar al Gradle para poder implementar
DataBinding

tenemos que agregar 
dataBinding{
enable true 
}

4. ¿Qué es DataBinding? Menciona sus ventajas frente a findViewById

DataBinding nos  permite vincular los elementos de la interfaz de usuario (UI)
de una aplicación directamente a los datos de la aplicación

# LABO05Gomez
---------------------LABO 06-------------------------------------
1. ¿En qué consiste el patrón de diseño Repository?
COn el patron de diseño Repository podemos separar la capa de datos del resto de nuestra aplicacion. COn la capa de datos, controlamos los datos y toda lal logica empresarial, esto ayuda con la seguridad de la aplicacion. El respositorio es el responsable de exponer datos al resto de la app y centralizar los cambios en los datos


2. ¿Qué es el ViewModel?
ViewModel es un contenedor de estado a nivel de pantalla que expone el estado a la IU. Su principal beneficio es que almacena en caché el estado y lo conserva durante los cambios de configuración


----------------------LABO 05 -----------------------------------
8. To do:
1. ¿Qué diferencia existe entre navegar dentro de la aplicación utilizando
Navigation Component o hacer uso de intents?

Con Navigation Component la navegación se vuelve más sencilla, se facilita la comprensión de la
misma y a su vez el mantenimiento y escalabilidad de la aplicación en cambio con Intents la navegacion entre 
actividades no es muy clara y muchas veces puede ser mas dificl de ser escalable 


2. Menciona los componentes fundamentales de Navigation
Component
- Navigation Graph
- NavHost
- NavController

3. Mencione algunas de las ventajas del Navigation Graph

-Podemos definir la estructura de navegación de nuestra aplicación

-AL poder ver los destinos representado por una pantallade la aplicacion, es mas facil podmos comprender 
de mejor manera la navegacion. 
