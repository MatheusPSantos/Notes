fn factorial(n: u64) -> u64 {
	if n == 0 || n == 1 {
		1
	} else {
		n * factorial(n - 1)
	}
}

fn main() {
	let num: u64 = 5;
	let result = factorial(num);
	println!("Factorial of {} id {}", num, result);
}
