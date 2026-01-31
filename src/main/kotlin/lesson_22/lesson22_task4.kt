package lesson_22

data class MainScreenState(val data: String = "", val isLoading: Boolean = false)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    fun loadData() {
        println("Initial state: $mainScreenState")
        println("Data is loading...")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("State while loading: $mainScreenState")

        println("Data is loaded")

        mainScreenState = mainScreenState.copy(data = "Loaded data", isLoading = false)
        println("State after data is loaded: $mainScreenState")
    }
}
