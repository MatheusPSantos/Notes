## Anotações

dir() -> serve para mostrar os atributos, functions e métodos de um determinado tipo, classe.
help() -> mostra os detalhes dos atributos, function e métodos expostos pelo dir().

### 12.Recebendo dados do usuário.
Como receber os dados do usuário via terminal? Como receber dados via teclado?

Usar a function `input()`.
```python
print('Qual seu nome?')
nome = input()
print('Olá, %s', nome)
```

Em python, string é tudo que estiver entre:
- Aspas simples, ex: 'String em python'
- Aspas duplas, ex: "String em python"
- Aspas simples triplas, ex: '''String em python'''
- Aspas duplas triplas, ex: """String em python"""

A entrada de dados em uma linha:
```python
nome = input("Qual o seu nome? ")
```