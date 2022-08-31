Algoritmo sin_titulo
	Repetir
		num1 <- 0
		num2 <- 1
		num3 <- 0
		num4 <- 0
		Escribir 'Ingrese un numero'
		Leer num1
		Para num3<-1 Hasta num1 Hacer
			num2 <- num2*num3
		FinPara
		Escribir ' El factorial de ',num1,' Es ',num2
		Escribir '¿Otra vez? Escribe 1 para continuar'
		Leer num4
	Mientras Que num4=1
FinAlgoritmo
