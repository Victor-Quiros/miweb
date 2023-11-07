Algoritmo sin_titulo
	
	Definir hh, mm, ss Como Entero
	
	Escribir "Escribe la hora y minutos actual para saber cuanto falta para medianoche"
	Leer hh
	Leer mm
	
	mm <- hh*60
	ss <- mm*60
	
	ss <- 86400-ss
	
	Escribir ss
	
FinAlgoritmo
