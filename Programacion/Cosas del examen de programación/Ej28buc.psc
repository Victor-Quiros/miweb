Algoritmo sin_titulo
	Definir combinacion, num Como Entero
	
	combinacion<-1234
	i<-0
	Correcto<-Falso
	Escribir "Escribe la combinación correcta"
	
	Repetir
		Leer num
		Si num=combinación Entonces
			Correcto<-Verdadero
			Escribir "La caja fuerte se ha abierto satisfactoriamente"
		SiNo
			Escribir "Lo siento, esa no es la combinación"
			i<- i +1
		Fin Si
	Hasta Que num=1234 o i=4
	
	Si i=4 Entonces
		Escribir "Bloqueado"
	Fin Si
	
FinAlgoritmo
