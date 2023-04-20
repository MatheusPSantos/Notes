"""
Tipo Numérico

No exemplo 5/2 o retorno é 2.5, mas se quiser o inteiro pode usar int(5/2) ou então 
o modo mais pythonic 5//2 que retorna somente o inteiro do resultado.

O resto da divisão: 4%2 = 0
                    5%2 = 1

A operação de exponeciação: 3 elevado a 5 é 3**5

O limite de números em python é a memória do computador onde está rodando.

pode separar as unidades com _, por exemplo 10000000(1milao) = 1_000_000

Pode incrementar, POR EXEMPLO num += 1

num *= 2 é a mesma coisa que num = num*2
num /= 3 é a mesma coisa que num = num / 2
num //= 2 é a mesma coisa que num = num // 2

A função type() retorna o tipo do valor. 
num = 2
type(num) é <class 'int'>
"""
num = 1_000_000_000
print(num)
print(num.__add__(8))
