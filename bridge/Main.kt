fun main(args : Array<String>) { 
	var shape: Shape = Triangle(RedColor())
	shape.draw()
	shape = Circle(CyanColor())
	shape.draw()
}
