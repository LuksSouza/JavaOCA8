//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 15-16, exercicio 4

class Test4 {
    static int x = 15;
    
    public static void main(String[] x) {
        x = 200;
        System.out.println(x);
    }
}

//Este exercicio se trata de uma pegadinha com o conceito de shadowing para variaveis locais.
//Existe duas variaveis x nesse codigo. Uma eh a variavel da classe (static),
//que existe em qualquer instancia dessa classe; e a variavel x do metodo main,
//que soh existe dentro do escopo desse metodo.

//Na linha 8, quando eh tentando atribuir o numero 200 a x, o java ve uma variavel do tipo 
//array de Strings recebendo o valor numerico 200, o que gera um erro de compilacao.

//Para utilizar a variavel da classe, seria necessario acessa-la por meio de uma instancia; 
//ou pelo nome da classe, da mesma forma que eh usado o metodo println:
//Classe.metodoEstatico.metodoEstatico <=> System.out.println
//Nesse caso, Test4.x