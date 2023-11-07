Algoritmo Ejercicio_18
	Definir nombre Como Cadena
	Definir salarioBruto, salarioNeto Como Real
	
	Escribir 'Escribe tu nombre'
	Leer nombre
	Escribir 'Escribe horas trabajadas'
	Leer horas
	Escribir 'Escribe cantidad por hora cobrada'
	Leer precio
	Si horas<=35 Entonces
		salarioBruto <- precio*horas
	SiNo
		salarioBruto <- precio*1.5*horas
	FinSi
	
	Si salarioBruto>500 Entonces
		Si SalarioBruto<900 Entonces
			salarioNeto = salarioBruto*0.25
		SiNo
			salarioNeto = salarioBruto*0.45
		FinSi
	SiNo
		SalarioNeto = SalarioBruto
	FinSi
	Escribir nombre
	Escribir SalarioBruto
	Escribir SalarioNeto
FinAlgoritmo
