package repositories.buyer

import aggregates.buyer.CardType

interface CardTypeRepository {
    fun getCardTypesByBuyerId(buyerId: String): List<CardType>
}