package aggregates.order

interface OrderStatus {
    val isPaid: Boolean
    val deliveryStatus: DeliveryStatus
}

enum class DeliveryStatus {
    ASSEMBLY, DELIVERY, DELIVERED
}