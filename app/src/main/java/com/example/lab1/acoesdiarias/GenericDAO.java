package com.example.lab1.acoesdiarias;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;


public abstract class GenericDAO<T> extends SQLiteOpenHelper {

    private static final String ProjetoAcoes = "ProjetoAcao";
    private static final int Projeto1 = 1;

    private SQLiteDatabase database;


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        database.execSQL("CREATE TABLE IF NOT EXISTS Lembrete(" +
                "descricaoLembrente INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Hora VARCHAR(45) NOT NULL," +
                "Local VARCHAR(45) NOT NULL," +
                ");");
        database.execSQL("CREATE TABLE IF NOT EXISTS Usuario(" +
                "Login INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Senha VARCHAR(45) NOT NULL," +
                ");");
        database.execSQL("CREATE TABLE IF NOT EXISTS Cadastro(" +
                "LoginC INTEGER PRIMARY KEY AUTOINCREMENT," +
                "SenhaC VARCHAR(45) NOT NULL," +
                ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public GenericDAO(Context context){
        super(context,ProjetoAcoes,null,Projeto1);
    }


    public abstract boolean salvar(T t);
    public abstract List<T> listar();
    public abstract boolean excluir(int id);
    public abstract boolean atualizar(T t);
}
