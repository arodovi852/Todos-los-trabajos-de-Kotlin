package org.practicatrim2.procesos

import org.practicatrim2.clases.*


class Procesos {
    var danioTotal = KitBase().danio
    fun dispararRayo(){
        println("¡Rayo disparado!")
        calcularDanioTotalRayos()
    }
    fun dispararMunicion(){
        if (Misil().seleccionado == Seleccionado.TRUE){
            if (Misil().ammo >= 0) {
                Misil().ammo -= 1
                println("¡Misil utilizado! Daño realizado: ${Misil().danio}")
                println("Munición restante: ${Misil().ammo}")
            } else {
                println("¡Munición insuficiente! Necesitas recargar primero.")
            }
        }
        else if (SuperMisil().seleccionado == Seleccionado.TRUE){
            if (SuperMisil().ammo >= 0) {
                SuperMisil().ammo -= 2
                println("¡Misil utilizado! Daño realizado: ${SuperMisil().danio}")
                println("Munición restante: ${SuperMisil().ammo}")
            } else {
                println("¡Munición insuficiente! Necesitas recargar primero.")
            }
        }
        else if (BombaDePoder().seleccionado == Seleccionado.TRUE){
            if (BombaDePoder().ammo >= 0) {
                BombaDePoder().ammo -= 5
                println("¡Misil utilizado! Daño realizado: ${BombaDePoder().danio}")
                println("Munición restante: ${BombaDePoder().ammo}")
            } else {
                println("¡Munición insuficiente! Necesitas recargar primero.")
            }
        }
        else{
            println("Ningún arma de munición limitada fue seleccionada.")
        }
    }
    fun recargarMunicion(seleccion: Int){
        if (seleccion == 1){
            Misil().ammo = 250
            println("Munición recargada. Munición actual: ${Misil().ammo}")
        }
        if (seleccion == 2){
            SuperMisil().ammo = 200
            println("Munición recargada. Munición actual: ${SuperMisil().ammo}")
        }
        if (seleccion == 3){
            BombaDePoder().ammo = 100
            println("Munición recargada. Munición actual: ${BombaDePoder().ammo}")
        }
    }

    fun calcularDanioTotalRayos(){
        var danioTotal = KitBase().danio
        if (RayoDeHielo().activo == Activo.ON){
            danioTotal += RayoDeHielo().danio
        }
        if (RayoDeOndas().activo == Activo.ON){
            danioTotal += RayoDeOndas().danio
        }
        if (RayoDePlasma().activo == Activo.ON){
            danioTotal += RayoDePlasma().danio
        }
        if (RayoAncho().activo == Activo.ON){
            danioTotal += RayoAncho().danio
        }
        if (RayoDeRecarga().activo == Activo.ON && RayoDeRecarga().cargado == true){
            danioTotal *= RayoDeRecarga().danio
        }
        println("Daño total: $danioTotal")
    }
    fun cambiarEstado(seleccion: Int){
        if (seleccion == 1){
            if (RayoDeRecarga().activo == Activo.ON){
                RayoDeRecarga().activo = Activo.OFF
            }
            else{
                RayoDeRecarga().activo = Activo.ON
            }
        }
        if (seleccion == 2){

            if (RayoDeHielo().activo == Activo.ON){
                RayoDeHielo().activo = Activo.OFF
            }
            else{
                RayoDeHielo().activo = Activo.ON
            }
        }
        if (seleccion == 3){
            if (RayoDeOndas().activo == Activo.ON){
                RayoDeOndas().activo = Activo.OFF
            }
            else{
                RayoDeOndas().activo = Activo.ON
            }
        }
        if (seleccion == 4){
            if (RayoDePlasma().activo == Activo.ON){
                RayoDePlasma().activo = Activo.OFF
            }
            else{
                RayoDePlasma().activo = Activo.ON
            }
        }
        if (seleccion == 5){
            if (RayoAncho().activo == Activo.ON){
                RayoAncho().activo = Activo.OFF
            }
            else{
                RayoAncho().activo = Activo.ON
            }
        }
    }
}