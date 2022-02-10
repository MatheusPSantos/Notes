## Integração contínua

- A sicronização do código se torna um evento, o que não deveria ser assim.
- A integração contínua é algo sim, na raiz significa commitar as alteraçãoes frequêntemente.
- A sincronização no final da sprint aumentam o surgimento de problemas;
- A integração contínua objetiva adiantar o surgimento dos problemas, sem precisar de um evento centralizador para isso.

## Sistema de controlve de versão (VCS)
- Ferramentas como Git.
- A integração contínua não exige uma ferramenta específica.
- Como regra geral, deve-se commitar tudo:
  - scripts para deploy,
  - scripts para schema ou bancos de dados
  - dockers,
- O ideal é que para desenvolver seja necessário somente o clone e o comando para executar o projeto
- Não é interessante commitar objetos resultantes do deploy
  - não commitar .exe, .jar ou gems e etc.

## Organização dos repositórios

- O natural é que haja um repositório para cada projeto;
- Essa forma de repositórios se chama de multi-repo;
- Outra forma de organização esta ligada a grande quantidade de projetos;
- Essa forma de repositório se chama de mono-repo, onde todos os projetos estão dentro
de um único repositório;

## Branching Models/Strategy/Policy
- Todas as alteração deveriam refletir dentro de uma linha principal
- Quando trabalhar em uma funcionalidade, é permitido sair desse ramo principal para trabalhar
 nisso, o que chamado de branch.
- Podemos criar mais ramos para representar significados e responder a regras de fluxos;
  - git flow
  - gitlab flow
  - feature branch flow
- Quando cria uma branch, você afasta da linha principal.
- "Everyone commits to the mainline every day" - Martin Fowler
- Regras:
  - Commits simples e lançáveis, orientado às tarefas;
  - Branches atrasam integração, seguram códigos;
  - Branches de vida curta -> merge mais simples;
  - Muitos branches, mais burocracia;
  - Estrátegias devem ser combinadas pela equipe;

- Temporários (branches locais)
- Feature Branches
- Historical Branches (Master e develop)
- Environment Branches (staging e Production)
- maintenance Branches (release e hotfix)

Trunked-based developement
  - Trunk-based development is a branching model that reduces this distance
  (between branches) to the minimum.

Feature Branch workflow
  - Master + Feature Branches

Feature Branch + Pull Request
  - Alteração não pode ser mergeada diretamente na master
  - Finalizado a feature, é aberto um Pull Request onde a equipe que analiza
   o código
  - O Pull Request cria uma barreira para commitar na Master

GITHUB Flow

GITLAB Flow
  - é tudo que o github flow é mas adiciona ENV branches
  - Deploy planejado
  - criado mais branches, merges, mais complexidades

GIT flow
 - Feature branches + Pull Request + Maintenance Branch + HIstorical Branches


## Evitar branches de vida longa
Feature Flags e Branch by Abstractions

Ref: https://martinfowler.com/bliki/BranchByAbstraction.html

Ref: https://martinfowler.com/bliki/FeatureToggle.html

Branch by abstraction:
 - Criar uma camada de abstração dentro do código
 - Não criar uma branch
 - Replementar parte a parte do módulo


## Como sincronizar branches

Merge vs Rebase
- Merge criar um novo commit que representa um evento de sincronização
- O commit gerado não representa  uma alterção
- O commit é baseado nas alterações de todas as branches
- Rebase pega os commits da main e aplica em cima da linha temporal da branch,
como se eles tivessem sido feitos na branch

## Testes automatizados

Garantia de funcionamento do software.
- Testes fazem parte da integração contínua.
- Rodar antes do commit.
- TDD pode ajudar, mas não essencial.
- Desemepenho importa.

Test Driven Development:
  - Feedback dos testes no design.
  - Código testável é código simples.
  - Teste é sobre feedback contínuo.

Testes automatizados:
- Functional Tests: Testa o sistema completo e garente o funcionamento de uma funcionalidade na visão de um cliente.
- Integration Tests: Teste módulos em conjunto como integração com bancos de dados.
- Unit Test;

O desempenho diminui inversamete proporcional à quantidade dos testes.

Smoke test: seleção de testes que garantem que as funcionalidade mais importantes e sensíveis do sistema são testadas. São testes que a build só passa quando esses testes são passados.

Resumindo:
- caracterizar testes.
- rodar testes rápidos primeiro.
- use smoke testes.
- testes fazem parte do build.
- aplicar boas práticas de teste.
- feedback -> diminuir o risco, se algo quebra, responder na hora.

## Build automatizado

Etapas do Build:

    clean -> compile -> Unit Tests -> Static analysis -> Package software -> Integrate database -> [...]

- build a cada commit
- tudo automatizado / single command
- build sem depender da IDE
- tudo está no repositório

Build rápido/Feeback rápido
  - otimizar o build, métricas ajudam
    - verificar a fase testes e analise do código
    - verifique ordem dessas fases
    - verifique a infra do build system
    - use cache

Resumindo:
- Use ferramenta para automatizar o seu build.
- Use commit-build
- Builds rápidos que falham rápidos (10min)
- Scripts único que construí para ambientes (parametrizado)
  - comando único de buidl
- use máquina de build

## Servidor de integração contínuas
Local que testa tudo: CI DAEMON
- Realiza o build o tempo todo e avisa aos desenvolvedores o status do build e testes;
- Publicar os relatórios de qualidade;
- Se o build passou, ele oferece o artefato do build em um servidor.

## Build quebrado

O que fazer quando o build não está confiável, está quebrado?

- "Nobody has a higher priority task than fixing the build." - Kent Beck

- Não realizar commits até que o build seja corrigido.
- É uma responsabilidade da equipe.

## Certificação de CI
1 - Você "commita" diariamente o seu código no "mainline" do projeto?

2 - Build e testes rodam automatizados e trazem a confiança que o software está correto?

3 - Quando um build quebra, a equipe conseta em +- 10 minutos?

## O que é entrega contínua?
Manifesto Ágil: "Working software over comprehensive documentation"

"Our highest priority is to satisfy the customer through early and CONTINUOUS DELIVERY of valuable software."

Release -> deploy.

Como chegar?

- RNF: deployability
- Padrões:
  - deployment pipeline
  - deploys de baixo risco
    - deploys incremental
    - separar deploy e publicações
    - deploys frequêntes
    - otimizar para resiliência

Entregar contínua vs Deploy contínua?

Entrega contínua exige uma mudança de postura da empresa.

## DevOps
A tarefa do DevOps é derrubar os muros entre as equipes para que seja possível a entrega contínua, é um movimento cultural que visa a colaboração entre as equipes envolvidas no desenvolvimento e entrega de software, para melhorar a qualidade e velocidade do software.

- É principalmente sobre o comportamento de pessoas
- Otimização da dinâmica;

Entrega contínua depende do DevOps.
