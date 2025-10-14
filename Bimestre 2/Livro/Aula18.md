# Aula de DAS do dia 13/10

##  Segregação de Responsabilidade de Comando e Consulta (CQRS);

## Capitulo 9: Fundamentos;

### Padrões fundamentais :
 Na história da arquitetura de software diversos padrões aparecem repetidas vezes isso se deve pois até mesmo o mais antigo dos padrões de arquitetura podem ter insights sobre como organizar o codigo, implementações e outros aspectos da arquitetura, pensando nisso vamos entender alguns dos padrões fundamentais da arquitetura.

### A Grande Bola de Lama: 
 Ultilizamos esse termo para identificar um codigo sem nenhuma estrutura de arquitetura perceptivel, na maioria das vezes causado por pressa no desenvolvimento para obter um sistema funcionando, mas essa decisão costuma ter diversas consequencias mais a frente do desenvolvimento, dificultando muito a implementação de novas funcionalidades a testabilidade e a escalabilidade da aplicação, pois toda a falta de estrutura definida cria fraquezas no software que impedem que essas nescessidades do software possam ser executadas sem um grande esforço de retrabalho.

### Arquitetura Unitária:
 Ultilizada por maior parte na época em que não hávia uma distinção entre hardware e software então existia apenas o computador e o software que roda nele, hoje em dia é raro encontrar uma arquitetura unitária fora de um sistema embarcado ou ambientes altamente restritos, ja que com a tendencia dos softwares de aumentarem suas funcionalidades exigindo separar as responsabilidades de software e hardware separadamente.

### Cliente/Servidor
 Com o tempo foi se criando novos estilos  arquiteturas que se focavam em particionar de forma eficiente as partes do sistema.
 Um dos estilos mais fundamentais é conhecido como arquitetura de duas camadas ou cliente servidor que tem uma grande quantidade de variações dependendo da época e capacidades de computação.

### desktop + servidor de banco de dados: 
 É uma arquitetura que consiste em uma rede entre um grupo de computadores ligados a um servidor local, chamado **DataBase Centric**.

### Navegador + Servidor Web:
 Nesta arquitetura trabalhamos com uma evolução da arquitetura anterior mas adicionamos uma camada web entre os clientes e o banco de dados que atua como um intermediador, trabalhando com diminuir ainda mais a responsabilidade do cliente que neste momento trabalha apenas com navegadores mostrando telas, e compartilhando da maior parte da responsabilidade e processamento das requisições sendo entre o servidor web e o servidor do banco de dados, podendo então considera-lá uma arquitetura de duas camadas.

 
