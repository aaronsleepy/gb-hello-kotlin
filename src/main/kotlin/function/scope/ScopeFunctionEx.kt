package function.scope

data class Person(
    var name: String = "",
    var age: Int = 0,
    var temperature: Float = 36.5f
) {
    fun isSick(): Boolean = temperature > 37.5f
}



fun main() {
    /**
     * apply
     * - 수신 객체 내부 프로퍼티를 변경한 후, 수신 객체 자체를 반환
     * - 객체 생성시, 다양한 프로퍼티를 설정해야 하는 경우 사용
     */
    val person1 = Person().apply {
        name = "DevCho"
        age = 29
        temperature = 36.2f
    }

    // apply를 사용하지 않은 경우
    // person2를 여러번 사용, 가독성 떨어짐
    val person2 = Person()
    person2.name = "DevCho"
    person2.age = 29
    person2.temperature = 36.2f


    /**
     * run
     * - 수신 객체에 대해 특정 동작을 수행한 후, 결과값을 반환
     */
    val person3 = Person("DevCho", 29, 36.5f)
    val isPerson3Sick = person3.run {
        temperature = 37.2f
        isSick()
    }


    /**
     * with
     * - run과 동일, but 수신 객체를 파라미터로 받음
     */
    val person4 = Person("DevCho", 29, 36.5f)
    val isPerson4Sick = with(person4) {
        temperature = 37.2f
        isSick()
    }


    /**
     * let
     * - 수신 객체를 이용해 작업을 한후, 결과를 반환
     * - 아래의 경우에 사용
     *   - null check 후 코드를 싱행해야 하는 경우
     *   - nullable한 수신객체를 다른 타입의 변수로 변환해야 하는 경우
     * - 수신 객체가 nullable이 아나리면 run을 사용하는 것이 일반적
     */
    var person5: Person? = null
    val isPerson5Sick = person5?.let { it.isSick() }

    /**
     * also
     * - apply와 마찬가지로, 수신 객체 내부 프로퍼티를 변경한 후, 수신 객체 자체를 반환
     * - also는 객체에 대한 추가적인 작업(로깅, 유효성 검사 등)을 할 때 사용
     * - 프로퍼티 변경이 발생하는 경우에는 apply를 사용하자
     */
    val person6 = Person("DevCho", 29, 36.5f)
    val person7 = person6.also { it.age += 1 }
    println(person6.age)
    println(person7.age)
}

