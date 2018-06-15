fun main(args : Array<String>) { 
	val iterator = ContactBook().getIterator()
	while (iterator.hasNext()) {
		println(iterator.next())
	}
}
