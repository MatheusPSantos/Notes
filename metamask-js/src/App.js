import "./App.css";
import { ethers } from 'ethers';
import { useState } from 'react';

function App() {

  const [message, setMessage] = useState('');

  async function connect() {
    if (!window.ethereum) {
      return setMessage('No metamask installed!');
    }

    setMessage('Trying to connect');

    await window.ethereum.send('eth_requestAccounts');
    const provider = new ethers.providers.Web3Provider(window.ethereum);
    const balance = await provider.getBalance("");///address to get balance
    setMessage(ethers.utils.formatEther(balance.toString()));
  }

  async function transfer() {
    const provider = new ethers.providers.Web3Provider(window.ethereum);
    const address = ""; //address to send
    const signer = provider.getSigner();
    ethers.utils.getAddress(address);
    const transaction = await signer.sendTransaction({
      to: address,
      value: ethers.utils.parseEther("0.55")
    });

    setMessage(transaction);
  }

  return (
    <div className="App">
      <input type="button" value="Connect" onClick={e => connect()} />
      <button onClick={() => transfer()}>transfer</button>
      <span>
        {JSON.stringify(message)}
      </span>
    </div>
  );
}

export default App;
