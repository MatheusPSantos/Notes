# Docker
Docker é um projeto de código aberto que automatiza a implantação de aplicativos dentro de contêineres e é mantido pela empresa Docker Inc.

O container é projetado para morrer após a execução.

O Docker fornece uma camada adicional de abstração para automação da virtualização em nível operacional, utilizando recursos de isolamento do kernel do Linux, como `cgroups` e `namespaces`, e um sistema de arquivos `union mounting` como padrão o `OverlayFS`dando a possibilidade ao uso de outros sistemas de arquivos.

A ideia do Docker é que cada container rode apenas a aplicação ou serviço e que seus dados importantes fiquem persistidos fora do container, facultando assim a possibilidade de container ser descartável (destruir o container e recriar sem compometer a integridade da instalação da aplicação ou serviço).

Os containers e as máquina virtuais possuem isolamentoo e alocação similares, mas funcionam de forma diferente, pois os containers virtualizam o sistem operacional e as máquinas virtuais virtualizam um hardware.

No mundo do container temos a Infraestrutura, Sistema Operacional e o Docker Engine.

## por quê usar?
- implementação rápida de aplicativos - os containers incluem os requisitos mínimos de execução do aplicativo, reduzindo seu tamanho e permitindo que sejam implantados rapidamente.

- **portabilidade entre máquinas** - um aplicativo e todas as suas dependências podem ser empacotadas em um único container independente da versão host do Kernel Linux, distribuição ou modelo de implantação.
- **Controle de versão e reutilização de componentes** - é possível controlar versões sucessivas de um container, inspecionar diferentes ou reverter para versões anteriores.
- **imagens otimizadas** - as imagens do Docker são tipicamente muito pequenas, o que facilita a entrega rápida e reduz o tempo de implantação de novos containers de aplicativos.
- **compartilhamento** - pode usar um repositório remoto ou local para compartilhar suas imagens.
- **manutenção simplificada** - Docker reduz o esforço e o risco de problemas com dependências de aplicativos.

# Rancher

O Rancher é open source que contém um conjunto de códigos que contém um conjunto de softwares necessários para o gerenciamento e orquestração de containers via web.

O Rancher aceita tanto hosts Linux de nuvem pública, nuvem privada, servidores físicos ou máquinas virtuais, o Rancher não faz distinção em seu uso, implementando uma camada de serviços de infra-estrutura projetados especificamente para facilitar o gerenciamento de aplicações em containers.

Os serviços de infraestrutura do Rancher incluem **rede**, **armazenamento**, **volumes**, **balanceador de carga**, **DNS**.

O Rancher orquestra o **kubernets**. O rancher vem com uma camada acima e permite automatizar a parte de gerenciamento e criação do Kubernets. Proviosanmento, Upgrades, RBAC, Monitoramento, Health Check, Backup.

Rancher User Experience -> User Interface, App Catalog, Docker run, Kubectl, API, CLI.

O Rancher tem outros produtos também, como o K3S.io, um Kubernets mais leve. Rancher Os, que é um sistema Operacional, é um Linux que carrega somente o suficiente para rodar containers, o próprio sistema operacionla é um container. Long Horn, é um projeto da Rancher para trabalhar com volume de cluster, o disco do container.

# Kubernets

Kubernets é uma plataforma open source de gerenciamento de containers de nível enterprise, baseado em 15 anos de experiência do Google e pronto para o mundo multi-cloud: nuvem pública, nuvem privada ou híbrida. Possui desenho modular e pode ser rodado em quase qualquer lugar.

Kubernets provê uma arquitetura flexível, e com mecanismo desacoplado de service discovery. Como a maioria de plataformas computacionais distribuídas, um cluster consiste:
- Pelo Menos um master e múltiplos node de computação.

O mmaster é responsável pela API, agendamento dos deployments e gerenciamento total do cluster.

UI <--> API <---> Kubernets Master --E Node1, Node 2, Node 3, ... Node n.

Dentro do Kubernets Master temos:
- API server
- Scheduler
- Controller
- etcd:

Cada Nó do cluster roda:
- Container runtime, Docker ou Rocket, com os agentes para se comunicar com o master.
- Componentes adicionais para logs, monitoramento, service discovery e add-ons opcionais.

Os nós, são trabalhadores do Cluster. Eles expõem os serviços de computação, rede e armazenamento para as aplicações. Em cada nó:
- DOcker
- Kubelet
- Kube-proxy
- Fluentd

Componentes do Kubernets para usarmos em nossas aplicações containerizadas:
- **Pods**: Containers que trabalham em conjunto.
- **Services**: Pods que trabalham em conjunto.
- **Deployments**: Provê uma única declaração para Pods e ReplicaSets;
- **Labels**: Usado para organizar serviços.






































































