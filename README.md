# Tarea2 - Elo329
## Integrantes:
- Rodrigo Contreras
- Diego Flores
## Archivos Componentes de la tarea:
A continuación, viene incluida una captura de la **estructura de los archivos** que componen la **tarea**.

![archivos](https://cdn.discordapp.com/attachments/963944967141732384/985264370953121812/archivos.png)
- Vemos que en la carpeta ```/src/main/java/com/tarea/tarea2``` podemos encontrar todas las clases que componen el programa, ademas de los **4 stages** solicitados.
- En la carpeta ```/src/main/resources/com/tarea/tarea2```  vienen todos los recursos utilizados por el programa. (.png/.jpg).
- Adicionalmente, en la entrega viene añadido un documento **MakeFile** que permitirá un facil uso del programa. *(ver instrucciones de compilación e instrucciones de ejecución)*
## Instrucciones de Compilación:

El proyecto consta de un archivo make para la compilación y ejecución del programa.
Para hacer uso de este archivo se debe abrir un terminal en la ubicacion donde este guardado el proyecto en su ordenador y ejecutar los siguientes comandos:

$ make JavaFX="/path/to/javafx/lib" (Debe colocar la dirección donde tenga guardada la carpeta lib de javafx)
$ make run  (Para ejecutar el programa)

## Instrucciones de Ejecución:

Con el programa abierto usted dispondra de dos controles, uno para controlar las cortinas y otro para controlar las lamparas, estos estan ubicados de izquierda a derecha respectivamente.
En el caso de las cortinas, las flechas laterales cambian el canal de funcionamiento de estas,  las verticales se encargan de subir y bajar las cortinas. Al centro de estas se encuentra el boton de stop que además muestra el canal actual.

Por otro lado, el control de las lámparas posee una casilla donde se puede elegir entre los dos canales con lamparas disponibles, al seleccionar el canal deseado, podremos cambiar el color de la lampara correspondiente en formato RGB, ademas de poseer el botón de power ON/OFF.




