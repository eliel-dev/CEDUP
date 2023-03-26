programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real h
		real k
		cadeia s

		escreva("Qual a sua altura?  ")
		leia(h)

		escreva("Qual seu sexo, F ou M? ")
		leia(s)

		
		
		se (s=="F" ou s=="f")

		{
			k=(62.1*h)-44.7
			k=mat.arredondar(k, 2)
			escreva("Seu peso ideal é: "+(k)+"Kg Mulher")
			//escreva("Seu peso ideal é: "+((62.1*h)-44.7)+"Kg")
		}
		senao
		{
			k=(72.7*h)-58
			k=mat.arredondar(k, 2)
			escreva("Seu peso ideal é: "+(k)+"Kg Homem")
			//escreva("Seu peso ideal é: "+((72.7*h)-58)+"Kg")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */