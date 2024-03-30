fn main() {
    let nota1: f32 = 10f32;
    let nota2: f32 = 8f32;
    let nota3: f32 = 9.5;
    let nota4: f32 = 6f32;

    let notas = [10f32, 8f32, 9.5, 6f32];
    let notas2: [f32; 4] = [6.5; 4];

    let matriz: [[f32; 3]; 2] = [[0.0, 1.2, 9.3], [0.8, 8.7, 5.9]];

    println!("nota 1 = {}", nota1);
    println!("nota 2 = {}", nota2);
    println!("nota 3 = {}", nota3);
    println!("nota 4 = {}", nota4);

    println!(
        "Nota 1 = {}\nNota 2 = {}\nNota 3 = {}\nNota 4 = {}",
        notas[0], notas[1], notas[2], notas[3],
    );

    for indice in 0..notas.len() {
        println!("a nota {} é = {}", indice + 1, notas[indice]);
    }

    for nota in notas2 {
        println!("{}", nota);
    }

    for linha in matriz {
        for item in linha {
            println!("item {} ", item);
        }
    }

    let inteiro: usize = 0;
    println!("{}", notas[inteiro]);

    println!(
        "é dia de semana? {}",
        eh_fim_de_semana(DiasDaSemana::Quarta)
    );

    cores();

    conteudo_opicional();

    vectors();

    conta_corrente();
}

#[allow(dead_code)]
enum DiasDaSemana {
    Domingo,
    Segunda,
    Terça,
    Quarta,
    Quinta,
    Sexta,
    Sábado,
}

fn eh_fim_de_semana(dia_da_semana: DiasDaSemana) -> bool {
    match dia_da_semana {
        DiasDaSemana::Domingo | DiasDaSemana::Sábado => true,
        _ => false,
    }
}

#[allow(dead_code)]
enum Color {
    Red,
    Green,
    Blue,
    RgbColor(u8, u8, u8),
    Cymk {
        cyan: u8,
        magenta: u8,
        yellow: u8,
        black: u8,
    },
}

fn cores() {
    let cor = Color::RgbColor(0, 9, 8);
    let cor2 = Color::Cymk {
        cyan: 0,
        magenta: 0,
        yellow: 0,
        black: 255,
    };

    println!(
        "Cor = {}",
        match cor {
            Color::Red => "vermelho",
            Color::Green => "verde",
            Color::Blue => "azul",
            Color::RgbColor(0, 0, 0)
            | Color::Cymk {
                cyan: _,
                magenta: _,
                yellow: _,
                black: 255,
            } => "preto",
            Color::RgbColor(_, _, _) => "RGB desconhecido",
            Color::Cymk {
                cyan: _,
                magenta: _,
                yellow: _,
                black: _,
            } => "CYMK desconhecido",
        }
    )
}

fn conteudo_opicional() {
    let conteudo_arquivo = ler_arquivo(String::from(""));
    match &conteudo_arquivo {
        Some(valor) => println!("{}", valor),
        None => println!("Arquivo não existe"),
    };

    println!("{:?}", conteudo_arquivo);

    if let Some(valor) = conteudo_arquivo {
        println!("Agora tenho certeza que há valor = {}", valor);
    }
}

fn ler_arquivo(caminho_arquivo: String) -> Option<String> {
    Some(String::from("Conteudo de algum arquivo"))
}

enum Option2<T> {
    Some(T),
    None,
}

fn vectors() {
    let mut notas: Vec<f32> = Vec::new();
    notas.push(10f32);
    notas.push(8f32);
    notas.push(1f32);
    notas.push(5.6f32);

    println!("{:?}", notas);
    println!("{}", notas[1]);

    println!("usando macho vec!");

    let notas2: Vec<f32> = vec![1.2f32, 4.5f32, 9f32, 9f32];

    println!("{:?}", notas2);

    println!(
        "nota = {}",
        match notas.get(2) {
            Some(n) => *n,
            None => 0.0,
        }
    );

    if let Some(nota) = notas.pop() {
        println!("ultimo valor = {}", nota);
        println!("{:?}", notas);
    };
}
struct Conta {
    titular: Titular,
    saldo: f64,
}

impl Conta {
    fn sacar(&mut self, valor: f64) {
        self.saldo = self.saldo - valor;
    }
}

struct Titular {
    nome: String,
    sobrenome: String,
}

fn conta_corrente() {
    let mut conta: Conta = Conta {
        titular: Titular {
            nome: String::from("Matheus"),
            sobrenome: String::from("XPTO"),
        },
        saldo: 1008.00,
    };

    println!(
        "Dados da conta:  Titular = {} e saldo = {}",
        conta.titular.nome, conta.saldo
    );

    conta.sacar(50.0);
    println!("sacando 50 reais, saldo final = {}", conta.saldo);
}
