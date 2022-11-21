package com.jspiders.multiplayer.songs;

public class Songs {
	private int id;
	private String songName;
	private String singer;
	private double duration;
	private String movie_album;
	private String lyricter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getMovie_album() {
		return movie_album;
	}

	public void setMovie_album(String movie_album) {
		this.movie_album = movie_album;
	}

	public String getLyricter() {
		return lyricter;
	}

	public void setLyricter(String lyricter) {
		this.lyricter = lyricter;
	}
}
