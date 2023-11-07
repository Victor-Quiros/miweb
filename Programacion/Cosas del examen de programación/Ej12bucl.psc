Algoritmo sin_titulo
	
	Definir num1, num2, base, exponente, potencia Como Entero
	
	Escribir "Escribe la base de la potencia"
	Leer num1
	Escribir "Escribe el exponente de la potencia"
	Leer num2
	
	potencia<-1
	
	Si num2>0 Entonces
		Repetir
			potencia<-potencia*num1
			num2<-num2-1
		Hasta Que num2=0
	Fin Si
	
	Escribir "La potencia de " num1 " es " potencia
	
	
FinAlgoritmo
