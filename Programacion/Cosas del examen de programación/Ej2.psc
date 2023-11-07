Algoritmo sin_titulo
	Definir hh, mm, ss Como Entero
	Leer hh
	Leer mm
	Leer ss
	
	
	ss<-ss+1
	
	
	Si ss>59 Entonces
		mm<-mm+1
		ss<-00
	Fin Si
	
	Si mm>59 Entonces
		hh<-hh+1
		mm<-00
	Fin Si
	
	Si hh>23 Entonces
		hh<-00
	Fin Si


	Escribir hh "," mm "," ss
	
FinAlgoritmo
