# Empleados.java
_Software para calcular el sueldo final de un empleado._

## Actividad 📋

```
Realizar un programa que permita vincular tres formularios en los cuales se mostrará el sueldo de un empleado. 
En el primer formulario se ingresa el nombre del empleado, el sueldo, el premio (en porcentaje), y el salario por familiar; este formulario tendrá 3 botones: uno de salida, otro de limpiar y otro que indique ir al segundo formulario. 
En el segundo formulario se mostraran directamente los valores de los descuentos efectuados y total que cobra el empleado, estos se calcularan a través de las siguientes fórmulas: Descuento = (sueldo + premio) x 0,2 ; Total a cobrar = sueldo + premio + salario 
– descuento. En dicho formulario se deberá colocar dos botones: uno de cancelar, que enviara al usuario al primer formulario y contendrá los datos que ingreso anteriormente y uno de siguiente que lo llevara al tercer formulario 
Donde se mostraran los valores del recibo de sueldo: Nombre del empleado, sueldo, premio, salario, descuento, total a cobrar, y tendrá un botón que indique volver al primer formulario, donde deberán mostrarse todos los campos vacios. 
Todos los formularios deben estar centrados.
```

## Capturas de Pantalla

![Screen 1, Empleados, Java, Pablo Facciano](https://raw.githubusercontent.com/PabloFac/Empleados.java/master/screen1.png)

![Screen 2, Empleados, Java, Pablo Facciano](https://raw.githubusercontent.com/PabloFac/Empleados.java/master/screen2.png)

![Screen 3, Empleados, Java, Pablo Facciano](https://raw.githubusercontent.com/PabloFac/Empleados.java/master/screen3.png)

## Analisis de Actividad

```
Formularios:
	FrmIngreso:
		Empleado
		> Nombre
		> Sueldo
		> Premio (%)
		> Salario por familiar
		Botones
		> Salir
		> Limpiar
		> Siguiente (FrmDescuento)
	FrmDescuento
		Empleado
		> Descuento ((sueldo + premio) * 0.2)
		> Total a cobrar (sueldo + premio + salario - descuento)
		Botones
		> Atras/Cancelar (FrmIngreso)
		> Siguiente (FrmRecibo)
	FrmRecibo
		Empleado
		> Nombre
		> Sueldo
		> Premio
		> Salario
		> Descuento
		> Total a cobrar
		Botones
		> Volver al principio
Detalles
	> Todos los formularios centrados
	> Despues de volver desde FrmRecibo, los campos deben estar vacíos
```
