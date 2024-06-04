package br.senai.sp.jandira.triproom.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.senai.sp.jandira.triproom.model.contato

@Dao interface contatos {
    interface UsuarioDAO {

        @Insert
        fun salvar(usuario: contato): Long
        @Query("SELECT * FROM tbl_contato ORDER BY Nome ASC")
        fun listarTodosOsUsuarios(): List<contato>

        @Query("SELECT * FROM tbl_contato WHERE id = :id")
        fun buscarUsuarioPeloId(id:Long): contato

        @Query("SELECT * FROM tbl_contato WHERE Email = :email and senha = :senha")
        fun buscarUsuarioPeloEmailSenha(email: String, senha: String): contato?
    }
}