data class SellStock(val stock: Stock): Order {
	override fun execute() {
		stock.sell()	
	}
}
