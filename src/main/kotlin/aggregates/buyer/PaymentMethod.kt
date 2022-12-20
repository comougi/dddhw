package aggregates.buyer

interface PaymentMethod {
    val type: Type
    val method: Method
}

enum class Type {
    ONLINE, OFFLINE
}

enum class Method {
    CARD, CASH
}