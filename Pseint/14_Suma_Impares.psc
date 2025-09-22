Algoritmo Suma_Impares
	Definir n, i, suma Como Entero
	suma = 0
	Para i = 0 Hasta 49 Con Paso 1 Hacer
		n = 2 * i + 1 // Generar el numero impar
		suma = suma + n // Sumar los numeros
	Fin Para
	Escribir "La suma de los primeros 100 num impares es: ", suma
FinAlgoritmo
