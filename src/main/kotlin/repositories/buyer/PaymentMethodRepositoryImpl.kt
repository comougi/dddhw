package repositories.buyer

import aggregates.buyer.Method
import aggregates.buyer.PaymentMethod
import aggregates.buyer.Type

class PaymentMethodRepositoryImpl : PaymentMethodRepository {
    override fun getPaymentMethodsByBuyerId(buyerId: String): List<PaymentMethod> {
        //get payment methods from db or server
        return listOf(
            //mocks
            object : PaymentMethod {
                override val type: Type = Type.OFFLINE
                override val method: Method = Method.CARD
            }
        )
    }
}