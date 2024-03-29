// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.9;

import "hardhat/console.sol";

contract Lock {
    uint public unlockTime;
    address payable public owner;
    string private greeting;
    event Withdrawal(uint amount, uint when);

    constructor(uint _unlockTime, string memory _greeting) payable {
        require(
            block.timestamp < _unlockTime,
            "Unlock time should be in the future"
        );

        unlockTime = _unlockTime;
        owner = payable(msg.sender);
        greeting = _greeting;
        console.log("Changing greeting from ", greeting, " to ", _greeting);
    }

    function withdraw() public {
        // Uncomment this line, and the import of "hardhat/console.sol", to print a log in your terminal
        // console.log("Unlock time is %o and block timestamp is %o", unlockTime, block.timestamp);

        require(block.timestamp >= unlockTime, "You can't withdraw yet");
        require(msg.sender == owner, "You aren't the owner");

        emit Withdrawal(address(this).balance, block.timestamp);

        owner.transfer(address(this).balance);
    }

    function deposit() payable public {}

    function greet() public view returns (string memory) {
        return greeting;
    }
}
