//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 15, exercicio 3

class Test3 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        
        int i = 15;
        System.out.println(i);
    }
}

//Nesse exercicio, eh esperado que o codigo compile normalmente,
//imprima os valores de i, indo de 0 ate 19 e depois imprima 15

//Um detalhe importante eh que a variavel i do for eh uma variavel
//diferente da variavel i criada apos o fim do for, sendo duas variaveis distintas.
//Ao termino do for, a variavel i criada nele deixa de existir, podendo assim
//ser criado outra variavel i sem ocorrer duplicidade.