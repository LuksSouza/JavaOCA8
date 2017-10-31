//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 16, exercicio 5

class Test5 {
    static int i = 3;

    public static void main(String[] a) {
        //int teste = new Test().i;
        for (Test5.i = 10; Test5.i < 100;
        //for (new Test().i = 10; new Test().i < 100;
            //new Test().i++) {
            Test5.i++) {
            System.out.println(i);
        }
    }
}

//Este metodo trabalha diretamente com variaveis de classe (static)

//Ele sugere a atribuicao valores a variavel de classe i a cada iteracao do laco,
//imprimindo o valor, sendo de 10 a 99

//Porem, a maneira como ele acessa a variavel i esta errada. Ele deveria acessar
//por meio da propria classe OU por meio de uma instancia da classe. Dessa maneira,
//ele gera erro de compilacao a partir da linha 9
