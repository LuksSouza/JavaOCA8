//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 24, exercicio 2

class Test2 {
    int Test = 305; //Variavel de instancia, pripriedade da classe
    
    void Test2() {
    //Test2 Test2() --> nao compila com essa declaracao
        System.out.println(Test);
    }
    
    public static void main(String[] args) {
        new Test2();
    }
}

//Esse código ira compilar normalmente, mas nao ira imprimir nada.

//Nessa classe, o metodo void Test2() sugere a declaracao de um metodo construtor.
//Mas, para ser um metodo construtor, alem de ter o mesmo nome da classe, nao deve
//ser especificado o tipo do retorno, pois por ser um construtor, ele ja sabe
//que deve retornar um objeto da classe ao qual ele pertence.