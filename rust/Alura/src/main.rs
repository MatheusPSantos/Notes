const PI: f32 = 3.14;
static variavel_global: u8 = 1;

fn soma(a: i32, b: i32) -> i32 {
    println!("{} + {} = {}", a, b, a + b);
    a + b
}

fn sombra() {
    let a = 123;

    println!("a = {}", a);

    {
        let b = 456;
        println!("b  = {}", b);
    }
    //println!("b = {}", b);
    {
        let a = 1999;

        println!("interno a = {}", a);
    }

    println!("externo a = {}", a);
}

fn escopo() {
    println!("PI = {}", PI);
    println!("variavel_global = {}", variavel_global);
    let variavel = 300;

    println!("variavel = {}", variavel);
    println!("tamanho = {} bytes", std::mem::size_of_val(&variavel));

    let decimal: f32 = 2.5;

    println!(
        "decimal = {}, tamanho = {} bytes",
        decimal,
        std::mem::size_of_val(&variavel)
    );

    let mut booleana: bool = false;
    println!(
        "booleana = {}, tamanho = {} bytes",
        booleana,
        std::mem::size_of_val(&booleana)
    );
    booleana = true;
    println!("booleana alterada = {} ", booleana);

    let letra: char = 'C';
    println!(
        "letra = {}, tamanho = {} bytes",
        letra,
        std::mem::size_of_val(&letra)
    );
}

fn repeticoes() {
    let multiplicador: u8 = 5;

    let mut contador: u8 = 0;
    while contador < 10 {
        contador += 1;
        println!(
            "{} x {} = {}",
            multiplicador,
            contador,
            multiplicador * contador
        );
    }

    contador = 0;
    loop {
        contador += 1;
        println!(
            "{} x {} = {}",
            multiplicador,
            contador,
            multiplicador * contador
        );
        if contador == 10 {
            break;
        }
    }

    for i in 1..11 {
        println!("{} x {} = {}", i, multiplicador, i * multiplicador);
    }
}

fn ownership() {
    let uma_string = String::from("Rust");
    //rouba(uma_string);
    rouba(&uma_string);
    let mut outra_string = String::from("Node");

    println!("{}", uma_string);

    rouba2(&mut outra_string);
}

fn rouba(string: &String) {
    println!("{}", string);
}

fn rouba2(string: &mut String) {
    string.push_str("Dias");
    println!("{}", string);
}

fn pattern_matching() {
    for x in 1..=20 {
        println!(
            "{}: {}",
            x,
            match x {
                1 => "pouco",
                2 | 3 => "pouquinho",
                4..=10 => "Um bocado",
                _ if x % 2 == 0 => "Uma boa quantidade",
                _ => "muito",
            }
        );
    }
}

fn erros() {
    match result() {
        Ok(s) => println!("A string de sucesso {}", s),
        Err(numero) => println!("Codigo de erro {}", numero),
    };
}

fn result() -> Result<String, u8> {
    Err(42)
}

fn main() {
    sombra();
    escopo();

    soma(23, 7);

    let idade: u8 = 17;
    let responsavel_autoriza = true;

    if idade >= 18 {
        println!("Pode entrar na balada");
    } else if idade > 16 && responsavel_autoriza {
        println!("Pode entrar na balada com assinatura de responsável");
    } else {
        println!("Não pode entrar na balada");
    }

    let condicao = if idade >= 18 { "maior" } else { "menor" };

    println!("é {} de idade", condicao);

    repeticoes();

    let linguagem = "Kotlin";
    let proposito = match linguagem {
        "PHP" => "web",
        "Kotlin" => "android",
        "Python" => "Data scince",
        _ => "desconhecido",
    };

    println!("O propósito de {} é {}", linguagem, proposito);

    ownership();
    pattern_matching();
    erros();
    result();
}
