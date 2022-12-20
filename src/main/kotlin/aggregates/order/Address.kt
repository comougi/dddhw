package aggregates.order

interface Address {
    val city: String
    val street: String
    val recipient: String
}