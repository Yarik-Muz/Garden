package garden;

import garden.colours.Colours;
import garden.plants.*;
import garden.plants.flowers.*;

public class GardenSimulator {

	private Garden garden;

	public GardenSimulator(int rows, int columns) {
		garden = new Garden(rows,columns);

	}

	//Utility method that adds a rose to the Garden
	//Returns true if it was successful
	public boolean addRose(int rowPosition, int columnPosition, String colour) {
		return garden.add(rowPosition, columnPosition, new Rose(colour));
	}

	//Add a plant of muguets to the given position
	public boolean addMuguets(int rowPosition, int columnPosition) {
		return garden.add(rowPosition, columnPosition, new Muguets(colour));
	}

	//Add a Sunflower to the given position
	public boolean addSunflower(int rowPosition, int columnPosition, String colour) {
		return garden.add(rowPosition, columnPosition, new SunFlower(colour));
	}

	//Add Cynodon to the given position
	public boolean addCynodon(int rowPosition, int columnPosition) {
		return garden.add(rowPosition, columnPosition, new Cynodon(colour));
	}

	//Add Dicondra to the given position
	public boolean addDicondra(int rowPosition, int columnPosition) {
		return garden.add(rowPosition, columnPosition, new Dicondra(colour));
	}

	//Add a Fir to the given position
	public boolean addFir(int rowPosition, int columnPosition) {
		return garden.add(rowPosition, columnPosition, new Fir(colour));
	}

	//Add a PeachTree to the given position
	public boolean addPeachTree(int rowPosition, int columnPosition) {
		return garden.add(rowPosition, columnPosition, new PeachTree(colour));
	}

	//Add a WalnutTree to the given position
	public boolean addWalnutTree(int rowPosition, int columnPosition) {
		return garden.add(rowPosition, columnPosition, new Walnut(colour));
	}

	//Add a CeramicTile to the given position
	public boolean addCeramicTile(int rowPosition, int columnPosition, boolean glossy) {
		return garden.add(rowPosition, columnPosition, new ceramic_tile(colour));
	}

	//Add a StoneTile to the given position
	public boolean addStoneTile(int rowPosition, int columnPosition, boolean glossy) {
		return garden.add(rowPosition, columnPosition, new stone_tile(colour));
	}

	//Display the names of the items
	public void displayNames() {
		garden.displayNames();
	}

	//Display the colours in the given season
	public void displayColours(int season) {
		garden.displayColours(season);
	}

	//Returns the amount of water consumed in a month
	public double consumedWater(int days) {
		return garden.consumedWater(days);
	}
	
	//Count the number of times a given ornament appears
	public int count(Ornament ornament) {
		return garden.count(ornament);
	}
	
	//Removes an item at the given position
	public void remove(int rowPosition, int columnPosition) {
		garden.remove(rowPosition, columnPosition);
	}

	public static void main(String[] args) {
		//The main method creates a predefined garden

		GardenSimulator simulator = new GardenSimulator(3,5);

		//the garder is populated using the methods provided by the simulator
		simulator.addRose(0, 1, Colours.VIOLET);

		simulator.addStoneTile(0, 2, false);

		simulator.addMuguets(0, 3);

		simulator.addSunflower(0, 4, Colours.PINK );
		
		simulator.addRose(0, 4, Colours.PINK );

		simulator.addWalnutTree(1, 0);

		simulator.addFir(1, 1);

		simulator.addStoneTile(1, 2, false);

		simulator.addPeachTree(1, 3);
		
		simulator.addFir(1, 4);
		
		simulator.remove(1, 4);

		simulator.addCynodon(1, 4);

		simulator.addDicondra(2, 0);

		simulator.addStoneTile(2, 1, true);

		simulator.addCeramicTile(2, 2, false);

		simulator.addCeramicTile(2, 3, true);



		//We display all the items
		System.out.println("Garden items:");
		simulator.displayNames();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Winter colours:");
		simulator.displayColours(0);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Spring colours:");
		simulator.displayColours(1);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Summer colours:");
		simulator.displayColours(2);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Autumn colours:");
		simulator.displayColours(3);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Unknown season:");
		simulator.displayColours(5);

		System.out.println();
		System.out.println();
		System.out.println();
		double consumedWaterInAYear = simulator.consumedWater(365);
		System.out.println("In a year, the garden will consume "+consumedWaterInAYear+" litres of water.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		StoneTile stoneTile = new StoneTile(false);
		int stoneTiles = simulator.count(stoneTile);
		System.out.println("The garden contains "+stoneTiles+" stone tiles.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		CeramicTile glossyCeramicTile = new CeramicTile(true);
		int glossyCeramicTiles = simulator.count(glossyCeramicTile);
		System.out.println("The garden contains "+glossyCeramicTiles+" glossy ceramic tile(s).");
		
		System.out.println();
		System.out.println();
		System.out.println();
		int firs = simulator.count(new Fir());
		System.out.println("The garden contains "+firs+" fir(s).");
	}

	

}



