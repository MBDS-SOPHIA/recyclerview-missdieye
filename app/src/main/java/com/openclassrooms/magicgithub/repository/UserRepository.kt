package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.model.User

class UserRepository(
    private val apiService: ApiService
) {
    fun getUsers(): List<User> {
        return apiService.getUsers()
    }

    fun addRandomUser() {
         apiService.addRandomUser()
    }

    fun deleteUser(user: User) {
         apiService.deleteUser(user)
    }

    fun changeStatusToActive(user: User) {
        apiService.changeStatusToActive(user)
    }
    fun changeStatusToInactive(user: User) {
        apiService.changeStatusToInactive(user)
    }
}