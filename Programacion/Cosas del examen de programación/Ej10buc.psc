Algoritmo sin_titulo
	Definir notas Como Entero
	Definir diez Como Logico
	
	Escribir "Escribe números"
	diez<- Falso
	
	Repetir
		Leer notas
		Si notas=10 Entonces
			diez<-Verdadero
		Fin Si
	Hasta Que notas = -1

	Si diez=Verdadero Entonces
		Escribir "Se ha introducido algun 10"
	SiNo
		Escribir "No se ha introducido ningún 10"
	Fin Si
	
FinAlgoritmo