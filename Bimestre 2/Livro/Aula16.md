## Aula Dia 09/10

### Circuit Braker Pattern:
 O circuit braker como o proprio nome ja diz é um pattern desenvolvido para que não ocorra uma cascata de requisições falhas, onde o sistema faz constantes requisições a um serviço, o que consume uma grande quantidade de recursos do sistema, podendo causar possiveis quedas tanto parciais ou em piores casos uma queda completa do sistema.

 Para corrigir isso o circuit braker ajuda a previnir que uma cascata de requisições com grande chance de falha gaste recursos e tenha possibilidade de queda do sistema, tambem fazendo com que o sistema saiba quando a falha estiver resolvida para que a aplicação faça a requisição novamente. 
 Ela age como um proxy para operações que podem falhar, faz isso monitorando o numero de falhas recentes e outras informações para definir se a operação deve ser  interrompida, com essas informações o circuit braker separa tais operações em 3 categorias, sendo elas;

 - **Closed:** Uma nova requisição é feita, caso falhe, o proxy aumenta o numero de requisições falhas recentemente, caso esse número passe de uma quantidade especificade falhas dentro de um espaço de tempo definido o proxy é alocado no estado **Open** e da um *time-out timer*. quando  o time-out expira, o proxy vai para o estado **Half-Open**.
 
 - **Open:** A requisição  falha e retorna  um exception para a aplicação.

 - **Half-closed:** Um número limitado de requisições da aplicação é permitido, caso elas sejam executadas com sucesso o circuit braker assume que a falha está corrigida e troca para o estado **closed** e o contador de falhas é resetado. Caso a requisição falhe, é entendido que a falha persiste então volta para o estado **Open** e reseta o *time-out timer* para que o sistema se recupere da falha.

 ![diagrama dos estados do circuit-breaker](https://learn.microsoft.com/en-us/azure/architecture/patterns/_images/circuit-breaker-diagram.png#lightbox)

