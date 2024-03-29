package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User

class FakeApiService : ApiService {
    private val _users = FakeApiServiceGenerator.FAKE_USERS
    private val _fakeUsers = FakeApiServiceGenerator.FAKE_USERS_RANDOM

    /**
     * Return a list of [User]
     * Those users must be generated by [FakeApiServiceGenerator]
     */
    override fun getUsers(): List<User> {
        return _users
    }

    /**
     * Generate a random [User] and add it [FakeApiService.users] list.
     * This user must be get from the [FakeApiServiceGenerator.FAKE_USERS_RANDOM] list.
     */
    override fun addRandomUser() {
        _users.add(_fakeUsers.random())
    }

    /**
     * Delete a [User] from the [FakeApiService.users] list.
     */
    override fun deleteUser(user: User) {
        _users.remove(user)
    }
    override fun changeStatusToInactive(user: User) {
        user.active = false
    }
    override fun changeStatusToActive(user: User) {
        user.active = true
    }
}