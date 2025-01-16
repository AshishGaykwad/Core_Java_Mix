package abstraction;


interface playble
{
	void play();
	void pause();
	void stop();
	default void showlyrics()
	{
		
	}
}

class musicPlayer implements playble
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play music");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause music");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop music");
		
	}
	
	void changeTrack()
	{
		System.out.println("change the track");
	}
	
}

class videoPlayer implements playble
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play video");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause video");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop video");
	}
	
	void fastForward()
	{
		System.out.println("video fast forward");
	}
	
}

public class player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		musicPlayer music = new musicPlayer();
		music.play();
		music.pause();
		music.stop();
		music.changeTrack();
		
		videoPlayer video = new videoPlayer();
		video.play();
		video.pause();
		video.stop();
		video.fastForward();
	}

}
