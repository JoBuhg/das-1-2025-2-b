# das-1-2025-2-b
## Resumos das aulas

Todos os resumos contidos neste arquivo são versões enxutas dos arquivos contidos na pasta [Bimestre 1 / Livro](https://github.com/JoBuhg/das-1-2025-2-b/tree/main/Bimestre%201/Livro)

---
### Aula 31/07

**Abstração**  
Softwares abstraem problemas reais em partes menores (entidades, repositórios, serviços, controladores etc.), dividindo responsabilidades e facilitando a manutenção.

**Complexidade**  
Principal obstáculo do desenvolvimento:  
- Dificuldade de entendimento.  
- Potenciais bugs.  
- Desorganização do código.

**Objetos**  
Pensar o sistema em objetos: dados (entidade), lógica (service), banco (repository), interface/controller e telas.

**Identação**  
Código legível é essencial para manutenção (ex.: convenções como cobra e camelo no Java).

**Frameworks**  
Dominar ao menos um é importante para produtividade e empregabilidade.

**Estrutura de dados**  
Compreender filas, pilhas, árvores, grafos, métodos e laços.

**Flexibilidade**  
Código deve ser adaptável, evitando quebra geral. Ex.: uso de interfaces.

---

### Aula 04/08

**Getter/Setter**  
Aplicam encapsulamento, protegendo dados sensíveis.

**Coesão**  
Classe deve focar apenas em sua responsabilidade. Se faz mais do que deveria → refatorar.

**Acoplamento**  
- **Alto (ruim):** dependência forte entre módulos.  
- **Baixo (bom):** pouca dependência, facilitando manutenção/testes.

**SOLID**  
- S: Single Responsibility  
- O: Open/Closed  
- L: Liskov Substitution  
- I: Interface Segregation  
- D: Dependency Inversion  

---

### Aula 07/08

**Single Responsibility**  
Cada classe com apenas uma responsabilidade.  

**Open/Closed**  
Classes fechadas para modificação, abertas para extensão.  

Ex.:  
```java
interface Funcionario { double getSalario(); }
interface FuncionarioCLT extends Funcionario { double getFGTS(); }
interface FuncionarioPublico extends Funcionario { int getSIAPE(); }
```

---

### Aula 11/08

**Inversão de Dependências**  
Prefira depender de **interfaces** em vez de classes concretas — "Prefira interfaces a classes".

**Composição > Herança**  
Use herança só quando as subclasses realmente forem o “mesmo tipo”; prefira composição para maior flexibilidade.

**Princípio de Demeter**  
Um método deve chamar apenas:
- métodos da própria classe;  
- métodos de parâmetros;  
- métodos de objetos criados no método;  
- métodos de atributos da classe.

**Aberto/Fechado**  
Classes fechadas para modificação e abertas para extensão.

---
### Aula dia 14/08

**Pricipio Liskov**
O principio de substituição de Liskov diz que todos as partes do codigo que ultilizam de um subobjeto de um T devem poder ser substituidos por qualquer outro subobjeto da mesma superclasse, ou seja todo subobjeto de T deve conter todas as propriedades de T.

(cabo a Luz kkkkk)

---

### Aula 28/08

**Livro:** *Fundamentos da Arquitetura de Software* (Richards, Ford).  
**Definição:** Arquitetura trata do que é importante no sistema. — Ralph Johnson

**Características (qualidades não funcionais):**  
disponibilidade, escalabilidade, tolerância a falhas, desempenho, confiabilidade, segurança, elasticidade, implementabilidade, testabilidade, agilidade, recuperabilidade, capacidade de aprendizagem.

**Decisões de arquitetura:**  
Escolhas estruturais que sustentam o sistema (ex.: arquitetura em camadas).

**Princípios de design:**  
Traduzem decisões arquiteturais em regras práticas para implementação e manutenção.

**Termo relevante:**  
- *Supply chain software* — componentes amplamente reutilizados que podem introduzir riscos de segurança.

---

### Aula 01/09

**Perfil do arquiteto de software:**  
- toma decisões arquiteturais; analisa continuamente; mantém-se atualizado; assegura conformidade; tem visão ampla e experiência diversificada; entende o domínio de negócio; tem habilidades interpessoais.

**DevOps:**  
Cultura ou função que conecta stakeholders e agiliza entrega contínua: planejar → criar → integração contínua → implantar → operar → feedback (PDCA).  
Material de referência: Microsoft Learn — *Introduction to DevOps*.

**Termo:**  
- **P.O (Product Owner):** representante do cliente na equipe.

---

### Aula 04/09

**Arquitetura × Design**  
- Arquitetura: decisões estratégicas e estruturais (trade-offs técnicos/organizacionais).  
- Design: decisões detalhadas de implementação dentro da arquitetura.

**Arquiteto “modelo T”**  
Amplitude antes da profundidade — conhecer várias alternativas (mesmo que superficiais) é valioso.  
Piramide do conhecimento:  
- o que sei;  
- o que sei que não sei;  
- o que não sei que não sei.

**Nota curiosa:**  
Focas são mamíferos aquáticos adaptados a regiões frias. 🦭

---

### Aula 08/09

**Trade-offs arquiteturais — exemplo: sistema de leilões**

- **Tópico (pub/sub):** 1 mensagem → vários consumidores. Fácil de escalar; mensagens podem precisar ser mais ricas/complexas.  
- **Fila:** 1:1 (cada fila para um serviço). Mensagens armazenadas; maior acoplamento entre produtor e consumidores.  
- **Fan-out (híbrido):** tópico distribui para filas específicas — reduz acoplamento e melhora observabilidade/escalabilidade, mas aumenta custo/complexidade.

**Conceito:**  
- **Trade-off:** compensação entre benefícios e custos ao tomar decisões arquiteturais.

# Bibliografia ultilizada:

- [Livro Eng Soft Moderna](https://engsoftmoderna.info/cap7.html)
- [Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2%5B%3Bvnd.vst.idref%3Dcover%5D!/4/2/2%4051:1)
- [Padrões de Projeto Guru](https://refactoring.guru/design-patterns)
- [Introdução a DevOps](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops)