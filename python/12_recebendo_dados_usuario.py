print('Qual seu nome?')
nome = input()
print('Olá, %s' %nome)
print('Qual a sua idade?')
idade = input()
# print da versão 2.x do python
print('Nome: %s\tIdade: %s' %(nome, idade))
# print moderno
print('Nome: {0}\tIdade: {1}'.format(nome, idade))
# print mais atual
print(f'Nome: {nome}\tIdade: {idade}')
# print(dir(__builtins__))