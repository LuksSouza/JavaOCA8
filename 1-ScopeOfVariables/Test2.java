//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 14-15, exercicio 2

class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            System.out.println(i);
            System.out.println(i);

        System.out.println("finished");
    }
}

//Nesse exercicio eh esperado que um erro de compilacao seja gerado,
//pois na linha 8, a variavel i nao existe mais, pois ela pertence apenas
//ao escopo do for