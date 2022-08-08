## Porque refatorar?
Obter qualidade no software. Nós verificamos características, examinar o fato de o software apresentar alguns sintomas de que não tem qualidade, são os mais cheiros.
No final refratáramos garantindo que o software tem o mesmo comportamento.

Software de qualidade:
- Escrito par os desenvolvedores
- Código limpo e claro:
    - Fácil de ler
    - Fácil de compreender
    - Fácil de promover mudanças

Quando Refatorar?
- Código legado
- Durante o desenvolvimento
- Após desenvolvimento

O que não fazer?
- Não se adicionar nova característica ou responsabilidade.
- Não se adiciona teste durante a refatoração.

Quando fazer um caso de teste que falhou começar a funcionar: Transformar ou adicionar código de produção para fazer um teste passar.

Na refatoração: Transformar o código de produção mantendo comportamento observado prévio do software.

A Regra de três
- A primeira vez, apenas faça
- A segunda vez, duplique assim mesmo
- A terceira vez, triplique;
- Refatore logo em seguida!

Quando redatora então?
- Ideal é sempre fazer reaftorações constantes
- Adicionar funcionalidades novas;
- Correção de bugs
- Fazer pequenas refatorações.


## Como obter um código de qualidade?
O que é um código de qualidade? Como reconhecer que um código é de qualidade?
- Analisar o código, examinado-o de maneira mais delicada.
O que caracteriza um código de alta qualidade?
- Escrito para desenvolvedores;
- Código limpo e claro:
    - Fácil de ler
    - Fácil de compreender
    - Fácil de promover mudanças
    - KISS
    - YAGNI -> You are not Gonna Need it
    - DRY -> Don’t Repeat Yourself
    - TDA -> Tell, Don’t Ask!
        - Não ter dados expostos de uma classe. Não precisar fazer coisas que outra classe pode fazer. Evitar classes sobrecarregadas.
        - Se outra classe pode fazer melhor, que faça.
    - LoD -> Law of Demeter
        - Não quero trabalhar com uma classe que acessa outra classe.
    - SOLID
        - 5 princípios
- Expressa intenção.
- Design Patterns
- GRASP -> General Responsibility Assignment Software Principles

Aplicar bons princípios de projeto, para ter boa qualidade de código.



