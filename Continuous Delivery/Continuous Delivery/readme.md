# Entrega contínua

# Introdução
Poucas  integrações aumentam o risco e bugs. Quando um deploy é complicado há mais dor.

Manifesto Ágil: "Our highest priority is to satisfy the customer through early and continuous delivery of valueble software."

Desploys frequentes e automatizados devem ser naturais, repetindo os passos o tempo todo, tendo feedback.

Pipeline de deploy:
- o software passa por várias etapas
- tudo isso deve ser automatizado
- cada etapa de garantir mais qualidade

DevOps: "You built it, you run it."
- feedback contiuo
- melhoria contínua
- aprendizagem contínua.
- colaboração.

## Release Antipatterns

#### Gerenciamento manual de ambientes.
  - design
  - build
  - test
  - perform
  - homologacao
  - producao
  - cluster
Resultado: deploy não confiável

Regra: Todos os ambientes são tratados como código, versionado e criados de maneira automatizadas.

Antipattern: Deploy manual?
- Segue as intruções de deploy?
- Dev nunca viu Ops? Só um faz deploy?
- Ligações frequentes entre Dev e Ops antes de deploy?
- Deploy longos? horas ou dias?
- Roll backs frequentes

Resultado: Deploy lento, propício ao erro, não confiável.

Regra: Duas tarefas devem ser executadas manualmente:
- escolher a versão do release.
- click no deploy button.

#### Deploy apenas no fim do ciclo

Resultado: Pouca colaboração, Problemas só aparecem no dia da publicação, não confiável nem rápido, achismo.

Regra: Deployment faz parte do desenvolvimento desde da primeira iteração, todos definem um delivery team.

Como resolver?
- Gerencimento automatizado de ambientes
- Deploy automatizado
- Deploy frequente em cada ciclo de desenvolvimento


## Entrega contínua vs Deploy Contínua

No último passo, na Entrega contínua, as alterações não passam para a produção, exigida por alguma razão de negócios. No deploy contínuo, tudo automaticamente vai para a produção.

# Fundamentos
Antes de começar com Entrega contínua:
- build automatizado
- testes contínuas
- gerenciamento de config.

## Princípios de Entrega Contínua
1. Automatize
2. Versione
3. Repita
4. Garanta a qualidade
5. Defina "done"
6. Criar delivery team
7. Usar Melhoria contínua


## Elementos Principais
- Cultura DevOps
	- feedback, colaboração, confiança
	- melhoria e aprendizagem contínua
- Patterns
	- deployment pipeline
	- deploy patterns (blu/green, canary, feature toggle...)
- Arquitetura
	- Novas Propriedades: testability, deployability
	- SOLID, Services, 12 Factor App



# Deployment Pipeline
## Etapas de pipeline
Build Unit Test -> Testes de aceitação automatizados -> Homologação UAT -> Produção

	---- confiança, ambiente de produção ----->


O Pipeline Deployment varia com a realidade da empresa.

## Boas Práticas
- pipeline é a única forma de deploy
- mantém o pipeline o mais rápido possível
- build apenas uma vez
- build independente do ambiente
- ambientes iguais/semelhantes
- ambientes efêmeros (temporários)
- deploy para ambientes de maneira igual

#Stage de commit e testes de aceitação
## Commit Stage
Objetivo dessa etapa é garantir que não foi adicionado nenhum bug. O build deve ser executado a cada commit. Todo mundo deve possuir acesso ao artefato e relatórios.
- Unit tests, build, analysis
- Não demora mais de 10min (Feedback rápido)
	- não tem UI, evite DB, evite async
	- use repositório do artefato como cache
- Todo o time é responsável
- Mantenha código de qualidade para TODOS os scripts
- Mantenha os ambientes atualizados (dos Devs)


## Automated Acceptance Testing Stage
Testar a aplicação inteira e ver se atende os requisitos de negócios. Devem garantir que a aplicação funcione como um todos. São testes mais difíceis de fazer e manter.

1) Configurar o ambiente
2) deploy a aplicação
3) Rodar smoke tests
4) Rodar os testes


## Testes automatizados
Se conseguimos escrever esses testes bem então conseguimos garantir uma boa confiabilidade;

## Boas práticas
- equipe define junto as especificações (analise, qa, dev)
- responsabilidade do time todo
- smoke test o ambient
- mock sistemas externos
- precisa de bons requisitos
- boas práticas no design e implementação de testes
- desempenho não é o mais importante

# Stage de homologação
Como garantir que a aplicação funciona como o cliente espera? Quem irá executar os testes são clientes.
- Testes manuais pelo cliente
	- consegue usar como esperado?
	- faz o que pediu?
	- teve dificuldade?
- validar o software
- usa desde início (contínua)
- equipe deve participar (feedback)

## Stage de teste de carga
Boa prática é não deixar o pipeline crescer horizontalmente.

Como garantir que o software realmente aguenta a quantidade de requisições, transações ou usuários?

## Capacity  Testing Stage
- estabelecer metas claras e saber o baseline
- usar ferramentas de monitoração
- JMeter, Gatting, Webload, Apache Bench, Loadninja
- não precisam rodar a cada build mas idealmente seguem um ciclo constante

# Estratégias de Release
## Releases de baixo risco
Alpha, Beta, Gold Release? Na entrea contínua não colocamos esses carimbos de versão.
- deploy e pipeline desde da primeira interação, ambiente similar
- automação, one-click deploy, smoke teste ambiente
- arquitetura: testability e deployability

## Baixo risco: Releases são incrementais
Realizar alterações incrementais. Chegar mais perto do que é desejado na produção.
- Branch by abstraction
## Desacoplando Deploy do Release
Deploy:
1) Ambiente
2) Instação do software
3) Configuração do software

Release:
- publicação (rollout)
- deixar visível para o cliente

- Blue/Green Deployment
- Canary Releases
- Feature Toggles (Feature flags)

## Blue-Green Deployment
Release Pattern:
- Como Evitar qua a aplicação fique offline durante o deploy (zero downtime)?
- Como voltar para a versão anterior (rollback) em caso de erro?

- versão antiga: versão azul
- versão nova: versão verde

## Canary Release e Feature Toggles
Canary Release: Onde as duas versões estão sendo utilizadas ao mesmo tempo. Uma parte dos usuários somente que está utilizando a nova versão.
- Pode ser baseado no mercado, geografia, idade, perfil de usuário, etc.

Feature Toggles:
- Uma configuração que define se pode ou não pode aparecer uma nova versão da aplicação
- é a mesma base de código
- Pode ser combinado com canary

