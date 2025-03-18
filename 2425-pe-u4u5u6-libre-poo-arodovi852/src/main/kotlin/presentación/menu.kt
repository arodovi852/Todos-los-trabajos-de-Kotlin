package org.practicatrim2.presentación
import org.practicatrim2.procesos.Procesos
import org.practicatrim2.clases.*

class Menu() {
    fun abrirMenu() {
        println("Bienvenido al gestor de rayos de Samus.\n" +
            "Aquí podrás equiparle las armas que prefieras que lleve durante su aventura."
        )
        var seleccion = 0
        /*El bucle se ejecutará mientras el número no esté en el rango indicado*/
        while (seleccion != 4) {
            println("Selecciona la opción que desee realizar:\n" +
                    "1) Cambiar armas\n" +
                    "2) Ver armas\n" +
                    "3) Comenzar aventura\n" +
                    "4) Salir\n"
            )
            /*Captura de excepciones*/
            try {
                seleccion = readln().toInt()
            } catch (e: NumberFormatException) {
                println("Introduce un valor válido")
            }
            if (seleccion == 1) {
                var seleccion1 = 0
                /*El bucle se ejecutará mientras el número no esté en el rango indicado*/
                while (seleccion1 < 1 || seleccion1 > 3) {
                    println("¿Qué tipos de arma desea cambiar?\n" +
                            "1) Rayos base\n" +
                            "2) Munición limitada\n" +
                            "3) Salir\n"
                    )
                    try {
                        seleccion1 = readln().toInt()
                    } catch (e: NumberFormatException) {
                        println("Introduce un valor válido")
                    }
                    if (seleccion1 == 1) {
                        /*Cambia el estado de los rayos para activarlos o desactivarlos*/
                        var seleccion2 = 0
                        while (seleccion2 != 6) {
                            println("¿Qué rayo desea cambiar de estado:\n" +
                                    "1) Rayo de recarga: ${RayoDeRecarga().activo}\n" +
                                    "2) Rayo de hielo: ${RayoDeHielo().activo}\n" +
                                    "3) Rayo de ondas: ${RayoDeOndas().activo}\n" +
                                    "4) Rayo de plasma: ${RayoDePlasma().activo}\n" +
                                    "5) Rayo ancho: ${RayoAncho().activo}\n" +
                                    "6) Salir\n"
                            )
                            try {
                                seleccion2 = readln().toInt()
                            } catch (e: NumberFormatException) {
                                println("Introduce un valor válido")
                            }
                            Procesos().cambiarEstado(seleccion2)
                        }
                    }
                    if (seleccion1 == 2) {
                        var seleccion2 = 0
                        while (seleccion2 < 1 || seleccion2 > 3){
                            println("¿Qué arma de munición desea recargar?\n" +
                                    "1) Misil. Estado: ${Misil().ammo}\n" +
                                    "2) Supermisil. Estado: ${SuperMisil().ammo}\n" +
                                    "3) Bomba de poder. Estado: ${BombaDePoder().ammo}\n" +
                                    "4) Salir"
                            )
                            try {
                                seleccion2 = readln().toInt()
                            } catch (e: NumberFormatException) {
                                println("Introduce un valor válido")
                            }
                            Procesos().recargarMunicion(seleccion2)
                        }
                    }
                }
            }
            if (seleccion == 2) {
                println("1) Rayo de recarga. Estado: ${RayoDeRecarga().activo}\n" +
                        "2) Rayo de hielo. Estado: ${RayoDeHielo().activo}\n" +
                        "3) Rayo de ondas. Estado: ${RayoDeOndas().activo}\n" +
                        "4) Rayo de plasma. Estado: ${RayoDePlasma().activo}\n" +
                        "5) Rayo ancho. Estado: ${RayoAncho().activo}\n" +
                        "6) Misil. Estado: ${Misil().ammo}\n" +
                        "7) Supermisil. Estado: ${SuperMisil().ammo}\n" +
                        "8) Bomba de poder. Estado: ${BombaDePoder().ammo}\n"
                )
            }
            if (seleccion == 3) {
                comenzarMision()
            }
            if (seleccion < 1 || seleccion > 4){
                println("Número fuera del rango especificado")
            }
        }
        println("Ha sido un placer.")
    }

    fun comenzarMision(){
        println("El kit de Samus final es:\n" +
                "1) Rayo de recarga. Estado: ${RayoDeRecarga().activo}\n" +
                "2) Rayo de hielo. Estado: ${RayoDeHielo().activo}\n" +
                "3) Rayo de ondas. Estado: ${RayoDeOndas().activo}\n" +
                "4) Rayo de plasma. Estado: ${RayoDePlasma().activo}\n" +
                "5) Rayo ancho. Estado: ${RayoAncho().activo}\n" +
                "6) Misil. Estado: ${Misil().ammo}\n" +
                "7) Supermisil. Estado: ${SuperMisil().ammo}\n" +
                "8) Bomba de poder. Estado: ${BombaDePoder().ammo}\n")
    }
}

