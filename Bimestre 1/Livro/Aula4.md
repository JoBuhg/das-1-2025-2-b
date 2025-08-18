
#  Aula 11/08
 ### 5.6.3  Princípio de Inversão de Dependências
> em vez de depender de classes concretas, clientes devem depender de interfaces. Portanto, um nome mais intuitivo para o princípio seria **Prefira Interfaces a Classes**.


### 5.6.4  Prefira Composição a Herança
> Heranças só são recomendadas serem ultilizadas quando duas ou mais classes filhas de uma superClasse não podem ser a mesma coisa, ou seja o que uma classe faz a outra não pode ser."

### 5.6.5 principio de demeter

defende que a implementação de um método deve invocar apenas os seguintes outros métodos:

-   de sua própria classe (caso 1)
    
-   de objetos passados como parâmetros (caso 2)
    
-   de objetos criados pelo próprio método (caso 3)
    
-   de atributos da classe do método (caso 4)
```
  void m1(T2 p) {  // método que segue Demeter
    f1();           // caso 1: própria classe
    p.f2();         // caso 2: parâmetro
    new T3().f3();  // caso 3: criado pelo método
    attr.f4();      // caso 4: atributo da classe
    SEM VARIAVEL GLOBAL
  }
```

### 5.6.6  Princípio Aberto/Fechado

>uma classe deve estar fechada para modificações e aberta para extensões.