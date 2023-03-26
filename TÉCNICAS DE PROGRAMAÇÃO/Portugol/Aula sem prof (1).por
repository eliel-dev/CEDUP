programa
{
	
	funcao inicio()
	{
		inteiro numero=0,t1=0,t2=0,t3=0,t4=0
		inteiro contador = 1
		
		

		enquanto (numero >= 0){
		escreva("Informe um numero positivo: ")
		leia (numero)
    contador = contador++

    limpa()

		

			se (numero >= 0 e numero <= 20)
			{
				t1 = t1+1
			}
			senao se (numero >= 26 e numero <= 50) 
			{
				t2 = t2+1
			}
			senao se (numero >= 51 e numero <= 75) 
			{
				t3 = t3+1
			}
			senao se (numero >= 76 e numero <= 100) 
			{
				t4 = t4+1
			}
		}
			escreva("Quantidade de numeros entre 0 e 20: " + t1)
			escreva("\nQuantidade de numeros entre 26 e 50: " + t2)
			escreva("\nQuantidade de numeros entre 51 e 75: " + t3)
			escreva("\nQuantidade de numeros entre 76 e 100: " + t4)
	}
}