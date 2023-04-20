print('Qual seu nome?')
nome = input()
print('Olá, %s' % nome)
print('Qual a sua idade?')
idade = input()
# print da versão 2.x do python
print('Nome: %s\tIdade: %s' % (nome, idade))
# print moderno
print('Nome: {0}\tIdade: {1}'.format(nome, idade))
# print mais atual
print(f'Nome: {nome}\tIdade: {idade}')
# print(dir(__builtins__))

nome2 = input("Qual o seu nome? ")
idade2 = input("Qual a sua idade? ")
print(f"nome2 = {nome2}\tidade2 = {idade2}")
# com cast
nome3 = input("Qual o seu nome? ")
idade3 = int(input("Qual a sua idade? "))
print(f"nome3 = {nome3}\tidade3 = {idade3}")
