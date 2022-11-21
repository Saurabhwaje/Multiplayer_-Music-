package com.jspiders.multiplayer.operations;

import java.util.ArrayList;
import com.jspiders.multiplayer.songs.Songs;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SongOperations extends Thread {
	static Songs song;
	static int choice;

	public static List<Songs> playlist = new ArrayList();
	Scanner scanner = new Scanner(System.in);

	public void addSong() {
		System.out.println("How many songs do you want to add??");
		choice = scanner.nextInt();
		for (int i = 1; i <= choice; i++) {
			song = new Songs();

			System.out.println("Enter the id of the song :");
			int id = scanner.nextInt();
			playlist.add(song);
			song.setId(id);

			System.out.println("Enter the name of the song :");
			String setName = scanner.next();
			song.setSongName(setName);

			System.out.println("Who is the Singer..");
			String setSinger = scanner.next();
			song.setSinger(setSinger);

			System.out.println("What is the duration of the song..");
			double duration = scanner.nextDouble();
			song.setDuration(duration);

			System.out.println("Enter the album name...");
			String setAlbum = scanner.next();
			song.setMovie_album(setAlbum);

			System.out.println("Who written the song..");
			String setlyr = scanner.next();
			song.setLyricter(setlyr);

		}
		System.out.println(" added successfully");
	}

	public void displaySongs() {
		System.out.println();
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println(i + 1 + ". " + playlist.get(i).getSongName() + playlist.get(i).getId());
			System.out.println();
		}
	}

	public void removeSong() {
		System.out.println("which song do you want to delete");
		try {
			int choice = scanner.nextInt();
			playlist.remove(choice - 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("successfully deleted");
		System.out.println("Available songs");
		displaySongs();
	}

	public void playSong() {
		System.out.println(playlist.get(0) + " is Playing");
	}

	public void chooseSong() {
		displaySongs();
		System.out.println("Which song do you want to play");
		int choosesong = scanner.nextInt();
		System.out.println(playlist.get(choosesong) + " is Playing");
	}

	public void shuffleSong() {
		Collections.shuffle(playlist);
		System.out.println(playlist);
	}

	public void editSong() {
		displaySongs();
		System.out.println("Which song do you want to edit");
		choice = scanner.nextInt();
		playlist.get(choice - 1);
		for (Object obj : playlist) {

			System.out.println("Enter the id of the song :");
			int id = scanner.nextInt();
			song.setId(id);

			System.out.println("Enter the name of the song :");
			String setName = scanner.next();
			song.setSongName(setName);

			System.out.println("Who is the Singer..");
			String setSinger = scanner.next();
			song.setSinger(setSinger);

			System.out.println("What is the duration of the song..");
			double duration = scanner.nextDouble();
			song.setDuration(duration);

			System.out.println("Enter the album name...");
			String setAlbum = scanner.next();
			song.setMovie_album(setAlbum);

			System.out.println("Who written the song..");
			String setlyr = scanner.next();
			song.setLyricter(setlyr);

		}
		System.out.println("Edited successfully");
	}
}