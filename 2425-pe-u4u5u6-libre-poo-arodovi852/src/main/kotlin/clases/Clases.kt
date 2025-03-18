package org.practicatrim2.clases

interface Rayo{
    val danio: Int
    val propiedad: String
}

interface MunicionLimitada{
    val danio: Int
    var ammo: Int
}


open class KitBase: Rayo{
    override val danio: Int = 50
    override val propiedad: String = "Siempre está activo."
}


class RayoDeRecarga: KitBase(), Rayo{
    override val danio: Int = 3
    override val propiedad: String = "Multiplica el daño si se carga."
    var cargado = false
    fun cargar(){
        cargado = true
        println("¡Rayo cargado!")
    }
    fun cambiarEstado(){
        if (activo == Activo.ON){
            activo = Activo.OFF
        }
        else{
            activo = Activo.ON
        }
    }
    var activo: Activo = Activo.ON
}


class RayoDeHielo: KitBase(), Rayo {
    override val danio: Int = 20
    override val propiedad: String = "Congela enemigos."
    var activo: Activo = Activo.OFF
    fun cambiarEstado(){
        if (activo == Activo.ON){
            activo = Activo.OFF
        }
        else{
            activo = Activo.ON
        }
    }
}

class RayoDeOndas: KitBase(), Rayo {
    override val danio: Int = 30
    override val propiedad: String = "Traspasa paredes."
    var activo: Activo = Activo.OFF
    fun cambiarEstado(){
        if (activo == Activo.ON){
            activo = Activo.OFF
        }
        else{
            activo = Activo.ON
        }
    }
}

class RayoDePlasma: KitBase(), Rayo {
    override val danio: Int = 75
    override val propiedad: String = "Traspasa enemigos."
    var activo: Activo = Activo.OFF
    fun cambiarEstado(){
        if (activo == Activo.ON){
            activo = Activo.OFF
        }
        else{
            activo = Activo.ON
        }
    }
}

class RayoAncho: KitBase(), Rayo {
    override val danio: Int = 40
    override val propiedad: String = "Rango incrementado."
    var activo: Activo = Activo.OFF
    fun cambiarEstado(){
        if (activo == Activo.ON){
            activo = Activo.OFF
        }
        else{
            activo = Activo.ON
        }
    }
}

enum class Activo{
    ON, OFF
}



class Misil: MunicionLimitada{
    override val danio: Int = 100
    override var ammo: Int = 20
    val seleccionado: Seleccionado = Seleccionado.FALSE
}

class SuperMisil: MunicionLimitada{
    override val danio: Int = 200
    override var ammo: Int = 10
    val seleccionado: Seleccionado = Seleccionado.FALSE
}

class BombaDePoder: MunicionLimitada{
    override val danio: Int = 300
    override var ammo: Int = 5
    val seleccionado: Seleccionado = Seleccionado.FALSE
}

enum class Seleccionado{
    TRUE, FALSE
}