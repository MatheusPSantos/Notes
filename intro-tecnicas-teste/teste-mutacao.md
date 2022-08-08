# Teste de mutação

- Baseado em defeitos
- Utiliza conhecimento de defeitos típicos que podem acontecer.
- Criamos programas mutantes que executam os casos de testes.
- Quando os casos de teste revelam os mutantes, dizemos que ele está morto.
- Como avaliar os casos de teste?
    - Contar quantos contar o n de mutantes mortos
    - Escore de mutação = (mutantes mortos/n d mutantes - equivalentes)
- Como são gerados?
    - Operadores de mutação
    - exemplo: orrn -> troca de operadores relacionais.
- mutantes equivalentes não podem ser mortos por dados de teste.
- escore de mutação -> avalia a qualidade do conjunto de teste.  

Resumindo o teste de mutação:
![image](https://user-images.githubusercontent.com/19277439/183415714-7a7ecdec-15e7-45b3-89fe-56b072a8cf93.png)
