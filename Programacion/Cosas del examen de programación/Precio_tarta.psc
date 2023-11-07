Algoritmo Precio_tarta
	Definir num Como Entero
	Definir precio Como Real
	Escribir '¿De que sabor quieres la tarta, manzana, fresa o chocolate? Escribe numero 1 al 3 respectivamente'
	Leer num
	Si num=1 Entonces
		precio <- 18
		Escribir 'El precio es 18 euros'
	SiNo
		Si num=3 Entonces
			Escribir 'Chocolate negro 1, blanco 2'
			Leer num
			Si num=1 Entonces
				precio <- 14
				Escribir 'El precio es 14 euros'
			SiNo
				precio <- 15
				Escribir 'El precio es 15 euros'
			FinSi
		SiNo
			precio <- 16
			Escribir "El precio es 16 euros"
		FinSi
	FinSi
	Escribir '¿Quieres añadir nata? 1 si, 2 no'
	Leer num
	Si num=1 Entonces
		precio <- precio+2.50
	FinSi
	Escribir '¿Quieres añadir un nombre? 1 si, 2 no'
	Leer num
	Si num=1 Entonces
		precio <- precio+2.75
	FinSi
	Escribir 'El presupuesto de la tarta es ', precio
FinAlgoritmo
