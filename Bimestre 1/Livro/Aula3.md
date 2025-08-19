# Aula de DAS 07/08

## Single Responsability principle:

Este principio afirma que devemos aplicar apenas 1 responsabilidade as classes criadas para o sistema,
por exemplo, devemos separar uma classe de apresentação(front page, perfil, login) de uma classe que envolva
a regra de negócio(Compra, processamento, analise).

~~~class Console {

  void imprimeIndiceDesistencia(Disciplina disciplina) {
    double indice = disciplina.calculaIndiceDesistencia();
    System.out.println(indice);
  }

}

class Disciplina {

  double calculaIndiceDesistencia() {
    double indice = "calcula índice de desistência"
    return indice;
  }

}
~~~

## Open/Closed Principle:

O principio segue na ideia de aplicar coesão, mas neste caso sendo mais voltado a interfaces, dizendo que
deve-se ter interfaces com metodos e focos unicos para por exemplo, ouvir um som ou mudar o barulho cursor
será nescessário a criação de uma interface para cada uma destas funcionalidades.

~~~
interface Funcionario {
  double getSalario();
  ...
}
~~~

~~~
interface FuncionarioCLT extends Funcionario {
  double getFGTS();
  ...
}
~~~

~~~
interface FuncionarioPublico extends Funcionario {
  int getSIAPE();
  ...
}
~~~
