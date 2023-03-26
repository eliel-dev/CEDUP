programa
{
	
	funcao inicio()
	{
		inteiro num=0,acomu1=0,acomu2=0,acomu3=0,acomu4=0
		inteiro contador = 1
		
		enquanto (num >= 0)
		{
		escreva("Informe um numero positivo: ")
		leia (num)
  		
  		contador = contador++
    		limpa()


			se (num >= 0 e num <= 20)
			{
				acomu1 = acomu1+1
			}
			senao se (num >= 26 e num <= 50) 
			{
				acomu2 = acomu2+1
			}
			senao se (num >= 51 e num <= 75) 
			{
				acomu3 = acomu3+1
			}
			senao se (num >= 76 e num <= 100) 
			{
				acomu4 = acomu4+1
			}
		}
			escreva("Quantidade de numeros entre 0 e 20: " + acomu1)
			escreva("\nQuantidade de numeros entre 26 e 50: " + acomu2)
			escreva("\nQuantidade de numeros entre 51 e 75: " + acomu3)
			escreva("\nQuantidade de numeros entre 76 e 100: " + acomu4)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */