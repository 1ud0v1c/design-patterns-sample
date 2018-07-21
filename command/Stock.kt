data class Stock(val name: String, val quantity: Int) {
	fun buy() {
		println("Stock (name: $name, quantity: $quantity) bought");
	}

	fun sell() {
      println("Stock (name: $name, quantity: $quantity) sold");
	}
}
