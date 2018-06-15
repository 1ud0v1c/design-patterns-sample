/**
 * This sample is only for educational purpose, it's not really necssary in Kotlin to create this type of pattern. Indeed, Kotlin affords us the convenience of named arguments and default values. Therefore
 * you must create builders only if it's really necessary, as you can see, ading a builder class means you now have to remember to update two places when adding a field. It should only be added if you 
 * have to use Kotlin from the Java side, for example. 
 */
data class Book private constructor (var isbn: String, 
				     var title: String,
				     var author: String,
				     var description: String,
				     var image: String?,
				     var pages: Int,
				     var category: String,
				     var publisher: String,
				     var publisherDate: String) {
    class Builder {
        private lateinit var isbn: String
        private var title: String = ""
        private var author: String = ""
        private var description: String = ""
        private var image: String = ""
        private var pages: Int = 0
        private var category: String = "Unknown"
        private var publisher: String = ""
        private var publisherDate: String = ""

        fun isbn(isbn: String) = apply { 
		this.isbn = isbn 
	}

        fun title(title: String) = apply { 
		this.title = title 
	}

        fun author(author: String) = apply { 
		this.author = author 
	}

        fun description(description: String) = apply { 
		this.description = description
	}

        fun image(image: String) = apply { 
		this.image = image 
	}

        fun pages(pages: Int) = apply { 
		this.pages = pages 
	}

        fun category(category: String) = apply { 
		this.category = category 
	}

        fun publisher(publisher: String) = apply { 
		this.publisher = publisher 
	}

        fun publisherDate(publisherDate: String) = apply { 
		this.publisherDate = publisherDate 
	}

        fun build() = Book(isbn, title,
			   author, description,
			   image, pages,
			   category, publisher,
			   publisherDate
        )
    }
}

