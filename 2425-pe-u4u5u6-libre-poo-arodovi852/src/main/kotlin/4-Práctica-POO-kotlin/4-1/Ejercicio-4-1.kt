fun main(){
    rectangulo = Rectangulo(4, 2)
}

class Rectangulo(
    var base: Int,
    var altura: Int
){
    fun area(base: Int, altura: Int): Int{
        var area = base*altura
        return area
    }
    funn perimetro(base: Int, altura: Int): Int{
        var perimetro = (2*base) + (2*altura)
        return perimetro
    }
    override fun toString(): String{
        return "Base: {base}"
    }
}