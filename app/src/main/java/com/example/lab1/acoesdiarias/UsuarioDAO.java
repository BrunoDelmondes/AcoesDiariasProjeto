package com.example.lab1.acoesdiarias;

import java.util.List;


public class UsuarioDAO extends GenericDAO{

    @Override
    public boolean salvar(T t) {
        return false;
    }

    @Override
    public boolean salvar(Object o) {
        return false;
    }

    @Override
    public List<T> listar() {
        return null;
    }

    @Override
    public boolean excluir(int id) {
        return false;
    }

    @Override
    public boolean atualizar(Object o) {
        return false;
    }

    @Override
    public boolean atualizar(T t) {
        return false;
    }
}
