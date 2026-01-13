package lesson_17

class QuizElement(private var question: String, private var answer: String) {
    val questionGetter: String
        get() = question

    var answerGetterSetter: String
        get() = answer
        set(value) {
            answer = value
        }
}