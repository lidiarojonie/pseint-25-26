Algoritmo PatataCaliente
	// Zona de preparaci�n de datos
	Definir pregunta Como Texto //�A�o de comienzo de la Segunda Guerra Mundial?
		pregunta = "�En qu� a�o de comenz� la Segunda Guerra Mundial?"
	Definir respuesta Como Entero	 //1939
		respuesta = 1939
	// Entrada de Datos
	Escribir "Bienvenido al juego de la patata caliente"
	Escribir pregunta
	DEFINIR fecha Como Entero
	LEER fecha
	
	// L�gica del juego
	Mientras fecha <> respuesta Hacer
		Si fecha > respuesta Entonces
			Escribir "La fecha es menor"
		SiNo
			Escribir "La fecha es mayor"
		Fin Si
		Escribir pregunta
		Leer fecha
	Fin Mientras
	
	// Salida de Datos
	
	Escribir "Has acertado!!!"
	
FinAlgoritmo
