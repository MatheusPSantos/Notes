import React, { useState, useEffect } from "react";
import { ethers } from 'ethers';

function App() {

  const [greet, setGreet] = useState('');
  const [ greetingValue, setGreetingValue ] = useState('');
  const [ depositValue, setDepositValue ] = useState('');

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
          <h3>Greeting</h3>
          <p>Contract balance: 0</p>
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
