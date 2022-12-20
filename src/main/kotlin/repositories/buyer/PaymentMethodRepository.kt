package repositories.buyer

import aggregates.buyer.PaymentMethod

interface PaymentMethodRepository {
    fun getPaymentMethodsByBuyerId(buyerId: String): List<PaymentMethod>
}