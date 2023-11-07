Algoritmo sin_titulo
	Definir num Como Real
	
	Leer num
	
	Si num<>0 Entonces
		Si num % 2 = 0 y num % 5 = 0 Entonces
			Escribir "Es par y divisible entre 5"
		SiNo
			Si num % 2 <> 0 y num % 5 = 0 Entonces
				Escribir "No es par y divisible entre 5"
			SiNo
				Si num % 2 = 0 y num % 5 <> 0 Entonces
					Escribir "Es par y no es divisible entre 5"
				SiNo
					Escribir "No es par y no es divisible entre 5"
				Fin Si
			Fin Si
		Fin Si
	Fin Si	
FinAlgoritmo