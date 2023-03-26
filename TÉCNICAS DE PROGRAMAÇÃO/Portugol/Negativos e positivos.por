programa
{
	
	funcao inicio()
	{
		real num=1.0, total, positivo=0.0, negativo=0.0

		escreva("Informe um numero ou caso deseje parar digite 0: ")
		enquanto (num != 0)
		{
			leia(num)
			se (num > 0)
			{
				positivo = positivo+1
			}
			senao se (num < 0)
			{
				negativo = negativo+1
			}
		}
		total = positivo + negativo
		escreva("Porcentagem de numeros positivos "+(positivo/total*100)+ "%" )
		escreva("\nPorcentagem de numeros negativos "+(negativo/total*100)+ "%" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */