programa

{
	
	funcao inicio()
	{
		inteiro pessoas = 0
		real altura = 0.0
		real alturaMaior = 0.0
		real alturaMenor = 0.0

		enquanto (pessoas != 15)
		{
			limpa()
			escreva("Qual a sua altura?: ")
			leia(altura)

			pessoas = pessoas + 1
			limpa()
			
			se (altura < alturaMenor ou alturaMenor == 0 )
			{
				alturaMenor = altura 				
			}
			
			se (altura > alturaMaior)
		     {
				alturaMaior = altura  				
			}	
		}
			
		escreva("A menor altura é: "+ alturaMenor)
		escreva("\nA maior altura é: "+ alturaMaior)

	}
}