class ContactBook: Container {
    val contacts: Array<Person> = arrayOf(
		Person("Roger", "Federer", 36), 
		Person("Rafael", "Nadal", 31), 
		Person("Novak", "Djokovic", 30)
	)

	override fun getIterator(): Iterator {
		return PersonIterator()
	}

	inner class PersonIterator: Iterator {
		private var index: Int = 0

		override fun hasNext(): Boolean {
			if (index < contacts.size) {
				return true
			}
			return false
		}

		override fun next(): Any? {
			if (hasNext()) {
				return contacts[index++]	
			}
			return null
		}
	}	
}
