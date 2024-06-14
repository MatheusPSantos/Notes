package models

import (
	"webapp/db"
)

type Produto struct {
	Nome, Descricao string
	Preco           float64
	Quantidade, Id  int
}

func BuscaTodosOsProdutos() []Produto {
	db := db.ConectaComBancoDeDados()
	selectDeTodosOsProdutos, err := db.Query("SELECT * FROM produtos")
	if err != nil {
		panic(err.Error())
	}

	p := Produto{}
	produtos := []Produto{}

	for selectDeTodosOsProdutos.Next() {
		var id, quantidade int
		var nome, descricao string
		var preco float64

		err = selectDeTodosOsProdutos.Scan(&id, &nome, &descricao, &preco, &quantidade)
		if err != nil {
			panic(err.Error())
		}

		p.Nome = nome
		p.Descricao = descricao
		p.Quantidade = quantidade
		p.Preco = preco
		p.Id = id

		produtos = append(produtos, p)
	}
	defer db.Close()
	return produtos
}

func CriarNovoProduto(nome string, descricao string, preco float64, quantiade int) {
	db := db.ConectaComBancoDeDados()
	insereDadosNoBanco, err := db.Prepare("INSERT INTO produtos (nome, descricao, preco, quantidade) VALUES ($1, $2, $3, $4)")
	if err != nil {
		panic(err.Error())
	}
	insereDadosNoBanco.Exec(nome, descricao, preco, quantiade)
	defer db.Close()
}

func DeletarProduto(id int) {
	db := db.ConectaComBancoDeDados()
	deletarProduto, err := db.Prepare("DELETE FROM produtos WHERE id = $1")
	if err != nil {
		panic(err.Error())
	}
	deletarProduto.Exec(id)
	defer db.Close()
}