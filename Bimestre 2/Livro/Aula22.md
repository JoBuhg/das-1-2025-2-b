# Aula do Dia 27/10

## Capitulo 11: Estilo de Arquitetura em pipeline

Nascido no Unix 

Se trata de uma Arquitetura que em termos simples ultiliza inputs e outputs para conectar diferentes programas por meio de canais(pipes) 

### filtros de uma pipeline:

- Produtor: o ponto de partida do processo, ultilizado apenas para saída e algumas vezes chamado de origem;

- transformador: quem aceita a entrada, e pode ou não realizar uma transformação em algum ou todos os dados sendo enviados para o canal de saida;

- Verificador: aceita a entrada e testa um ou mais critérios, para então poder ou não produzir uma saída, com base no teste;

- Consumidor: O ponto final da pipeline. Tendem a persistir o resultaddo final da pipeline para um banco de dados ou uma tela UI.

### Node-RED

Criado pela IBM o Node-RED é um serviço Low-code para implementações de pipelines por meio do Node-red

