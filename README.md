**PARCIAL 2 PROGRAMACION ORIENTADA A OBJETOS**

Antonio José Moreno López

**PDF PROCEDIMIENTO**

[PARCIAL2_PDF.pdf](https://github.com/user-attachments/files/20923199/PARCIAL2_PDF.pdf)

Este programa busca simular una aplicacion de gestion de consultas medicas en una clinica, permitiendo realizar registros de usuarios ya sean medicos o pacientes, 
asi como consultas medicas, todo esto con el fin de aplicar conocimientos fundamentales de POO como Interfaz Grafica de Usuarios, uso de colecciones, persistencia
de datos de forma local o remota, herencia, clases abstractas en interfaces y arquitectura de software.

**ESTRUCTURA DE LA APLICACION**

El programa siguie la siguiente arquitectura, la cual tiene muchas ventajas como facilidad para realizar mantenimiento y mayor orden


![image](https://github.com/user-attachments/assets/37e04c3b-60b2-4ab1-a762-80552097a18f)


**COMPONENETES PRINCIPALES**

**1. MODEL**

**1.1 CLASE PERSONA**
Esta es una clase abstracta que define los atributos que tienen en comun las subclases que la van a heredar, y contiene metodos abstractos como getTipo() que es fundamental
para diferenciar entre las subclases

**1.2 CLASES PACIENTE Y MEDICO**
Clases concretas que definen los atributos propios de cada una de ellas, como en el caso de Medico el atributo disponibilidad segun el cual se permite o no el registro de consultas

**1.3 CLASE CONSULTA**
La clase consulta es el vinculo entre el medico y el paciente una instancia de esta clase representa una consulta ya realizada con toda la informacion necesaria para llevar un 
registro adecuado

**1.4 CLASE CLINICA**
La clase clinica es el modelo principal que contiene todos los datos en la memoria usando coomo coleccion principal el HashMap ya que permite relacionar la informacion a una 
llave, en este caso el id proporcionado. Esta clase guarda, busca y organiza los registro de las consultas.

**1.4 INTERFAZ PERSISTENCIA**
Esta interfaz se encarga de definir los metodos que debe tener cualquier clase encargada de guardar y cargar los datos de la aplicacion, es muy util hacerlo de esta manera 
ya que permite actualizar el metodo de persistencia de datos de forma mas comoda

**2. PERSISTENCIA**

**2.1 PERSISTENCIA DE ARCHIVOS**
Esta clase implementa a la interfaz persistencia y define en donde y de que manera se va guardar la informacion, en este caso en archivos .txt, garantizando la persistencia 
de datos incluso si se cierra la aplicacion

**3. VIEWMODEL**

**3.1 CLINICAMODELVIEW**
Esta clase es el puente logico entre la interfaz grafica y el model, este contiene toda la logica para agregar, buscar y mostrar la informacion guardada segun el parametro introducito 
por medio de llamar a la persistencia.

**4. VIEW**
Es lo que el usuario ve y con lo que interactura para introducir informacion al sistema, consta de las clases VentanaPrincipal, desde la cual se accede a las demas, que son 
Registro, que permite registrar nuevos usuarios ya sean pacientes o medicos, Consulta, que una vez haya registrado al menos un paciente y un medico permite guardar la informacion 
importante de las consultas por medio de los metodos definidos en viewmodel, y finalmente Historial que permite acceder al registro de todas las consultas realizadas por un medico o recibidas por un usuario.


**5. EXCEPCIONES**
Permite el manejo de errores o excepciones comunes, en este caso CampoVacio y Usuario no enontrado


**6. FUNCIONAMIENTO DE LA APLICACION**

**MENU PRINCIPAL**


![image](https://github.com/user-attachments/assets/ce78443e-261b-4566-9d40-26ed80d9df46)


**REGISTRO DE USUARIOS**


![image](https://github.com/user-attachments/assets/1cae8a69-0a58-47e3-8b57-e55da2ca6b3a)


**REGISTRO DE CONSULTAS**


![image](https://github.com/user-attachments/assets/e11493e5-08ee-4daa-b19e-70e8d6311880)


**CONSUTAR EL HISTORIAL**


![image](https://github.com/user-attachments/assets/971d3371-9203-4066-9ab3-7f89d2119571)


**CONCLUSION**

La aplicacion mostro funcionar adecuadamente


        
