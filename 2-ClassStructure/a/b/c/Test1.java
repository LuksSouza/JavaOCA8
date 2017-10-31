//Teste retirado do livro Java SE 8 Programmer I da Casa do Código
//Página 23-24, exercicio 1

package a.b.c;

import java.util.*;
//import java.io.*;

class Test1 {
    public static void main(String[] args) {
        ArrayList<String> existing = new ArrayList<String>();
    
        for (String arg : args) {
            if (new E().exists(arg))
            existing.add(arg);
        }
    }
}

import java.io.*;

class E {
    public boolean exists(String name) {
        File f = new File(name);
        return f.exists();
    }
}


//Esse codigo nao compila por causa do import na linha 19.
//Os imports devem ser feitos antes da declaracao das classes.
//Se o import estivesse no local correto, ocorreria outro erro
//em tempo de execucao, dizendo nao ter conseguido encontrar a classe principal.
//Nao entendi o porque, irei pesquisar sobre isso.