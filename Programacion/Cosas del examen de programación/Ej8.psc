Algoritmo sin_titulo
	Definir num, pos, neg Como Entero
	Definir nulo Como Logico
	
	pos<-0
	neg<-0
	nulo= Falso
	Repetir
		Leer num
		Si num>0 Entonces
			pos<- pos+1
		SiNo
			neg<-neg+1
			nulo=Falso
		Fin Si
	Hasta Que num=0
	
	Si nulo = Falso Entonces
		Escribir "No se han introducido negativos"
		Escribir "Los números positivos son " pos
	SiNo
		Escribir "No se han introducido negativos"
		Escribir "Los números negativos son " neg
	Fin Si
	
	Escribir "Hay introducidos " pos " positivos"
	Escribir "Hay introducidos " neg " negativos"
	
FinAlgoritmo