Algoritmo sucesionfibonacci
	Definir num1, num2, num3, fib Como Real
	Dimension fib[100]
	Repetir
		x<-0
		z<-0
		num1<-0
		num2<-1
		Para x<-1 Hasta 100 Con Paso 1 Hacer
			fib(x) = num1
			num3 = num1 + num2
			num1 = num2
			num2 = num3
		Fin Para
		
		Para x<-1 Hasta 100 Con Paso 1 Hacer
			Escribir fib(x)
		Fin Para
		
		Escribir "¿Otra vez? Escribe 1 para continuar"
		Leer z
	Mientras Que z =1
FinAlgoritmo
