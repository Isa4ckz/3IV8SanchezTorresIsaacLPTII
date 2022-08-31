Algoritmo numeroprimo
	Repetir 
		num1<-0
		num2<-1
		num3<-0
		contador<-0
		Escribir "Escribe un numero"
		Leer num1
		Mientras 	num2 <= num1 Hacer
			Si  num1 MOD num2 == 0 Entonces 
				contador = contador + 1 
			FinSi
			num2 = num2 + 1
		FinMientras
		Si contador == 2 Entonces
			Escribir "El numero ", num1 , " es primo"
		SiNo
			Escribir "El numero ", num1 , " no es primo"
		FinSi
		Escribir "¿Otra vez? Escribe 1 para continuar"
		Leer num3
	Mientras que num3= 1	
FinAlgoritmo
