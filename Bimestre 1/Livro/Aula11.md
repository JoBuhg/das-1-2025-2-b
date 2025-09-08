# Aula dia 08/09

> Livro Base: Fundamentos da arquitetura de software: uma abordagem de engenharia(Richards, Mark, Ford, Neal)

## Exemplificando diferentes arquiteturas e seus trade-offs

Quando falamos em arquitetura, nunca falamos sobre uma solução perfeita para cada situação mas sim pensamos em diferentes soluções, cada uma com suas distintas qualidades e defeitos,

Pensemos em um exemplo de uma casa de leilões onde o usuário faz o lance e os serviços de capturar, rastrear e analisar o lance pegam a informação do lance como se fosse um topico em uma mensageria onde o lance e feito e os serviços recebem o lance e pegam as informações nescessárias, o que pode gerar lentidão pois toda a informação do lance é mandado aos n serviços que irão ultilizar as informações do lance.

#### Topico;

uma outra forma de fazer isso seria por meio de um topico entre este lance e os serviços, onde o topico age como um **Broker** para dividir esta informação e enviar até os serviços interessados nestes dados. tornando essa aplicação um 1 para muitos ja que é uma mensagem sendo enviada para todas as requisições fazerem os gets.

#### Fila;

Ou pensando em outra forma podemos gerar filas para cada serviço, onde o lance é colocado nas filas de seu respectivo serviço e os serviços vem em buscam as informações da fila, tendo assim um armazenamento das mensagens feitas nas filas. fazendo aqui ser uma aplicação 1 para 1 ja que quem fez o lançe deve enviar uma mensagem para cada  requisição feita.

### compensações
Pensando nestas duas arquiteturas podemos tirar alguns beneficios e problemas, por exemplo, caso pensemos em escalar este sistema adcionando mais um serviço a adiquirir estas mensagens, no sistema de tópicos o sistema novo será apenas alocado com o get do topico unico do sistema, sem ter maiores modificações na mensagem e em quem envia, diferente do sistema de filas onde mais uma mensagem deve ser enviada ao novo serviço.

Por outro lado o sistema de tópico teria que ter uma complexidade muito maior na mensagem enviada para suprir as nescessidades que cada serviço nescessite, onde numa arquitetura por filas se torna muito menos problematica pois quem dá o lance pode enviar mensagens diferente com apenas o topico nescessário para o serviço em questão, mas tendo uma maio acoplação com o resto do sistema.

#### FAN-OUT;
Pensando em uma resolução para os problemas de cada arquitetura nos podemos ultilizar uma terceira opção que ultiliza conceitos de ambas as arquiteturas anteriores, onde uma mensagem é enviada ao tópico e o tópico por sua vez envia as informações as filas de cada serviço tendo assim uma menor acoplação, uma melhor observabilidade, melhor escalabilidade e um armazenamento da informação, mas em troca aumentando em muito o custo da aplicação.  

## topicos intereçantes da Aula;

- Trade-offs = são compesações que se obtem a tomar as decisões na arquitetura, tanto boas quanto ruins.
