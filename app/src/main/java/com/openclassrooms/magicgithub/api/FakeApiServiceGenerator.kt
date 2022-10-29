package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://gravatar.com/avatar/44b5c61c88c2410b7aed46bf675e60a5?s=400&d=robohash&r=x"),
        User("002", "Paul", "https://gravatar.com/avatar/c170afe857c980914adc832e4bdc5fef?s=400&d=robohash&r=x"),
        User("003", "Phil", "https://gravatar.com/avatar/89a3228e5fc147bb0cd719b8a7e59be0?s=400&d=robohash&r=x"),
        User("004", "Guillaume", "https://gravatar.com/avatar/1db1b9613602a95a0f4dbbddc186f41e?s=400&d=robohash&r=x"),
        User("005", "Francis", "https://gravatar.com/avatar/488aacfa5166964ed76abb177d187d84?s=400&d=robohash&r=x"),
        User("006", "George", "https://gravatar.com/avatar/c5fa0c895bd8eb0b03cc6ce8b3c97320?s=400&d=robohash&r=x"),
        User("007", "Louis", "https://gravatar.com/avatar/09d8290fc6cc274ec81a33f08b8d2880?s=400&d=robohash&r=x"),
        User("008", "Mateo", "https://gravatar.com/avatar/c3ddff4b5f84c057702c28437f7b42cd?s=400&d=robohash&r=x"),
        User("009", "April", "https://gravatar.com/avatar/a809e7bb3b99af2912d781621c259c70?s=400&d=robohash&r=x"),
        User("010", "Louise", "https://gravatar.com/avatar/ab8c33d88a449ee6b79250b27d52ed53?s=400&d=robohash&r=x"),
        User("011", "Elodie", "https://gravatar.com/avatar/393dbcc1e36b1eb96b6c8cff8852cfdd?s=400&d=robohash&r=x"),
        User("012", "Helene", "https://gravatar.com/avatar/3b9fa93d0c319169ad0616141563bafe?s=400&d=robohash&r=x"),
        User("013", "Fanny", "https://gravatar.com/avatar/df733c514188007ade0035badb712df0?s=400&d=robohash&r=x"),
        User("014", "Laura", "https://gravatar.com/avatar/f9d423f7939e239f76876a28e7a99a06?s=400&d=robohash&r=x"),
        User("015", "Gertrude", "https://gravatar.com/avatar/cbfb800164df933e9e363f15b72d58d6?s=400&d=robohash&r=x"),
        User("016", "Chloé", "https://gravatar.com/avatar/2564b4efb14b22a74a7733d919c4cae4?s=400&d=robohash&r=x"),
        User("017", "April", "https://gravatar.com/avatar/cfcd8f892eb2a4fc3e8666984a081ec6?s=400&d=robohash&r=x"),
        User("018", "Marie", "https://gravatar.com/avatar/c6c76d5bee4937dcd26ee36b2923357d?s=400&d=robohash&r=x"),
        User("019", "Henri", "https://gravatar.com/avatar/c6688ea6294b2d931b9a962da3cf5afd?s=400&d=robohash&r=x"),
        User("020", "Rémi", "https://gravatar.com/avatar/9d095d8c818d7a52782a2f6eb90f498d?s=400&d=robohash&r=x")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://gravatar.com/avatar/457b806ee7b0fde01dbe8f17ed8f77cd?s=400&d=robohash&r=x"),
        User("022", "Geoffrey", "https://gravatar.com/avatar/57e81bca2551aee53697fac861edc3a0?s=400&d=robohash&r=x"),
        User("023", "Simon", "https://gravatar.com/avatar/c94ab3d2ca8990d6d28dfcb947c707d0?s=400&d=robohash&r=x"),
        User("024", "André", "https://gravatar.com/avatar/3f781dee81298d395080f18ac31d5043?s=400&d=robohash&r=x"),
        User("025", "Leopold", "https://gravatar.com/avatar/af5f0c82ca889b4c61d94119f51ad997?s=400&d=robohash&r=x")
    )
}