## BDUF vs NoDuf

BDUF -> Big design up front
	- projeto da aplicação antes da implementação começar.
	- corresponde a analise de requisitos e especificação.
	- corre risco de tomar tempo com funcionalidades que não serão úteis.


NoDUF -> No design up front
	- Não realizar nenhum design antecipadamente.
	-  Corresponde a olhar de maneira limitada para o projeto.

## EDUF
Eduf -> Enough Design Up Front
    - Permitir dar segurança ao que será feito no projeto.
    - Resultado final esperado é ter um conjunto de informações suficientes para evitar ter problemas.
    - Fazer o EDUF dentro do tempo do processo ágil.
    - Outros nomes:
        - RDUF -> Rough Design Up Front
        - Emergent Design
Adiar ao máximo tomar decisões permanentes dentro do desenvolvimento ágil.

Olhar antecipadamente:
- Contexto: usuários e sistemas associados
- Requisitos principais
- Arquitetura preliminar
- Estrutura de subsistemas
- Bases de dados
- …

WHAT vs HOW
- Saber o que fazer antes de saber o como fazer.

Requisitos:
- Casos de uso,
- Cartão CRC
- User story

## Design Dinâmico da Aplicação

EDUF + refatoração natural da aplicação.


Projeto Dinâmico da Aplicação:

Modelagem Ágil:
- Requisitos —> casos de teste —> TDD
- Pontos Dinâmicos: escolher a ordem dos requisitos, escolher os casos de teste, usá-los em ordem diferente, escolher as alternativas de como construir os testes.
    - Refatoração:
        - Dados e variáveis
        - Método
        - Classes
        - Interfaces
        - Subsistemas
        - Arquitetura
