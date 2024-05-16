package org.example.repository.impl;

import org.example.entity.Good;
import org.example.repository.GoodRepository;

import java.util.List;

public class RepositoryGoodImpl implements GoodRepository {
    Good borodinsky= new Good("Хлеб 'Бородинский'","Ржаной, 0,5кг", 1.56);
    Good timkovsky= new Good("Батон 'Тимковский'","Пшеничный(нар), 0,45кг", 2.16);
    Good baltic= new Good("Хлеб 'Прибалтийский'","Нарезной, 0,9кг", 2.79);
    Good timkovskyHalf= new Good("Батон 'Тимковский'","Пшеничный(нар), 0,225кг", 1.12);
    Good dzvinsk= new Good("Хлеб 'Дзвінскій'",", 0,5кг", 1.89);
    @Override
    public List<Good> getAllGood() {
        return List.of(borodinsky, timkovsky,baltic,timkovskyHalf,dzvinsk);
    }
}
