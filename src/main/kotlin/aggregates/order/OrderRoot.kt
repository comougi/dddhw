package aggregates.order

interface OrderRoot {
    val order: Order
    val items: List<Item>
    val orderStatuses: List<OrderStatus>
    val addresses: List<Address>
}