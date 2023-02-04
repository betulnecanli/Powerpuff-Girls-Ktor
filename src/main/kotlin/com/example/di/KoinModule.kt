package com.example.di

import com.example.repository.PPGRepository
import com.example.repository.PPGRepositoryImpl
import org.koin.dsl.module


val koinModule = module {
    single<PPGRepository>{
        PPGRepositoryImpl()
    }
}