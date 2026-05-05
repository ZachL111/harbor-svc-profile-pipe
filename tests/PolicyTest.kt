fun main() {
    val signalcase_1 = Signal(93, 77, 25, 5, 5)
    check(Policy.score(signalcase_1) == 138)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(65, 102, 22, 20, 9)
    check(Policy.score(signalcase_2) == 22)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(101, 84, 15, 21, 12)
    check(Policy.score(signalcase_3) == 103)
    check(Policy.classify(signalcase_3) == "review")
}
