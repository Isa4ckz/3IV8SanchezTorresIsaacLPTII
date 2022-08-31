Algoritmo sin_titulo
	Definir num1, num2, x, mcd Como Entero
	Repetir
		num3<-0
		Escribir "Escribe un numero"
		Leer num1
		Escribir "Escribe otro numero"
		Leer num2
		Si num1>0 y num2>0 Entonces
			mcd = 1
			x = 1
			Mientras x <= num1 Hacer
				Si num1 MOD x == 0 y num2 MOD x == 0 Entonces
					Si x > mcd Entonces
						mcd = x
					FinSi
				FinSi
				x = x +1
			FinMientras
			Si mcd=1
				Escribir "Son Primos entre si" 
			SiNo 
				Escribir "No Son Primos entre si"
			FinSi
		FinSi
		
		Escribir "¿Otra vez? Escribe 1 para continuar"
		Leer num3
	Mientras Que  num3 = 1
FinAlgoritmo
