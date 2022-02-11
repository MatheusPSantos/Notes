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

