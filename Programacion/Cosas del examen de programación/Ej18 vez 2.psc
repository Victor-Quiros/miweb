Algoritmo sin_titulo
	Definir horas, precio Como Entero
	Definir salarioBruto, salarioNeto Como Real 
	
	Escribir "Indica número de horas trabajadas"
	Leer horas
	Escribir "Indica cuanto cobra por horas"
	Leer precio
	
	
	Si horas <= 35 Entonces
		salarioBruto <- horas * precio
	SiNo
//		horas<- horas -35
//		salarioBruto <- horas * (precio*1.5)
		salarioBruto <- (35 * precio) + ((horas - 35) * (precio * 1.5))
	Fin Si
	
	
//	Si horas <= 35 Entonces
//		salarioBruto <- horas * precio
//	SiNo
//		salarioBruto<-35*precio+(horas-35)*precio*1.5
//	Fin Si
	
	
//	salarioBruto<-35*precio+(horas-35)*precio*1.5
	
	
	
//	Si salarioBruto > 500 Entonces
//		Si salarioBruto < 900 Entonces
//			salarioNeto<- salarioBruto * 0.25
//		SiNo
//			salarioNeto<- salarioBruto * 0.45
//		Fin Si
//	SiNo
//		salarioNeto<- salarioBruto
//	Fin Si
	
	salarioNeto <- salarioBruto
	
	Si salarioNeto < 500 Entonces
		Escribir "No hay impuestos"
	SiNo
		Si salarioNeto <= 900 Entonces
			salarioNeto <- salarioBruto*0.55
		SiNo
			salarioNeto <- salarioBruto*0.75
		Fin Si
	Fin Si
	
	
	Escribir "Neto " salarioNeto
	Escribir "Bruto " salarioBruto
FinAlgoritmo


