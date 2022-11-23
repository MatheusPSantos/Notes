1 - Instalar Hardhat:
    - É um ambiente para compilar, deploy, teste e debuging do Ethereum software.
    - hardhat.org
    - fazer um bootstrap do projeto com o comando npx hardhat
2 - Ao compilar, cria uma pasta chamada artifacts:
    -  Abi basicamente diz e fala sobre as funcoes
    -  Bytecode é o que é deployado na EVM
    -  
3 - tests
    - testar é preciso pois n pode alterar o SC quando faz o deploy
4 - Deploy
    - npx hardhat run scripts/
    - ou start com npx hardhat node
    - instalar metamask, adicionar a rede de teste localhost:8545 com chain id 31337 para o hardhat e
 depois escolher um private key fornecido e adicionar na metamask.
    - Com o node rodando, ainda precisamos fazer o deploy do contrato
    - rodar o script específico com npx hardhat run scripts/nome.js e usar a flag --network localhost para fazer o deploy no localhost
    - irá aparecer um endereco que aponta onde foi feito o deploy. Exemplo: 0x5FbDB2315678afecb367f032d93F642f64180aa3
5 - instalar a biblioteca ethers js.
    - versao usada = 5
    - provider --> somente leitura na blockchain
    - signer --> tem acesso a chave privada e pode fazer mudancas e criar transcoes com a blockchain
6 - querying blockchain
    - usar o signer
    - user sendTransaction()
    - 
## sobre o projeto
A pasta `app` contém o projeto front end.
