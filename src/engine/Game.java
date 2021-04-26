package engine;

import java.io.IOException;
import java.util.ArrayList;

public class Game {
	Player player;
	ArrayList<City> availableCities;
	ArrayList<Distance> distances;
	final int maxTurnCount = 30;
	int currentTurncount;
	public Game(String playerName, String playerCity) throws IOException {
	player = new Player(playerName);
	City city = new City(playerCity);
	availableCities.add(city);
	}
	
	public void loadArmy(String cityName, String path) throws IOException {
		//LOGIC TO LOAD THE ARMY
	}
	
	private void loadCitiesAndDistances() throws IOException {
		
	}
}
