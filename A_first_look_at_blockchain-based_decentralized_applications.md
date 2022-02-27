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
- After Feb. 2018, more DApps were published every day.
- DApps from category Exchanges and Finance were hot early. and the DApps with the financial feature like gambling games grew rapidly.


## Development Of DApps
### Open source
- On-chain: smart contracts are implemented to use the capability of blockchains
- Off-chain: where traditional programs are implemented to provide services to end-users.
- Two levels of open source of DApss: contract level (on-chain) and project level (off-chain)
- DApp project is not open source and Smart contract are all closed source is the 25% of the amount;
- DApp project is not open source and Smart contract are all open source is the 27.8% of the amount;
- DApp project is open source but Smart contract are all closed source is the 27.3% of the amount;
- DApp project is open source and the Smart contract are all open source is the 15.7% of the amount;
- DApp project is open source and the part of the smart contract are open source is the 2.1% os the amount;
- DApp project is not open source and the part of the smart contract are open source is the 2.1% of the amount;

- Only 15.7% of DApps are fully open source and 25.0% of DApps are fully closed source;
- This result implies that developers tend to share the code of smart contracts rather than the DApps.
- DApps whose smart contracts are all closed source have smaller number of transactions;
- DApps whose smart contracts are all open source have higher maximum transactions;


###B Usabe Patterns of Smart Contracts
- Developers use smart contracts to keep data on the chaim and do some operations;
- Sometimes the operations are too complex to be done by one smart contract, so developers implement multiple smart contracts for a single DApp;
-  Single Contract DApp -> are supported by one smart contract;
- Multi-contract Dapps -> are supported by multiple smart contracts;

## Cost of Smart Cntract in DApps
Includes two parts: deployment cost and execution cost;
- Deployments and executions are done as transactions, which cost gas;
- Gas are paid with Ethers;
- The amount of gas used as complexity of a contract execution;
- Deployment cost of Smart contract:
	- Deployment cost of different usage patterns of smart contracts:
		- smart contract of the single pattern cost smaller than othes;
		- smart contracts of leader-member pattern and equivalent pattern have mnore deployment cost;
	- Influence Factors:
		- Number of Functions, Lines of Code, could reflect the complexity of smart contract and may influence the deployment cost;
- Execution cost of smart contracts:
	- Users (caller) sends gas and Ether if necessary to execute function;
	- Gas sent in transactions: in pratice, end users interacts with clients, where some operations are translated to contract executions and sent to smart contracts;
	- Contract executions with Internal Transactions: internal transactions also cost gas. Because smart contracts cannot actively initiate internal transactions, they are triggered by external transactions.

- Difference among Smart Contract Usage patterns:
	- new metric: agas -> a verage gas
	- agas = (SUM(gas median of functions i) * (Count of function i))/SUM(Count of functions i)

	- In general, smart contracts of leader-member pattern and factory pattern cost more gas in contract executions.
