Algoritmo sin_titulo
	Definir num, media Como Entero
	
	Escribir "Escribe números para saber su media, escribe un número negativo para terminar"
	
	suma<-0
	contador<-0
	Repetir
		Leer num
		Si num>0 Entonces
			contador <- contador +1
			suma<-suma+num
		Fin Si
		
		
	Hasta Que num < 0
	
	media<- suma/contador
	Escribir "La media es " media
	
FinAlgoritmo