package lesson_17

class QuizElement(private var question: String = "What is the capital of France?",
                  private var answer: String = "Paris") {
    val questionGetter: String
        get() = question

    var answerGetterSetter: String
        get() = answer
        set(value) {
            answer = value
        }
}