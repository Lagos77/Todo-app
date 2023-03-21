package com.example.data.firebaseAuth

import com.example.domain.entity.firebaseAuth.FirebaseAuthRepository
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FirebaseAuthModule {

    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    fun providesFirebaseAuthRepository(firebaseAuth: FirebaseAuth): FirebaseAuthRepository {
        return  FirebaseAuthRepositoryImp(firebaseAuth)
    }
}