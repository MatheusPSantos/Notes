import React, { useState, useEffect } from "react";
import { ethers } from 'ethers';

function App() {

  const [greet, setGreet] = useState('');
  const [balance, setBalance] = useState();
  const [greetingValue, setGreetingValue] = useState('');
  const [depositValue, setDepositValue] = useState('');

  const provider = new ethers.providers.Web3Provider(window.ethereum);
  const signer = provider.getSigner();
  const contractAddress = '0x5FbDB2315678afecb367f032d93F642f64180aa3';
  //const contractAddress = '0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266';
  // ABI é uma formatacao legível para humanos do contrato
  const ABI = [
    {
      "inputs": [
        {
          "internalType": "uint256",
          "name": "_unlockTime",
          "type": "uint256"
        },
        {
          "internalType": "string",
          "name": "_greeting",
          "type": "string"
        }
      ],
      "stateMutability": "payable",
      "type": "constructor"
    },
    {
      "anonymous": false,
      "inputs": [
        {
          "indexed": false,
          "internalType": "uint256",
          "name": "amount",
          "type": "uint256"
        },
        {
          "indexed": false,
          "internalType": "uint256",
          "name": "when",
          "type": "uint256"
        }
      ],
      "name": "Withdrawal",
      "type": "event"
    },
    {
      "inputs": [],
      "name": "deposit",
      "outputs": [],
      "stateMutability": "payable",
      "type": "function"
    },
    {
      "inputs": [],
      "name": "greet",
      "outputs": [
        {
          "internalType": "string",
          "name": "",
          "type": "string"
        }
      ],
      "stateMutability": "view",
      "type": "function"
    },
    {
      "inputs": [],
      "name": "owner",
      "outputs": [
        {
          "internalType": "address payable",
          "name": "",
          "type": "address"
        }
      ],
      "stateMutability": "view",
      "type": "function"
    },
    {
      "inputs": [],
      "name": "unlockTime",
      "outputs": [
        {
          "internalType": "uint256",
          "name": "",
          "type": "uint256"
        }
      ],
      "stateMutability": "view",
      "type": "function"
    },
    {
      "inputs": [],
      "name": "withdraw",
      "outputs": [],
      "stateMutability": "nonpayable",
      "type": "function"
    }
  ];

  const contract = new ethers.Contract(contractAddress, ABI, signer);

  useEffect(() => {
    (async function connectWallet() {
      await provider.send("eth_requestAccounts", []);
    })
      ().catch(console.error);

    const getBalance = async () => {
      const balance = await provider.getBalance(contractAddress);
      const balanceFormatted = ethers.utils.formatEther(balance);
      setBalance(balanceFormatted);
    };

    const getGreeting = async () => {
      const greeting = await contract.greet();
      setGreet(greeting);
    };

    getBalance()
      .catch(console.error);

    getGreeting()
      .catch(console.error);
  });



  const handleDepositChange = (e) => {
    setDepositValue(e.target.value);
  };

  const handleGreetingChange = (e) => {
    setGreetingValue(e.target.value);
  };

  const handleDepositSubmit = (e) => {
    e.preventDefault();
  };

  const handleGreetingSubmit = (e) => {
    e.preventDefault();
  };

  return (
    <div className="container">
      <div className="row mt-5">
        <div className="col">
          <h3>{greet}</h3>
          <p>Contract balance: {balance}</p>
        </div>
        <div className="col">
          <form className="mt-5" onSubmit={handleDepositSubmit}>
            <div className="mb-3">
              <input
                type="number"
                className="form-control"
                id=""
                placeholder="0"
                value={depositValue}
                onChange={handleDepositChange}
              />
            </div>
            <button type="submit" className="btn btn-success">Deposit</button>
          </form>

          <form className="mt-5" onSubmit={handleGreetingSubmit}>
            <div className="mb-3">
              <input
                type="text"
                className="form-control"
                id=""
                value={greetingValue}
                onChange={handleGreetingChange}
              />
            </div>
            <button type="submit" className="btn btn-dark">Change</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default App;
