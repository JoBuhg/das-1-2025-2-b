# Aula do Dia 16/10

## Retry pattern:

 O retry pattern Consiste em basicamente continuar tentando fazer uma requisição que está dando erro, mas este padrão não se limita apenas a isso tambem pode integrar varias estrategias uma delas sendo;
 Caso ela de erro novamente ele entra em um time-out, chamado **Retry After Delay** e tenta mais uma vez fazer a mesma requisição, 

## Continuação do Capitulo 9: Fundamentos;

 ### Três Camadas:
  
  Uma arquiteetura que consiste em adcionar mais camadas de separação, sendo uma camada de banco de dados ultilizando um servidor de capacidade industrial, uma camada de aplicação gerenciado por um servidor de aplicação, um front-end escrito em HTML gerado e cada vez mais JavaScript, conforme o avanço das tecnologias. 

 ### Arquiteturas Monolíticas Versus Distribuídas
  
  Podemos classificar os estilos de arquitetura em dois grupos principais: 

 **Monolitos:**
  Uma implementação unica de todo o código do sistema.

- arquiteturas em Camadas
- Arquitetura de PipeLine
- Arquitetura de MicroKernel

 **Distribuídos:**
  Varias unidades de codigo conectadas por protocolos de acesso remoto.

- Arquitetura baseada em Serviços;
- Arquiteturas orientada a Eventos;
- Arqutetura baseada em espaços;
- Arquitetura orientada a serviços;
- Arquitetura de Microsserviços;

 Os estilos de arquitetura mesmo sendo muito mais poderosos em temos de desempenho, escalabilidade e disponibilide comparado a estilos monolíticos arquiteturas distribuidos carregam consigo importantes trade-offs quanto a este poder, como as ***falacias da computação distribuída***:

 ### Falacía 1: A rede é confiavel

 Ao contrário do que é pressuposto por diversos arquitetos de software, a rede não é confiavel, quanto mais seu sistema seja dependente de Api Calls constantes como em sistemas baseados em **Microsserviços** mais fragil ele sera para uma instabilidade de rede. Por isso temos **Circuit Breakers** para contornar este problema como limites de tempo de requisição e disjuntores.

 ### Falácia 2: A latência é zero
 
 A Latencia média da rede pode variar viabilidade de usar ou não uma arquitetura de sistemas distribuídos,para medir isto o arquiteto deve consguir este valor com o **Administrador da rede**

 ### Falácia 3: A largura de Banda é infinita

 
