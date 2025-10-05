package com.example.triangulo4a.Presentador

import com.example.triangulo4a.Contratos.contratoCuadrado
import com.example.triangulo4a.Modelo.CuadradoModelo

class CuadradoPresenter(private val vista: contratoCuadrado.Vista): contratoCuadrado.Presentador {

    private val modelo: contratoCuadrado.Modelo = CuadradoModelo();


    override fun area(lado: Float) {
        if(modelo.valida(lado) == true){
            val a = modelo.area(lado)
            vista.showArea(a)
        }else{
            vista.showError("Datos incorrectos")
        }
    }

    override fun perimetro(lado: Float) {
        if(modelo.valida(lado) == true){
            val p = modelo.perimetro(lado)
            vista.showPerimetro(p)
        }else{
            vista.showError("Datos incorrectos")
        }
    }
}