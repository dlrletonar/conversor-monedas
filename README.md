# Challenge Conversor de Monedas

## Descripción del Proyecto
Este proyecto es una aplicación de consola en Java que permite convertir cantidades de dinero entre varias monedas latinoamericanas y el dólar estadounidense. Utiliza la API de Exchange Rate para obtener las tasas de cambio actuales y realizar las conversiones.

## Funcionalidades
- Convertir de Dólar a Peso argentino.
- Convertir de Peso argentino a Dólar.
- Convertir de Dólar a Real brasileño.
- Convertir de Real brasileño a Dólar.
- Convertir de Dólar a Peso colombiano.
- Convertir de Peso colombiano a Dólar.
- Convertir de Dólar a Sol peruano.
- Convertir de Sol peruano a Dólar.

## Estructura del Proyecto
El proyecto consta de las siguientes clases:

### `Main`
La clase principal que contiene el método `main`. Se encarga de interactuar con el usuario y manejar el flujo principal de la aplicación.

### `Menu`
Clase que muestra el menú de opciones al usuario.

### `ConsultarTasaCambio`
Clase que maneja la consulta a la API de Exchange Rate para obtener las tasas de cambio.

### `TipoCambio`
Clase que representa la respuesta de la API, contiene el resultado de la conversión.


2. **Configurar Dependencias**:
   - Asegúrese de tener `gson-2.11.0.jar` en su classpath.

   - Compile el proyecto incluyendo el JAR de GSON:
     ```sh
     javac -cp .:gson-2.11.0.jar Main.java
     ```

   - Ejecute el proyecto:
     ```sh
     java -cp .:gson-2.11.0.jar Main
     ```

 **Interacción**:
   - Seleccione la opción deseada del menú.
   - Ingrese el monto que desea convertir.
   - El resultado de la conversión se mostrará en la consola.

## Ejemplo de Ejecución
```
********************************************
[ Bienvenidos al conversor de monedas ]
1. Dólar a Peso argentino.
2. Peso argentino a Dólar.
3. Dólar a Real brasileño.
4. Real brasileño a Dólar.
5. Dólar a Peso colombiano.
6. Peso colombiano a Dólar.
7. Dólar a Soles peruanos.
8. Soles peruanos a Dólar.
9. Salir.
********************************************
Ingrese la opción que desea:
1
Ingrese el monto a convertir:
100
El monto es: 14560.0 Dólar a Peso argentino
```

## Requisitos
- Java 11 o superior.
- Conexión a internet para consultar las tasas de cambio.

## Notas
- En la clase `ConsultarTasaCambio`, hay una variable `String apiKey **Debe reemplazar esta clave de API por su propia clave** para que la aplicación funcione correctamente.
- La API Key utilizada en el proyecto es de ejemplo. Se recomienda obtener una propia de exchangerate API
