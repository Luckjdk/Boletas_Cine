# Boletas_Cine
En mi opinión, lo mejor sería lanzar una excepción en caso de que la cantidad de boletas no esté dentro de los rangos establecidos.

Una excepción es una señal que indica que ha ocurrido un error en la ejecución del programa. 
Al lanzar una excepción, detenemos la ejecución normal del programa y podemos manejar el error de manera adecuada, mostrando un mensaje de error al usuario o tomando alguna acción correctiva.

En este caso, si la cantidad de boletas no está dentro de los rangos establecidos, es un error que debe ser manejado. 

No tiene sentido devolver cero, ya que esto indicaría que el precio total a pagar es cero, lo cual es incorrecto y puede llevar a confusiones.

Por lo tanto, en mi opinión, es mejor lanzar una excepción, por ejemplo, una IllegalArgumentException, para indicar que ha habido un error en la entrada de datos. 
De esta manera, podemos mostrar un mensaje de error al usuario y pedirle que ingrese una cantidad válida de boletas.
