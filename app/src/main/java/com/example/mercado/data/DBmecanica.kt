package com.example.mercado.data

import com.example.mercado.model.Mecanica

class DBmecanica {
    fun carregaLoja(): List<Mecanica> {
        return listOf<Mecanica>(
            Mecanica("Chave de Fenda", modelo = "Vonder"),
            Mecanica("Ferramenta1", modelo = "Vonder"),
            Mecanica("Ferramenta2", modelo = "Vonder"),
            Mecanica("Ferramenta3", modelo = "Vonder"),
            Mecanica("Ferramenta4", modelo = "Vonder"),
            Mecanica("Ferramenta5", modelo = "Vonder"),
            Mecanica("Ferramenta6", modelo = "Vonder"),
            Mecanica("Ferramenta7", modelo = "Vonder"),
            Mecanica("Ferramenta8", modelo = "Vonder"),
            Mecanica("Ferramenta9", modelo = "Vonder"),
        )
    }
}