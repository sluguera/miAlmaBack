#tecnologias utilizadas
En este proyecto se utilizó SpringBoot como framework para Java
Gradle como gestor de dependencias,
sql server como manejador de bases de datos.

#Descripcion de la estructura del proyecto
el proyecto está hecho por varias capas, la capa controller que es donde se encuentran los servicios rest a ser consumidos por el front,
la capa services que es la intermediaria entre la clase controller y la clase dao que es la que se conecta con la base de datos, la capa entity que es la encargada de modelar los objectos de la base de datos, la capa dao que es la que interactúa directamente con la base de datos, llamando y ejecutando los procedimientos almacenados.

#cómo ejecutar la aplicacion
primero se debe editar el archivo "aplication.properties" cambiando la url y credenciales de conexion a la base de datos,
se debe tener instalado sql server y restaurar la base de datos o ejecutar el scrip .sql
se debe tener instalado gradle para que se puedan descargar las dependencias.

el back debe compilar y ejecutar correctamente para que el front pueda consumir los servicios y la aplicación pueda funcionar correctamente.


