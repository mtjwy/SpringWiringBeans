package com.lamaryw.spring.soundsystem;

import org.springframework.stereotype.Component;

/*
 * @Component annotation identifies this class as a component class
 * and serves as a clue to Spring that a bean should be created for the class.
 * 
 */
@Component
public class SgtPeppers implements CompactDisc, Scannable{
	
	private String title;
	private String artist;
	
	public void play() {
		System.out.println("Playing " + title + "by" + artist);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}
