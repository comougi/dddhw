package factories.order

import aggregates.order.OrderRoot

interface OrderFactory {
    fun createOrder(orderId: String): OrderRoot
}