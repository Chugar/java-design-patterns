package com.chugar.patterns.composite;

import java.time.LocalDate;

public class Song extends SongComponent {
	
	private String songName;
	private String bandName;
	private LocalDate releasedDate;
	
	
	public Song(String songName, String bandName, LocalDate releasedDate) {
		this.songName = songName;
		this.bandName = bandName;
		this.releasedDate = releasedDate;
	}


	public String getSongName() {
		return songName;
	}


	public String getBandName() {
		return bandName;
	}


	public LocalDate getReleasedDate() {
		return releasedDate;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public void setBandName(String bandName) {
		this.bandName = bandName;
	}


	public void setReleasedDate(LocalDate releasedDate) {
		this.releasedDate = releasedDate;	
	}
	
	
	@Override
	public void displaySongInfo() {
		System.out.println("Song Info : " + songName + " by " + bandName + " in " + releasedDate);
	}
	
	

	
}
