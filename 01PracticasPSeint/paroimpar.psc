Algoritmo paroimpar
	num1 <- 0
	num2 <- 0
	Repetir
		Escribir 'Escribe un número'
		Leer num1
		Si num1 MOD 2==0 Entonces
			Escribir 'El numero ',num1,' es par'
		SiNo
			Escribir 'El numero ',num1,' es impar'
		FinSi
		Escribir ' ¿Otra vez? Ingrese 1 para continuar '
		Leer num2
	Mientras Que num2=1
FinAlgoritmo
