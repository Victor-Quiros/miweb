Algoritmo sin_titulo
	 Definir salario, horas, salarioNeto, salarioBruto Como Entero
	Escribir "Cuanto cobra por horas"
	Leer salario
	Escribir "Cuantas horas trabaja"
	Leer horas
	
	Si horas<=35 Entonces
		salarioBruto = salario*horas
	SiNo
		salarioBruto =(salario*horas)*1.5
	Fin Si
	
	Si salarioBruto>=500 Entonces
		Si salarioBruto<=900 Entonces
			salarioNeto = salarioBruto*0.25
		SiNo
			salarioNeto = salarioBruto*0.45
		Fin Si
	SiNo
		salarioNeto = salarioBruto
	Fin Si
	
	Escribir "Salario Bruto es " salarioBruto
	Escribir "Salario Neto es " salarioNeto
	
FinAlgoritmo