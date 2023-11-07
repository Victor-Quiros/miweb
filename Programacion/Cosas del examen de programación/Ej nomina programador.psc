Algoritmo sin_titulo
	
	
	Definir cargo, dietas, estado, sueldo, sueldobruto Como Entero
	Definir sueldoneto, impuestos Como Real
	
	Escribir "¿Cuál es su cargo? 1 Prog Junior, 2 Prog Senior, 3 Jefe proyecto"
	Leer cargo
	Escribir "¿Qué días ha estado de viaje visitando clientes durante el mes?"
	Leer dietas
	Escribir "¿Cuál es su estado civil? 1 soltero, 2 casado"
	Leer estado
	
	Segun cargo Hacer
		1:
			sueldo<- 950
		2:
			sueldo <-1200
		3:
			sueldo <- 1600
	Fin Segun
	
	sueldobruto = sueldo + (dietas*30)
	
	Si estado = 1 Entonces
		IRPF<-0.25
		sueldoneto= sueldobruto*IRPF
	SiNo
		IRPF<-0.20
		sueldoneto= sueldobruto*IRPF
	Fin Si
	
	impuestos<-sueldobruto-sueldoneto
	
	Escribir impuestos

FinAlgoritmo
