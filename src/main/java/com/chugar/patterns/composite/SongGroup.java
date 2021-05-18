package com.chugar.patterns.composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

	private ArrayList<SongComponent> songList = new ArrayList<>();
	private String groupName;
	private String groupDesc;
	
	
	public SongGroup(String groupName, String groupDesc) {
		this.groupName = groupName;
		this.groupDesc = groupDesc;
	}


	public ArrayList<SongComponent> getSongList() {
		return songList;
	}


	public String getGroupName() {
		return groupName;
	}


	public String getGroupDesc() {
		return groupDesc;
	}


	@Override
	public void add(SongComponent songComponent) {
		this.songList.add(songComponent);
	}
	
	@Override
	public void remove(SongComponent songComponent) {
		this.songList.remove(songComponent);
	}
	
	@Override
	public void displaySongInfo() {
		
		System.out.println( getGroupName() + " contains :" );
		
		for (SongComponent song : this.songList) {
			song.displaySongInfo();
		}
	}
	
	
	
	
}
