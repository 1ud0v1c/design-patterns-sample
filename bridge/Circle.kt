class Circle(color: Color): Shape(color) {
	override fun draw() {
		print("Draw circle with: ")
		color.applyColor()
		println()
	}
}
