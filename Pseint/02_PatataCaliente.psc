Algoritmo PatataCaliente
	// Zona de preparación de datos
	Definir pregunta Como Texto //¿Año de comienzo de la Segunda Guerra Mundial?
		pregunta = "¿En qué año de comenzó la Segunda Guerra Mundial?"
	Definir respuesta Como Entero	 //1939
		respuesta = 1939
	// Entrada de Datos
	Escribir "Bienvenido al juego de la patata caliente"
	Escribir pregunta
	DEFINIR fecha Como Entero
	LEER fecha
	
	// Lógica del juego
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
