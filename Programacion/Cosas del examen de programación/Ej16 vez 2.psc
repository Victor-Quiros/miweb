Algoritmo sin_titulo
	Definir nota Como Real
	Leer nota
	
//	Si nota<=2.9 Entonces
//		Escribir "Muy deficiente"
//		Si nota>=3 y nota<4.9 Entonces
//			Escribir "Insuficiente"
//			Si nota>=5 y nota<5.9 Entonces
//				Escribir "Bien"
//				Si nota>=6 y nota<8.9 Entonces
//					Escribir "Notable"
//					Si nota>=9 y nota<=10 Entonces
//						Escribir "Sobresaliente"
//					Fin Si
//				SiNo
//					Escribir "Notable"
//				Fin Si
//			SiNo
//				Escribir "Bien"
//			Fin Si
//		SiNo
//			Escribir "Insuficiente"
//		Fin Si
//	SiNo
//		Escribir "Muy deficiente"
//	Fin Si
	
	
	Si nota<=3 Entonces
		Escribir "Muy deficiente"
	SiNo
		Si nota<5 Entonces
			Escribir "Insuficiente"
		SiNo
			Si nota<6 Entonces
				Escribir "Bien"
			SiNo
				Si nota<9 Entonces
					Escribir "Notable"
				SiNo
					Si nota<=10 Entonces
						Escribir "Sobresaliente"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
