fun main(args : Array<String>) { 
	var player: MediaPlayer = MP3Player()
	player.play("numb.mp3")

	player = PlayerAdapter(MP4Player())
	player.play("file.mp4")
}
