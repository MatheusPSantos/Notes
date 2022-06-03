# Docker
Docker é um projeto de código aberto que automatiza a implantação de aplicativos dentro de contêineres e é mantido pela empresa Docker Inc.

O container é projetado para morrer após a execução.

O Docker fornece uma camada adicional de abstração para automação da virtualização em nível operacional, utilizando recursos de isolamento do kernel do Linux, como `cgroups` e `namespaces`, e um sistema de arquivos `union mounting` como padrão o `OverlayFS`dando a possibilidade ao uso de outros sistemas de arquivos.

A ideia do Docker é que cada container rode apenas a aplicação ou serviço e que seus dados importantes fiquem persistidos fora do container, facultando assim a possibilidade de container ser descartável (destruir o container e recriar sem compometer a integridade da instalação da aplicação ou serviço).

Os containers e as máquina virtuais possuem isolamentoo e alocação similares, mas funcionam de forma diferente, pois os containers virtualizam o sistem operacional e as máquinas virtuais virtualizam um hardware.

No mundo do container temos a Infraestrutura, Sistema Operacional e o Docker Engine.

## por quê usar?
- implementação rápida de aplicativos - os containers incluem os requisitos mínimos de execução do aplicativo, reduzindo seu tamanho e permitindo que sejam implantados rapidamente.

- 

