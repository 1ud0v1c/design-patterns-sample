fun main(args : Array<String>) { 
	val createdBook = Book.Builder()
			      .isbn("9780060850524")
			      .title("Brave new world")
	 		      .author("Aldous Huxley")
			      .description("Far in the future, the World Controllers have created the ideal society. Through clever use of genetic engineering, brainwashing and recreational sex and drugs, all its members are happy consumers. Bernard Marx seems alone harbouring an ill-defined longing to break free. A visit to one of the few remaining Savage Reservations, where the old, imperfect life still continues, may be the cure for his distress...")
   			      .image("http://t1.gstatic.com/images?q=tbn:ANd9GcSxG5karYbjK9reDzCP-xTdKmhw0CFS58AXDAXVb8B2Vd2jz_YH")
			      .pages(311)
			      .category("Science Fiction")
			      .publisher("Chatto & Windus")
			      .publisherDate("1932")
			      .build()
	println(createdBook)
}
