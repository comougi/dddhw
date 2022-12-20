package repositories.order

import aggregates.order.Address

interface AddressRepository {
    fun getAddressesByOrderId(orderId: String): List<Address>
}