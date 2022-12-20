package repositories.buyer

import aggregates.buyer.CardType
import aggregates.buyer.Condition
import aggregates.buyer.Vendor

class CardTypeRepositoryImpl : CardTypeRepository {
    override fun getCardTypesByBuyerId(buyerId: String): List<CardType> {
        //get card types from db or server
        return listOf(
            //mocks
            object : CardType {
                override val condition: Condition = Condition.PLASTIC
                override val vendor: Vendor = Vendor.MIR
            }
        )
    }
}