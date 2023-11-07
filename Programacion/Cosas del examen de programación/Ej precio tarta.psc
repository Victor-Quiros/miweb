Algoritmo sin_titulo
	Definir sabor, nata, nombre, blanco, chocolate Como Entero
	Definir precio Como Real
	
	
	Escribir "¿De que sabor quieres la tarta? Manzana (1), Fresa (2), Chocolate (3)"
	Leer sabor
	
	Si sabor = 1 Entonces
		precio<-18
	SiNo
		Si sabor = 3 Entonces
			Escribir "¿Chocolate negro (1) o chocolate blanco (2)?"
			Leer chocolate
			Si chocolate = 1 Entonces
				precio<-14
			SiNo
				precio<-15
			Fin Si
		SiNo
			precio<-16
		Fin Si
	Fin Si
	
	Escribir "¿Desea añadir nata? 1-Si 2-No"
	Leer nata
	
	Si nata=1 Entonces
		precio<-precio+2.50
	SiNo
		precio<-precio
	Fin Si
	
	Escribir "¿Desea escribir algún nombre? 1-Si 2-No"
	Leer nombre
	
	Si nombre=1 Entonces
		precio<-precio+2.75
	SiNo
		precio<-precio
	Fin Si
	
	Escribir precio
	
	
FinAlgoritmo
