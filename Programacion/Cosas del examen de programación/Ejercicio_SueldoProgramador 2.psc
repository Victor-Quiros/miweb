Algoritmo SueldoProgramador_2
	Definir IRPF, EstadoCivil, dietas, SueldoNeto, cargo, SueldoBase Como Entero
	Definir SueldoBruto Como Real
	
	Escribir '¿Qué cargo tiene en el proyecto? - 1 Junior, 2 Senior, 3 Jefe'
	Leer cargo
	Si cargo==1 Entonces
		SueldoBase <- 950
	SiNo
		Si cargo==2 Entonces
			SueldoBase <- 1200
		SiNo
			SueldoBase <- 1600
		FinSi
	FinSi
	Escribir 'Escriba número de dietas'
	Leer dietas
	SueldoBruto <- (dietas*30)+SueldoBase
	Escribir 'Escriba su Estado Civil. 1 - soltero, 2 - casado'
	Leer EstadoCivil
	Si EstadoCivil==2 Entonces
		SueldoNeto <- SueldoBruto-(SueldoBruto*0.20)
	SiNo
		SueldoNeto <- SueldoBruto-(SueldoBruto*0.25)
	FinSi
	Escribir 'Su sueldo es ', SueldoNeto
FinAlgoritmo
