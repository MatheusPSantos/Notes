import "./App.css";
import { ethers } from 'ethers';
import { useState } from 'react';

function App() {

  const [message, setMessage] = useState('');
  const [stringBalance, setStringBalance] = useState('');
  const [transferValue, setTransfer] = useState(0);

  async function connect() {
    if (!window.ethereum) {
      return setMessage('No metamask installed!');
    }

    setMessage('Trying to connect');

    await window.ethereum.send('eth_requestAccounts');
    const provider = new ethers.providers.Web3Provider(window.ethereum);
    const balance = await provider.getBalance("0x38E2cCb482A1865ea6f44B42Fc7d935c104B5114");///address to get balance
    setMessage(ethers.utils.formatEther(balance.toString()));
    setStringBalance(ethers.utils.formatEther(balance.toString()));
  }

  async function transfer() {
    if (Number(transferValue) >= Number(stringBalance)) {
      window.alert("Trying to transfer value bigger than balance.");
      return;
    }
    const provider = new ethers.providers.Web3Provider(window.ethereum);
    const address = "0xafa9d66e10Fe176c7db737c7021854efE04ff4F5"; //address to send
    const signer = provider.getSigner();
    ethers.utils.getAddress(address);
    const transaction = await signer.sendTransaction({
      to: address,
      value: ethers.utils.parseEther(transferValue)
    });

    setMessage(transaction);
    setTransfer("")
  }

  function handleChange(e) {
    e.preventDefault();
    setTransfer(e.target.value)
  }

  return (
    <>
      <div className="App" style={{ height: "10vh" }}>
        <input style={{ margin: "20px" }} type="button" value="Connect" onClick={e => connect()} />

      </div>
      <div className="App">
        SALDO: {stringBalance}
        <br></br>
        Log:
        <span>
          {JSON.stringify(message)}
        </span>
      </div>

      <div className="App">
        <input type="text" onChange={e => handleChange(e)} />
        <button style={{ margin: "20px" }} onClick={() => transfer()}>transfer</button>
      </div>
    </>

  );
}

export default App;
