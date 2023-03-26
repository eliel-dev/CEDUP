programa {
	funcao inicio() {
	    
	     real p
	     real a
	     real imc
	    
	     escreva("Qual é seu peso? ")
	     leia(p)
		
		escreva("Qual sua altura? ")
		leia(a)
		
		imc = p/(a*a)
		
		se (imc <=18.5)
		{
		     escreva("Voce está abaixo do peso")
		}
		senao se (imc>=18.5 e imc<=25)
		{
		     escreva("Voce está com o peso normal")
		}
		senao se (imc>=25 e imc<=30)
		{
		     escreva("Voce está Acima do peso")
		} 
		senao se (imc>30)
		{
			escreva("Voce está Obeso")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 68; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */