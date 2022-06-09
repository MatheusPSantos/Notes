# DevOps

O que é DevOps? É um conjunto de conceitos que nos ajuda a entregar software mais rápido.

O software muda rapidamente. Uma empresa que lança software mais rápido permite que ela teste mais casos, tenha mais contexto e esteja a frente do negócio.

Por que DevOps é importante?
- 5x menos chances de falhas
- 440x mais rápido entre o commit e o deploy
- 46x deploys mais frequentes
- 44% mais tempo gasto com novas funcionalidades e código

### O que é DevOps?
É um conjunto de:
- Filosofias culturais
- Práticas
- Ferramentas

Trabalhando com algumas ferramentas, somos obrigados a adotar a prática e filosofias. Entender essas práticas e filosofias ajuda a criarmos o conceito de devops.

### Cultura DevOps
- Dev & Ops caminham juntos
  - sem silos
- Responsabilidade compartilhada
- Visibilidade e comunicação

### Prática DevOps
Microserviços
- Migrando de aplicação monolítica para arquiteturas baseadas em microserviços.

Integração contínua
Deploy contínuo
- Srouce Controls (commit changes) -> Build (run build and unit tests) -> Staging (deploy to test environment, run integration tests, load test, and other tests) -> Production (deploy to production environment)

Infraestrutura como código
- Definir os recursos em AWS utilizando código.

Monitoração e Log
- Monitorar e analisar métricas e logs
- Compreender o desempenho da infra-estrutura e da aplicação em tempo real

### Benefícios do DevOps
- Colaboração otimizada
- Entrega rápida
- Confiabilidade
- Segurança
- Escala
- Velocidade

### Pipeline

Ações automáticas de transições; desenvolvimento para à produção.

Benefícios:
- mais rápido
- mais seguro
- simplificação e padronização
- visualização do processo

### Pipelina mais comum
- develop -> Build -> Package -> [Test -> Deploy/Upgrade -> Operate] (Rancher)
- develop (github)
- CI Platform (jenkins)
- Container Registry (Docker hub)
- Rancher



