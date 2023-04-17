""""
Utilitários Python para auxiliar na programação
DIR -> Apresenta todos os atributos e funções disponíveis para determinado tupo de dado ou variável.
HELP -> Apresenta a doc e como utilizar os atributos, funçoes, propriedades e métodos disponíveis
para determinado tipo de dado ou variável.j
"""
"""
Exemplo de entrada:
>>>> dir("Geekx")
Saída:
<<<<['__add__', '__class__', '__contains__', '__delattr__', '__dir__', '__doc__', '__eq__', '__format__',
'__ge__', '__getattribute__', '__getitem__', '__getnewargs__', '__gt__', '__hash__', '__init__',
'__init_subclass__', '__iter__', '__le__', '__len__', '__lt__', '__mod__', '__mul__', '__ne__', '__new__',
'__reduce__', '__reduce_ex__', '__repr__', '__rmod__', '__rmul__', '__setattr__', '__sizeof__',
'__str__', '__subclasshook__', 'capitalize', 'casefold', 'center', 'count', 'encode', 'endswith', 'expandtabs',
'find', 'format', 'format_map', 'index', 'isalnum', 'isalpha', 'isascii', 'isdecimal', 'isdigit', 'isidentifier',
'islower', 'isnumeric', 'isprintable', 'isspace', 'istitle', 'isupper', 'join', 'ljust', 'lower', 'lstrip', 'maketrans',
'partition', 'removeprefix', 'removesuffix', 'replace', 'rfind', 'rindex', 'rjust', 'rpartition', '
rsplit', 'rstrip', 'split', 'splitlines', 'startswith', 'strip', 'swapcase', 'title', 'translate', 'upper', 'zfill']
"""

"""
Exemplo de entrada:
>>>> help('Geek'.upper)
Saída:
<<<< Help on built-in function upper:

upper() method of builtins.str instance
    Return a copy of the string converted to uppercase.
"""

print(dir('Hello world'))