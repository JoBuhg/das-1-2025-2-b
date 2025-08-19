# aula de DAS 04/08

## Getter e Setters

servem para a implementação do encapsulamento para a proteção e a ocultação de informações senviveis do seu codigo.

# Coesão

Toda classe no sistema deve ter coesão com seu objetivo primario, ou seja, Uma classe *controller* deve possuir apenas aquilo que seja nescessário para o cumprimento de seu obbjetivo de prover a logica por tras da interface que ele for designado.

se nescessário, quando se perceber que o codigo está fazendo mais do que o nescessário cabe-se parar e repensar o que tal parte do código deveria fazer.

# Acoplamento

Acoplamento é a força da conexão entre duas classes, por exemplo uma variavel dentro de objeto A com o tipo do Objeto B, ou seja acoplamento é o quão dependente uma classe se torna da outra, com o intuito de manter essa dependencia o menor possivel. Com isso existem algumas nuancias para definir Um bom acoplamento de um acoplamento ruim.

## Alto acoplamento (ruim)
 os módulos de um sistema são muito dependentes entre si, o que dificulta manutenção e reutilização.

## Baixo acoplamento (bom)
os módulos têm pouca dependência entre si, facilitando a manutenção, testes e reutilização.

# Padrão SOLID
É um acronimo das seguintes regras para a construção de programas orientados a Objetos

- S: single Responsibility Principle
- O: open/Closed Principle
- L: liskov Substitution Principle
- I: interface Segregation Principle
- D: dependency Inversion Principle
