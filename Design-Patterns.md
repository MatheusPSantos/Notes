5 # Introdução
## O que é um padrão de projeto?
Nossas soluções são expressas em termos de objetos e interfaces em vez de paredes e portas, mas no cerne de ambos os tipos de padrões está a solução para um problema num determinado contexto.

Em geral um padrão tem quatro elementos essenciais:

1 - O nome do padrão: É uma referência eque podemos usar para descrever um problema de projetos, suas soluções e consequências em uma ou duas palavras. O nome torna mais fácil pensar sobre projetos e comunicá-los.

2 - O problema: descreve em que situação utilizar o padrão. Ele explica o problema e seu contexto. Pode descrever estruturas de classe ou objeto sintomáticos de um projeto inflexível. As vezes incluirá uma lista de condições que precisam satisfeitas para que faça sentido aplicar o padrão.

3 - A solução: descreve os elementos que compõe o padrão de projeto, seus relacionamentos, suas colaborações,  suas responsabilidades. Um padrão é como um gabarito que pode ser aplicado em muitas situações diferentes. O padrão fornece uma descrição abstrata de um problema de projeto.

4 - As consequências: são os resultados e análise das vantagens e desvantagens da aplicação do padrão. Elas são críticas para a avaliação de alternativas de projetos para a compreensão dos custos e dos benefícios da aplicação do padrão de projeto.

**Padrões de projeto** são descrições de objetos e classes comunicantes que precisam ser personalizadas para resolver um problema geral de projeto em um contexto particular.

Um padrão de projeto nomeia, identifica e abstrai os aspectos-chave de uma estrutura de projeto comum para torná-lo útil para a criação de um projeto orientado a objetos reutilizável. Ele identifica as classes e instâncias participantes, seus papéis, colaborações e distribuição de responsabilidades. 


### Especificando interfaces de objetos
Interface: Conjunto de todas as assunaturas definido pelas operações de um objeto. Caracteriza o conjunto completo de solicitações que lhe podem ser enviadas.

Tipo: nome usado para denotar uma interface específica. Um objeto pode ter diferentes tipos.
### Especificando implementações de objetos
Uma implementação de um objeto é definido pela sua classe. Os objetos são criados por instanciação de uma classe.

Novas classes podem ser definidas em termos das classes existentes, usando-se herança de classe.

Classe abstrata: É uma classe cuja a finalidade principal é definir uma interface comum para suas subclasses. Ela não pode ser instanciada.
As classes que não são abstratas são chamadas de **classes concretas**.

Operações abstratas: são operações que uma classse abstrata declara, mas não implementa.

**Classe mixin** é aquela cuja intenção é oferecer uma interface ou funcionalidade opcional a outras classes. É semelhante a uma classe abstrata no aspecto de que não se destina a ser instanciada. As classes mixin exigem herança múltipla.

### Herança de classe vs Herança de interface
A classe de um objeto define como ele é implementado, define o estado interno do objeto e a implementação de suas operações.
Em contraste a isso, o tipo de um objeto se refere somente à sua interface - o conjunto de solicitações às quais ele pode responder. Um objeto pode ter muitos tipos, e objetos de diferentes classes podem ter o mesmo tipo.

A herança de classe define a implementação de um objeto em termos da implementação de outro objeto. Resumindamente, é um mecanismo para compartilhamento de código e de representação. Diferentemente disso, a herança de interface (ou subtificação) descreve quando um objeto pode ser usado no lugar de outro.

### Programando para uma interface, não para uma implementação

A herança de classe é basicamente apenas um mecanismo para estender a funcionalidade de uma aplicação pela reutilização da funcionalidade das classes ancestrais.

### Colocando os mecanismos de reutilização para funcionar

#### Herança vs Composição
As duas técnicas mais comuns para a reutilização de funcionalidade em sistemas orientados a objetos são heranã de classe e **composição de objetos**.


A reutilização por meio de subclasses é frequentemente chamada de **reutilização de caixa branca**.

A composição de objetos é uma alternativa à herança de classe. Aqui, a nova funcionalidade é obtida pela montagem e/ou composição de objetos, para obter funcionalidades mais complexas. A composição de objetos requrer que os objetos que estão sendo compostos tenham interfaces bem definidas. Esse estilo de reutilização é chamado de **reutilização de caixa preta**, porque detalhes internos dos objetos não são visíveis. Os objetos aparecem somente como caixas pretas.

A herança de classe é definida estaticamente em tempo de compilação, torna mais fácil de modificar a implementação que está sendo reutilizada. Mas não possível mudar as implementações herdadas das ancestrais em tempo de execução. A herança viola o encapsulamento.

A composição de objetos é definida em tempo de execução  pela obtenção de referências a outros objetos através de um determinado objeto. A composição requer que os objetos respeitem as interfaces um dos outros.
