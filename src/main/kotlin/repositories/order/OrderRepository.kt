package repositories.order

import aggregates.order.Order

interface OrderRepository {
    fun getOrderById(orderId: String): Order
}