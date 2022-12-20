package aggregates.buyer

interface CardType {
    val condition: Condition
    val vendor: Vendor

}

enum class Condition {
    PLASTIC, VIRTUAL
}

enum class Vendor {
    VISA, MASTERCARD, UNIONPAY, MIR
}
