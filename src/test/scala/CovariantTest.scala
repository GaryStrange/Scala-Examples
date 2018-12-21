import Covariant._

object CovariantTest extends App {
  val promotionPrice = new PromotionPrice
  val price = new Price

  val promotionEvent:Event[PromotionPrice] = new Event[PromotionPrice](promotionPrice)
  val priceEvent:Event[Price] = new Event[Price](price)

  val priceProcessor = new PriceProcessor(promotionEvent)
}
