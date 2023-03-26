programa
{
    funcao inicio() 
    {
        real num = 0.0
        inteiro cont = 1
        real soma, mula = 1.0
        real media 

        
        enquanto(num != -1) 
        {
            limpa()
            escreva("Digite o ", cont, "º número: ")
            leia(num)

            
            mula = mula + num      
            cont = cont + 1 
        }

        media = mula/(cont-2)
        
        limpa()
        escreva("A soma dos números é: ", mula, "\n")
        escreva("A média dos números é: ", media, "\n")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */