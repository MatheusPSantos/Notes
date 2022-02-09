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

