programa
{
	
	funcao inicio()
	{
		
		inteiro a
		inteiro c
		escreva("Informe o valor de A: ")
		leia(a)
		c = a

		inteiro b
		escreva("Indorme o valor de B: ")
		leia(b)

		limpa()
	
		escreva("\nA é igual: " + (a))
		escreva("\nB é igual: " + (b))

		escreva("\nFazendo a troca...")

		a = b
		b = c
	
		escreva("\nA é igual: " + (a))
		escreva("\nB é igual: " + (b))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */