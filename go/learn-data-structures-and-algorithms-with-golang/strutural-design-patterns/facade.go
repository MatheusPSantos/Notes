package main

import "fmt"

type Account struct {
	id          string
	accountType string
}

func (acc *Account) create(accountType string) *Account {
	fmt.Println("account creation with type")
	acc.accountType = accountType
	return acc
}

func (acc *Account) getById(id string) *Account {
	fmt.Println("getting account by id")
	return acc
}

func (acc *Account) deleteById(id string) {
	fmt.Println("delete account by id")
}

type Customer struct {
	name string
	id   int64
}

func (cust *Customer) create(name string) *Customer {
	fmt.Println("creating customer")
	cust.name = name
	return cust
}

type Transaction struct {
	id            string
	amount        float32
	srcAccountId  string
	destAccountId string
}

func (trx *Transaction) create(srcAccountId string, destAccountID string, amount float32) *Transaction {
	fmt.Println("creating transaction")
	trx.srcAccountId = srcAccountId
	trx.destAccountId = destAccountID
	trx.amount = amount

	return trx
}

type BranchManagerFacade struct {
	account     *Account
	customer    *Customer
	transaction *Transaction
}

func NewBranchManagerFacade() *BranchManagerFacade {
	return &BranchManagerFacade{&Account{}, &Customer{}, &Transaction{}}
}

func (facade *BranchManagerFacade) createCustomerAccount(customerName string, accountType string) (*Customer, *Account) {
	var cust = facade.customer.create(customerName)
	var acc = facade.account.create(accountType)
	return cust, acc
}

func (facade *BranchManagerFacade) createTransaction(srcAccId, desAccId string, amount float32) *Transaction {
	var trx = facade.transaction.create(srcAccId, desAccId, amount)
	return trx
}

func main() {
	var facade = NewBranchManagerFacade()
	var customer *Customer
	var account *Account

	customer, account = facade.createCustomerAccount("Jhon Doe", "Savings")

	fmt.Println(customer.name, customer.id)
	fmt.Println(account.accountType, account.id)

	var transaction = facade.createTransaction("2200", "1100", 1250.59)
	fmt.Println(transaction.amount)
}
