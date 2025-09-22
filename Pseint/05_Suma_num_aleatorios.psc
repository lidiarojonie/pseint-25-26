Algoritmo Suma_num_aleatorios
	Definir suma Como Entero
	suma = 0
	Para i = 1 Hasta 100 Con Paso 1 Hacer
		suma = suma + azar(100) + 1 //Genera números del 0 al 99, +1 para que sea del 1 al 100
	Fin Para
	Escribir "La suma es: ", suma
FinAlgoritmo
