package repositories.order

import aggregates.order.Address

class AddressRepositoryImpl : AddressRepository {
    override fun getAddressesByOrderId(orderId: String): List<Address> {
        //get addresses from db or server
        return listOf(
            //mocks
            object : Address {
                override val city: String = "Moscow"
                override val street: String = "Obraztsova"
                override val recipient: String = "Oleg"
            }
        )
    }
}