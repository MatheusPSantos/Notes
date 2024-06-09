package main

import (
	"fmt"
	"net/http"
	"os"
	"strings"
	"time"
  "strconv"
	"io/ioutil"
	"bufio"
	"io"
)

const monitoramento = 4
const delay = 5

func main() {
	introducao()

	for {
  
		exibeMenu()

		comando := lerComando()

		switch comando {
		case 1:
			iniciarMonitoramento()
		case 2:
			fmt.Println("Exibindo logs...")
      imprimeLogs() 
		case 0:
			fmt.Println("Saindo do programa.")
			os.Exit(0)
		default:
			fmt.Println("Esse comando não é válido")
			os.Exit(-1)
		}
	}

}

func exibeMenu() {
	fmt.Println("****************************")
	fmt.Println("1 - Iniciar monitoramento")
	fmt.Println("2 - Exibir Logs")
	fmt.Println("0 - Sair do programa")
	fmt.Println("****************************")
}

func introducao() {
	nome := "Hebert"
	var versao float32 = 1.1
	fmt.Println("Olá ", nome, "\nVocê está usando a versão ", versao)
}

func lerComando() int {
	var comando int
	// fmt.Scanf("%d", &comando)
	fmt.Scan(&comando)
	fmt.Println("O valor da variável comando é:", comando)
	return comando
}

func iniciarMonitoramento() {
	fmt.Println("Monitorando...")
	sites := []string{
		"https://www.httpbin.org/status/502",
		"https://www.alura.com.br",
		"https://github.com",
		"https://linkedin.com",
	}

	fmt.Println(sites)

  for j := 0; j < monitoramento; j ++ {
    for i, site := range sites {
      fmt.Println(i, "- ", site)
      testaSite(site)
    }
    time.Sleep(delay * time.Second)
  }
}

func testaSite(site string) {
	resp, err := http.Get(site)
  if err != nil {
    fmt.Println("Ocorreu um erro: ", err)
  }
	if resp.StatusCode == 200 {
		fmt.Println("Site: ", site, " foi carregado com sucesso")
    registraLog(site, true)
	} else {
		fmt.Println("Site: ", site, " está com problemas. Status Code: ", resp.StatusCode)
    registraLog(site, false)
	}
}

func lerSitesArquivo() []string {
  var sites []string
  arquivo, err := os.Open("sites.txt")
  // arquivo, err := ioutil.ReadFile("sites.txt")
  if err != nil {
    fmt.Println("Ocorreu um erro: ", err)
    os.Exit(-1)
  }
  leitor := bufio.NewReader(arquivo)
  for {
    linha, err := leitor.ReadString('\n')
    linha = strings.TrimSpace(linha)
    sites = append(sites, linha)
    if err == io.EOF {
      break
    }
  }
  arquivo.Close()
  return sites
}

func registraLog(site string, status bool) {
  arquivo, err := os.OpenFile("log.txt", os.O_RDWR|os.O_CREATE|os.O_APPEND, 0666)
  if err != nil {
    fmt.Println("Ocorreu um erro: ", err)
  }
  arquivo.WriteString(
    time.Now().Format("02/01/2006 15:04:05") + " - " +
    site + " - Online: " + strconv.FormatBool(status) + "\n")
  arquivo.Close()
}

func imprimeLogs() {
  arquivo, err := ioutil.ReadFile("log.txt")
  if err != nil {
    fmt.Println("Ocorreu um erro: ", err)
  }
  fmt.Println(string(arquivo))
}