package com.example.triangulo4a.Presentador

import com.example.triangulo4a.Contratos.contratocirculo
import com.example.triangulo4a.Modelo.CirculoModelo

class CirculoPresenter(private val vista: contratocirculo.Vista): contratocirculo.Presentador {

    private val modelo: contratocirculo.Modelo= CirculoModelo();


    override fun area(radio: Float) {
        if (modelo.valida(radio) == true) {
            val a = modelo.area(radio)
            vista.showArea(a)
        } else {
            vista.showError("Datos incorrectos")
        }
    }

    override fun perimetro(radio: Float) {
        if (modelo.valida(radio) == true) {
            val p = modelo.perimetro(radio)
            vista.showPerimetro(p)
        } else {
            vista.showError("Datos incorrectos")
        }
    }
}