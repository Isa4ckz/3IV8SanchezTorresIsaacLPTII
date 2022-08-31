Algoritmo calculodehoras
	Escribir "Desarrolle un algoritmo que permita calcular la nomina de unos trabajadores "
	dias<- 0
	syd <- 0
	s <-0
	d<- 0
	
	horas<- 0
	horasextras <- 0
	salario<- 0
	// si se trabaja en sabado se paga el doble, si trabaja el domingo se trabaja el triple, si trabaja horas extras se paga el doble 
	//maximo tres horas// //salario 100 x hora //
	Escribir "Ingrese el numero de horas trabajadas"
	Leer horas
	Escribir "Trabajo horas extras? ¿Cuantas? "
	Leer horasextras
	Escribir "Ingrese el numero de dias trabajados"
	Leer dias
	Escribir "¿Trabajo sabado o domingo? Escribir 1 si trabajo sabado y 2 si fue domingo, ambas escribir 3"
	Leer  syd
	Si syd = 1 Entonces
		Escribir "¿Cuantas horas?"
		Leer s
	SiNo 
		Si syd = 2 Entonces
			Escribir "¿Cuantas horas?"
			Leer d
		SiNo 
			Si syd = 3 Entonces
				Escribir "¿Cuantas horas por dia? "
				Leer s , d
			FinSi
		FinSi
	FinSi
	Escribir "Ingrese el salario por hora"
	Leer salario
	
FinAlgoritmo
