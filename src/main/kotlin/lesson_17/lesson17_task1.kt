package lesson_17

class QuizElement(questionInput: String, answerInput: String) {
    private var question = questionInput
        get() = field

    private var answer = answerInput
        get() = field
        set(value) {
            field = value
        }
}
