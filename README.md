# Escuela Colombiana de Ingeniería  Julio Garavito
## CVDS Lab07 - Persistencia
- Paula Andrea Guevara Sánchez
- Fabián Mauricio Ramírez Pinto
- Federico Barrios Meneses
## Sección I. - Introducción a JDBC
1.  Clonar el proyecto [MyBatis_Introduction_VideoRental de GitHub](https://github.com/PDSW-ECI/MyBatis_Introduction_VideoRental) donde se realizará la implementación completa del laboratorio.
2.  Descargue el archivo [JDBCExample.java]  y agreguelo en el paquete "edu.eci.cvds.sampleprj.jdbc.example":![](/img/seccion1.2.png)
3.  Desde esta clase se realizará una conexión a una base de datos MySQL por medio de JDBC y sus "_Prepared Statements_".
4.  En un motor de base de datos SQL se tiene un esquema con el siguiente modelo de base de datos (para registrar pedidos sobre productos):![Model.png](https://raw.githubusercontent.com/PDSW-ECI/JDBC_Intro/master/img/RMODEL.png)
5.  Revise la documentación de ‘[PreparedStatement](http://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html)’, del API JDBC.
6.  En la clase **JDBCExample** juste los parámetros de conexión a la base de datos con los datos reales:
    ```
        Url: jdbc:mysql://desarrollo.is.escuelaing.edu.co:3306/bdprueba
        Driver: com.mysql.jdbc.Driver
        Usuario: bdprueba
        Contraseña: prueba2019
	   ```
     ![](/img/seccion1.6.PNG)
7.  Implemente las operaciones faltantes:
    - nombresProductosPedido
    ![](/img/seccion1.7.1.png)
    -  valorTotalPedido: El resultado final lo debe retornar la base de datos, no se deben hacer operaciones en memoria.
    ![](/img/seccion1.7.2.png)
    -  registrarNuevoProducto: Use su código de estudiante para evitar colisiones.
    ![](/img/seccion1.7.3.png)
8.  Verifique por medio de un cliente SQL, que la información retornada por el programa coincide con la que se encuentra almacenada en base de datos.
parámetros:
Probamos los métodos nombresProductosPedido y valorTotalPedido en el editor y el resultado fue el siguiente:
Luego la probamos en el gestor de base de datos y estos fueron los resultados:
![](/img/pruebaproductos.PNG)
![](/img/pruebavalortotal.PNG)
En el editor también hicimos los registros en la tabla para cada integrante:
![](/img/registrofederico.png)
![](/img/registropaula.png)
![](/img/registrofabian.png)
Al verificarlos en DBeaver estos fueron los resultados:
![](/img/pruebacarnetfederico.png)
![](/img/pruebacarnetpaula.png)
![](/img/pruebacarnetfabian.png)
