package br.senai.sp.jandira.triproom.repository

import android.content.Context
import br.senai.sp.jandira.triproom.DAO.contatodb
import br.senai.sp.jandira.triproom.DAO.contatos
import br.senai.sp.jandira.triproom.model.contato

class contatoRepository(context: Context) {
    private val db = contatodb.getBancoDeDados().contatos()

    fun salvar(usuario: contatos):Long{
        return db.salvar(usuario)
    }

    fun buscarTodosOsUsuarios(): List<contatos>{
        return db.listarTodosOsUsuarios()
    }

    fun buscarUsuarioPeloEmailSenha(email:String, senha:String): Pair<Boolean, contato?>{
        val usuario = db.buscarUsuarioPeloEmailSenha(email,senha)
        return Pair(usuario != null, usuario)
    }

    fun buscarUsuarioPeloId(id: Long): contato{
        return db.buscarUsuarioPeloId(id)
    }
}
}