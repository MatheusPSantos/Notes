# Bitcoin
> Notes about the Satoshi Nakamoto paper

## Introduction

Completely non-reversible transactions are not really possible, since financial institutions cannot avoid mediating disputes.

What is neeeded is an eletronic payment system based on cryptographic proof instead of trust. This allow two parts make transaction without the need for a trusted third part.

## Transactions

Eletronic coin --> a chain of digital signatures.
- Each owner transfer the coin to the next
- IS need hash the previous transaction and the public key of the next owner
- Add these to the end of the coin

Is needed a way fot he payee to know that the previous owbers did not sign any earlier transactions. We dont' cara about later attempts to double-spend.

To veify that one of the owners did not double-spend the coin, without a trusted third party, transactions must be publicly announced:
- "we need a system for participants to agree on a single history of the order in which they were received."

## Timestamp Server

"A timestamp server works by taking a hash of a block of items to be timestamped and widely publishing the hash...".

"The timestamp proves that the data must have existed at the time, obviously, in order to get into the hash".

## Proof-of-Work

A system similar to Adam Back's Hashcash.

"The proof-of-work involves scanning for a value that whe hashed, such as with SHA-256, the hash begins with a number of zero bits".

For the timestamp network, the proof-of-work is implemented by incrementing a nonce in the block until a value is found that gives the block's hash the required zero bits.

- Proof-of-work is essentially one-CPU-one-vote;
- The majority decisions is represented by the longest chain, which has the greatest proof-of-work of the block
- To compensate for increasing hardware speed and varying interest it running nodes over time, the difficulty is increased, if the blocks are generetad too fast.

## Network
Steps to run:

1 - New transactions are broadcast all nodes;
2 - Each node collects new transactions into a block;
3 - Each node works on finding a difficult proof-of-work for its block;
4 - When a node finds a proof-of-work, it broadcasts the block to all nodes;
5 - Nodes accept the block only if all transactions in it are valid and not already spent;
6 - Nodes express thei acceptance of the block by working on creating the next block in the chain, using the hash os the accepted blcok as the previous hash.

Nodes consider the longest chain to be correct and keep working on extending it.

In case of different nodes broadcast different versions of the next block simultaneously, some nodes may receive one or the other:
- They work on the first one received
- Save the other branch in case of it becomes longer
- The tie will be broken when the next proof-of-work is found and onde branch becomes longer
- All nodes working in the other branch will switch to the longer one;

## Incentive

"The first transaction in a block is a special transaction that starts a new coin owned by the creator of the block. This adds an incentive for nodes to support the network, and provides a way to initailly distribute coins into circulation, since ther is no central authority to issue them."

The incentive can also be funded with transaction fees.

## Reclaiming Disk Space