Link do artigo: https://arxiv.org/pdf/1909.00939.pdf

Anotações:
# Introductions
- In history, DApps usually refer to applications that run on the Peer-to-peer network of computers rather a single centralized computer.
- Research Questions of the article:
-- How is the popularity of DApps distributed?
-- Are there any common practices of developing DApps?
-- How much is the cost of DApps when running on the blockchain?

# II
- An Ether transfer represents that a user account
transfers some Ether to another one. A contract execution
represents that an account calls a function of a smart contract
with some data as the input and some Ether as the fee for
executing the contract.
- In Ethereum, there are two kinds of accounts: user accounts and smart-contract accounts. The user account represent participants, including callers (who call funciotns of smart contracts), deployers (who deploy smart contracts on Ethereum), and miners (whose node work to do contribution to the ledger).
- The smart contract accounts represent the smart contract which is a type of programs that are saved in and able to run on blockchains, called chaincode as well.
- Transactions can be classified from two dimensions:
    - On the one hand: according to the data in the transaction:
      - transaction: Ether transfer or contract executions.
    - On the other hand:
      - transaction initiator: external transactions (user accounts), internal transactions (smart contract accounts).
    
- Target account is a user -> transaction belongs to Ether transfer. Target account is a smart contract account -> transaction belongs to contract execution.




### B
Therefore Ethereum DApp should be handled and stored on the blockchain for pure decentralization. However, due to the performance bottleneck of the state-of-the-art  blockchain systems, current DApps usually implement only parts of their functionality on the blockchain.

DApps Architectures in pratice:
- Direct
  - the client directly interacts with smart contracts deployed on the Ethereum.
- Indirect
  - have back-end services running on a centralized server, an the client interacts with smart contracts through the server.

- Mixed
  - combines the preceding two architectures where the client interacts with smart contracts both directly through a back-end server.


Solidity is the programming language for developing smart contracts in the Ethereum community.
- Is a javascript-like language
- source code is compiled into bytecode
- bytecode is deployed on Ethereum
- after deployment, the smart contract will get an address.

Smart contract deployment:
- All accounts can deploy smart contracts.
- factory pattern: contracts deploy child contracts

Cost of smart contracts:
- accounts  have to pay gas for every transaction

## Popularity of Dapps
- A. Dapp distribution
  - we use three metrics: number of unique address; the number of transactions; amount of transaction volume.
- popularity by users
-  popularity by transactions
- popularity by transaction volumes

## DApp category
