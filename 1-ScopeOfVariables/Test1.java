//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 14, exercicio 1

class Test1 {
    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        System.out.println(i);
    }
}

//Nesse exercicio eh esperado que gere um erro de compilacao na linha 9, pois a variavel i
//existe apenas no escopo do for