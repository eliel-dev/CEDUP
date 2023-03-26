programa {
	funcao inicio() {
	    
	    real p
	    real a
	    cadeia imc
	    
	    escreva("Qual é seu peso? )
		leia(p)
		
		escreva("Qual sua altura? ")
		leia(a)
		
		imc == p/(a*a)
		
		se imc >=18.5
		{
		    escreva("Abaixo do peso")
		}
		senao se imc >=18.5 e imc <=25
		{
		    escreva("Peso normal")
		}
		senao se imc >=25 e imc <=30
		{
		    escreva("Acima do peso")
		}
		senao imc >=30
		{
		    escreva("Obeso")
		}
	}
}
