# Tarea2 - Elo329
## Integrantes:
- Rodrigo Contreras
- Diego Flores
## Archivos Componentes de la tarea:
A continuación, viene incluida una captura de la **estructura de los archivos** que componen la **tarea**.

![archivos](https://cdn.discordapp.com/attachments/963944967141732384/985264370953121812/archivos.png)
- Vemos que en la carpeta ```/src/main/java/com/tarea/tarea2``` podemos encontrar todas las clases que componen el programa, ademas de los **4 stages** solicitados.
- En la carpeta ```/src/main/resources/com/tarea/tarea2```  vienen todos los recursos utilizados por el programa. (.png/.jpg).
- Adicionalmente, en la entrega viene añadido un documento **MakeFile** por cada stage solicitado, que permitirá un facil uso del programa. *(ver instrucciones de compilación e instrucciones de ejecución)*
## Instrucciones de Compilación:
Para la compilación de cada stage, viene incluido un documento makefile. Este se encuentra, junto a su solución, dentro de la carpeta Stage#, siendo # el número correspondiente al stage.
Para compilar el stage lo puedes hacer mediante el siguiente comando:

```$ make JavaFX="/path/to/javafx/lib" (Debe colocar la dirección donde tenga guardada la carpeta lib de javafx)```

## Instrucciones de Ejecución:

Para ejecutar el stage, basta con ejecutar el siguiente comando:

```$ make run JavaFX="/path/to/javafx/lib" (Debe colocar la dirección donde tenga guardada la carpeta lib de javafx)```

Con el programa abierto usted dispondra de dos controles, uno para controlar las cortinas y otro para controlar las lamparas, estos estan ubicados de izquierda a derecha respectivamente.
En el caso de las cortinas, las flechas laterales cambian el canal de funcionamiento de estas,  las verticales se encargan de subir y bajar las cortinas. Al centro de estas se encuentra el boton de stop que además muestra el canal actual.

Por otro lado, el control de las lámparas posee una casilla donde se puede elegir entre los dos canales con lamparas disponibles, al seleccionar el canal deseado, podremos cambiar el color de la lampara correspondiente en formato RGB, ademas de poseer el botón de power ON/OFF.

Posterior a la ejecución o compilación del stage, cuenta con la opción de ejecutar el siguiente comando si gusta deshacerse de los archivos ```.class``` creados luego de la compilación:

```$ make clean```


