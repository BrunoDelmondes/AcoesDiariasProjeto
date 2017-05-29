package com.example.lab1.acoesdiarias;

import android.content.Context;

import java.util.List;


public class UsuarioDAO<Usuario> extends GenericDAO<Usuario>{

    public UsuarioDAO(Context context) {
        super(context);
    }
    @Override
    public boolean salvar(Usuario usuario) {return false;}
    @Override
    public List<Usuario> listar() {
        return null;
    }
    @Override
    public boolean excluir(int id) {
        return false;
    }
    @Override//aaa
    public boolean atualizar(Usuario usuario) {
        return false;
    }
}
