import java.util.Scanner

fun vaquinha (preco:Float,pessoas:Int): Float {
    return preco/pessoas;
}

fun main() {
    val teclado=Scanner (System.`in`)
    print("Digite o preço total:\t ");
    var preco:Float=teclado.nextFloat()
    print("Digite quantas pessoas haviam:\t ")
    var pessoas:Int=teclado.nextInt()
    print("Cada pessoa terá que pagar R$ "+( preco/pessoas));
}