programa
{
	
	funcao inicio()
	{
		inteiro numero=0,t1=0,t2=0,t3=0,t4=0
		inteiro contador = 1
		
		

		enquanto (numero >= 0){
		escreva("Informe um numero: ")
		leia (numero)
		contador = contador++

			se (numero == 0 e numero < 20)
			{
				t1 = t1++
			}
			senao se (numero >= 26 e numero <= 50) 
			{
				t2 = t2++	
			}
			senao se (numero >= 51 e numero <= 75) 
			{
				t3 = t3++	
			}
			senao se (numero >= 76 e numero <= 100) 
			{
				t4 = t4++	
			}
			senao
			{
				escreva("teste")
			}
		}
			escreva("Entre 0 e 20: " + t1)
			escreva("/nEntre 26 e 50: " + t2)
			escreva("/nEntre 51 e 75: " + t3)
			escreva("/nEntre 76 e 100: " + t4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */