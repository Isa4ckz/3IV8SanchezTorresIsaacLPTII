Algoritmo Calificaciones
	Escribir "Desarrolle un algoritmo que permita convertir calificaciones numericas a letras "
	nota <- 0
	n <- 0
	Repetir

		Escribir "Ingresa la calificacion numerica"
		Leer nota
		Si nota > 20 Entonces
			Escribir "No se aceptan numeros tan grandes"
		SiNo
			Si nota >= 19 y nota <= 20 Entonces
				Escribir "Tu nota es A "
			SiNo 
				Si nota >= 16 y nota <= 18 Entonces
					Escribir "Tu nota es B "
				SiNo
					Si nota >= 13 y nota <= 15 Entonces
						Escribir "Tu nota es C"
					SiNo
						Si nota >= 10 y nota <= 12 Entonces
							Escribir "Tu nota es D"
						SiNo 
							Si nota >= 0 y nota <=9 Entonces
								Escribir " Tu nota es F"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		Escribir "¿Otra vez? Escribe 1 para continuar"
		Leer n

	Mientras que n =1
	
FinAlgoritmo
