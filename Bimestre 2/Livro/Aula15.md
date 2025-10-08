## Aula Dia 06/10

### Definições das Caracteristicas da Arquitetura

Quando falamos de Caracteristicas da arrquitetura não falamos de nada mais nada menos que os **requisitos não funcionais** de um sistema. Ou seja todos os requisitos do sistema que não estejam dentro do *Dominio* do software. Ultilizamos está nova nomenclatura pelas implicações comunicativas que um requisito **Não Funcional** pode acabar causando uma impressão depreciada destas caracteristicas importantissimas para que a entrega do softwares esteja de acordo com o esperado pelo cliente.
<p>
<B>X</B> | Requisitos não funcionais; 
<p>
<B>O</B> | Caracteristicas da Arquitetura;
</p>

Seguindo este raciocinio uma caracteristica da arquitetura atende a três criterios:

- Especifica uma consideração de design fora do domínio
- Influencia algum aspecto estrutural de design
- É essencial ou importante para o sucesso da aplicação

#### Especifica uma consideração de design fora do domínio:
Os requisitos especificam aqui que ele deve fazer, enquanto as caracteristicas da arquitetura especificam os critérios operacionais de design para o sucesso, como implementar os requisitoe por que certas escolhas foram feitas.

#### influencia um aspecto estrutural do design:
A principal das razões para arquitetos tentarem descrever caracteristicas da arquitetura se tem pelas considerações do design do projeto: esta caracteristica requer uma consideração estrutural especial para ter sucesso? algo que não possa ser resolvido de formas convencionais. por exemplo:

- *Processador de pagamentos terceirizado*;
Caso um ponto de integração lidar com os detalhes do pagamento, a arquitetura **não precisara de considerações estruturais especiais**, no maximo uma limpeza padrão de segurança como criptografia e hash.
- *Processamento de pagamentos na aplicação*;
Caso a aplicação projetada venha a lidar com o processamento de pagamentos, provavelmente a arquitetura venha a planejar um modulo/componete separado para esta finalidade. Agora **está caracteristica da arquitetura tem um peso na arquitetura do design**. 

##### Essencial ou importante para o sucesso da aplicação:
Os arquitetos devem se preocupar em ultilizar o menor número possivel de caracteristicas da arquitetura para realizar a construção do projeto, pois cada caracteristica da arquitetura carrega consigo e adcionam mais complexidade ao design.

#### Implícitas versus explícitas
- Implicitas; Raramente aparecem em nos requisitos, embora nescessárias para o sucesso do projeto, por exemplo: Disponibilidade, confiabilidade e segurança embasam em todos os projetos, embora raramente especificadas.

### Características da Arquitetura Listadas
Existem em um amplo espectro do sistema de software, variando das caracteristicas de codigo de baixo nivel, como modularidade até questões operacionais sofisticadas, como escalabilidade e elasticidade. Normalmente os arquiteto separam essas caracteristicas em grandes categorias Como:

#### Caracteristicas Operacionais da Arquitetura:
- Disponibilidade;
- Continuidade;
- Desempenho;
- Segurança/Confiabilidade;
- recuperabilidade;
- robustez;
- escalabilidade;

Estas caracteristicas tem uma grande sobreposição com as preocupações de operações e DevOps.

#### CAracterísticas Estruturais da Arquitetura:
- Configuração;
- Extensão;
- Instabilidade;
- Aproveitamento/Reutilização;
- Localização;
- Manutenção;
- Portabilidade;
- Suporte;
- Atualização;

Estás ccaraterísticas se preocupam com a estrutura do codigo, deixando o arquiteto com uma responsabilidade única ou compartilhada pelas questões de qualidade do código.

#### Características Transversais da Arquitetura:
- Acessibilidade;
- Armazenamento;
- Autenticação;
- Autorização;
- Legalidade;
- Privacidade;
- Segurança;
- Suporte;
- Usabilidade/viabilidade;

Éstas são algumas das caracteristicas da arquitetura que se classificam em categorias fáceis de reconhecer,muitas estão fora ou desafiam a categorização, formando importantes restrições de desgin e considerações.

Dito isso qualquer tipo de listas de características da arquitetura será nescessariamente incompleta; ja que qualquer projeto de software pode inventar características conforme a nescessidade.
Alem de que muitos dos termos ultilizados anteriormente são imprecisos e ambíguos, muita das vezes por falta de definições objetivas.

Muitas definições podem se sobrepor como disponibilidade e confiabilidade, que parecem se sobrepor em quase todos os casos.

### Trade-offs e Arquitetura menos pior
Aplicações costumam suportar apenas algumas caracteristicas da arquitetura listadas por varios motivos, como que cada caracteristica com suporte requer um esforço de design para funcionar e talvez até um suporte estruturalo que acrescenta complexidade ao projeto. Ou as vezes até mesmo o caso de que ter foco em uma característica obrigatoriamente vá afetar outra, por exemplo, caso uma aplicação foque em fortalecer a segurança da aplicação naturalmente ira impactar negativamente no desempenho do projeto, pois ele estra fazendo mais criptografia em tempo real, e outras atividades que diminuem drasticamente o desempenho.

Por isso os arquitetos raramente encontram uma situalçao que possa ser projetado um sistema que maximíza toda característica da arquitetura, buscando sempre ter um bom equilibrio dependendo das necessidades do projeto. Assim nunca buscando a melhor das arquiteturas mas sim a menos pior.

O que sugere que os arquitetos devem projetar a arquitetura da forma mais iterativa possivel, possibilitando mudanças com mais facilidade, tendo menos estresse para modificar algo no projeto ou descobrir a coisa certa a ser feita no projeto.
