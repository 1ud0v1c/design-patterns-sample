class Triangle(color: Color): Shape(color) {
	override fun draw() {
		print("Draw triangle with: ")
		color.applyColor()
		println()
	}
}
