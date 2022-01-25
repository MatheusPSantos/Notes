# Funções de Hash e Árvore de Merkle

## Introdução

Função f de A em B é uma relação que associa a cada elemento x de A a um elemento único y de B.

Características de uma função de Hash:
- Conjunto A é {0,1}* onde * é denominado Fecho de Kleene.
- Dado um hash de uma string de bits arbitrária não é possível recuperar a string original.
- Pequenas alterações na string de entrada causam grandes alterações na string de saída da função de Hash.
- Rápida para não comprometer a disponibilidade.
- Complexa para que ataque de força bruta não seja simples.

### Árvore de Merkle
- Criada por Ralph Merkle 1979
- Nós folhas são Hash de blocos de dados
- Nós não-folhas são Hash de seus nós filhos
- A raíz pode validar se determinado bloco é íntegro sem precisar conhecer todos
- Muito usada em criptomoedas para validação de transações
- Adicionada em cada bloco de uma blockchain

