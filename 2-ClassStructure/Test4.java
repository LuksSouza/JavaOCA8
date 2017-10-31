//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 25, exercicio 4

class Test4 implements B {
}
public interface B {    //B
}
class C extends Test4 {
}
class D extends Test4, implements B {   //D
}

//Nao compila: erro na linha B e D

//Uma vez que o arquivo chama Test4.java, o único tipo público que pode existir 
//dentro dele deve se chamar Test4, o que não é verdade: tentamos definir um tipo B público.
//Além disso, após o extends não podemos colocar uma ,.