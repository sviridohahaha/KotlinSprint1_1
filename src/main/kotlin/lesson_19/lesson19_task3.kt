package lesson_19

enum class Spaceship() {
    TAKE_OFF {
        override fun action() {
            println("Spaceship is taking off")
        }
    },
    LAND {
        override fun action() {
            //TODO: Добавить логику для приземления
        }
    },
    SHOOT {
        override fun action() {
            TODO("Not yet implemented")
        }
    };

    abstract fun action()
}
