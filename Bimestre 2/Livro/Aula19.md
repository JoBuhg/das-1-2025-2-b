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

 Em arquitetúras monolíticas a largura de banda não demonstra ser um problema, pois assim que o processamento entra em um bloco monolítico, pouca ou nenhuma largura de banda e requerida para processar a requisição.
 O que ja não pode ser dito de uma arquitetura distribuída como microserviços por exemplo, onde a comunicação com e entre estes serviços ultiliza muita banda, o que causa lentidão nas redes e impactando a latencia e a confiabilidade.
 Uma tecnica que pode causar taís problemas se usada indevidamente se chama **Stamp Coupling** que é uma forma de acoplamento que trabalha pegando informações entre modulos, por exemplo, um serviço de carriho de compras que precisa das informações do cliente para atribuir a quem o carrinho pertence,o que pode ser problematico caso a informação recebida seja mais do que o nescessário causando mais banda nescessária para passar tais informações entre os modulos.
 Podemos diminuir o tamanho da banda nescessária para realizar essas comunicações com algumas técnicas como:

 - Criar endpoints da API RESTful privados;
 - Usar seletores de campo no contrato;
 - Usar GRaphQL para desacoplar os contratos;
 - Usar cotratos baseados em valores com contratos baseados no consumidor;
 - Ultilizar endpoints de mensageria interna;

 Não importa a técnica ultilizada, assegurar que a quantiade mínima de dados seja passada entre os serviços é a melhor resposta para um sistema distribuido.
