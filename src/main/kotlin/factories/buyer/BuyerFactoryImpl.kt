package factories.buyer

import aggregates.buyer.Buyer
import aggregates.buyer.BuyerRoot
import aggregates.buyer.CardType
import aggregates.buyer.PaymentMethod
import repositories.buyer.BuyerRepository
import repositories.buyer.CardTypeRepository
import repositories.buyer.PaymentMethodRepository

class BuyerFactoryImpl(
    private val buyerRepository: BuyerRepository,
    private val cardTypeRepository: CardTypeRepository,
    private val paymentMethodRepository: PaymentMethodRepository,
) : BuyerFactory {

    override fun createBuyer(buyerId: String): BuyerRoot {
        val buyer = buyerRepository.getBuyerById(buyerId)
        val cardTypes = cardTypeRepository.getCardTypesByBuyerId(buyerId)
        val paymentMethods = paymentMethodRepository.getPaymentMethodsByBuyerId(buyerId)
        return object : BuyerRoot {
            override val buyer: Buyer = buyer
            override val cardTypes: List<CardType> = cardTypes
            override val paymentMethods: List<PaymentMethod> = paymentMethods
        }
    }
}