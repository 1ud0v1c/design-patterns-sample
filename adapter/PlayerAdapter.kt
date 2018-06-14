class PlayerAdapter(val videoPlayer: VideoPlayer): MediaPlayer {
    override fun play(filename: String) {
		videoPlayer.playVideo(filename)
    }
}
