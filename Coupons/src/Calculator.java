import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

	private static int starter = 0;
	private static int initializer = 0;
	private static LocalDate datum1 = LocalDate.of(2022, 04, 06);
	private static int lvl;
	private static long cycle = 0;
	private static String selection1 = null;

	static ArrayList<City> cityList = new ArrayList<City>();
	private static int[] first_camp = new int[300];
	private static int[] second_camp = new int[300];
	private static int[] third_camp = new int[300];

	public static String couponizer(String selection, String location, int level) {
		cityList.clear();
		cities();
		String city = "";
		String cruiser = null;
		lvl = level;
		selection1 = selection;

		if (location.equalsIgnoreCase("North Europe"))
			initializer = 1;
		else if (location.equalsIgnoreCase("America"))
			initializer = 2;
		else if (location.equalsIgnoreCase("Eurasia"))
			initializer = 3;
		else
			initializer = 0;

		
		LocalDate datum2 = LocalDate.now();
		cycle = ChronoUnit.DAYS.between(datum1, datum2);
		camper(cycle);
		city = citykid();

		return city;
	}

	private static String citykid() {
		String city = "";

		for (City city2 : cityList) {
			if (city2.getLevel() == lvl) {
				if (selection1.equalsIgnoreCase("Vanguard")) {
					if (initializer == 0) {
						if (starter == city2.getCycle()) {
							city += city2.getName() + "\n";
						}
					} else if (initializer == 1) {
						if (city2.getContinent().equalsIgnoreCase("North Europe")) {
							if (starter == city2.getCycle()) {
								city += city2.getName() + "\n";
							}
						}
					} else if (initializer == 2) {
						if (city2.getContinent().equalsIgnoreCase("America")) {
							if (starter == city2.getCycle()) {
								city += city2.getName() + "\n";
							}
						}
					} else if (initializer == 3) {
						if (city2.getContinent().equalsIgnoreCase("Eurasia"))
							if (starter == city2.getCycle()) {
								city += city2.getName() + "\n";
							}
					}
				}

				else if (selection1.equalsIgnoreCase("Liberty")) {

					if (initializer == 0) {
						if (starter == 1) {
							if (city2.getCycle() == 2) {
								city += city2.getName() + "\n";
							}
						}
						if (starter == 2) {
							if (city2.getCycle() == 3) {
								city += city2.getName() + "\n";
							}
						}
						if (starter == 3) {
							if (city2.getCycle() == 1) {
								city += city2.getName() + "\n";
							}
						}
					} else if (initializer == 1) {
						if (city2.getContinent().equalsIgnoreCase("North Europe")) {
							if (starter == 1) {
								if (city2.getCycle() == 2) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 2) {
								if (city2.getCycle() == 3) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 3) {
								if (city2.getCycle() == 1) {
									city += city2.getName() + "\n";
								}
							}
						}
					} else if (initializer == 2) {
						if (city2.getContinent().equalsIgnoreCase("America")) {
							if (starter == 1) {
								if (city2.getCycle() == 2) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 2) {
								if (city2.getCycle() == 3) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 3) {
								if (city2.getCycle() == 1) {
									city += city2.getName() + "\n";
								}
							}
						}
					} else if (initializer == 3) {
						if (city2.getContinent().equalsIgnoreCase("Eurasia")) {
							if (starter == 1) {
								if (city2.getCycle() == 2) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 2) {
								if (city2.getCycle() == 3) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 3) {
								if (city2.getCycle() == 1) {
									city += city2.getName() + "\n";
								}
							}
						} 
					}
				}

				else if (selection1.equalsIgnoreCase("Martyr")) {

					if (initializer == 0) {
						if (starter == 1) {
							if (city2.getCycle() == 3) {
								city += city2.getName() + "\n";
							}
						}
						if (starter == 2) {
							if (city2.getCycle() == 1) {
								city += city2.getName() + "\n";
							}
						}
						if (starter == 3) {
							if (city2.getCycle() == 2) {
								city += city2.getName() + "\n";
							}
						}

					} else if (initializer == 1) {
						if (city2.getContinent().equalsIgnoreCase("North Europe")) {
							if (starter == 1) {
								if (city2.getCycle() == 3) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 2) {
								if (city2.getCycle() == 1) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 3) {
								if (city2.getCycle() == 2) {
									city += city2.getName() + "\n";
								}
							}
						}
					} else if (initializer == 2) {
						if (city2.getContinent().equalsIgnoreCase("America")) {
							if (starter == 1) {
								if (city2.getCycle() == 3) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 2) {
								if (city2.getCycle() == 1) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 3) {
								if (city2.getCycle() == 2) {
									city += city2.getName() + "\n";
								}
							}
						}
					} else if (initializer == 3) {
						if (city2.getContinent().equalsIgnoreCase("Eurasia")) {
							if (starter == 1) {
								if (city2.getCycle() == 3) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 2) {
								if (city2.getCycle() == 1) {
									city += city2.getName() + "\n";
								}
							}
							if (starter == 3) {
								if (city2.getCycle() == 2) {
									city += city2.getName() + "\n";
								}
							}
						}
					} 
				} else
					city += "Pick a camp dude.";

			}
		}
		return city;

	}

	private static int camper(long diff) {
		first_camp[0] = 0;
		second_camp[0] = 1;
		third_camp[0] = 2;

		for (int i = 1; i < first_camp.length; i++) {
			first_camp[i] = first_camp[i - 1] + 3;
			second_camp[i] = second_camp[i - 1] + 3;
			third_camp[i] = third_camp[i - 1] + 3;
		}

		for (int i : first_camp) {
			if (i == diff) {
				starter = 1;
			}
		}

		for (int i : second_camp) {
			if (i == diff) {
				starter = 2;
			}
		}

		for (int i : third_camp) {
			if (diff == i) {
				starter = 3;
			}
		}
		return starter;
	}

	private static void cities() {
		// Level 3
		cityList.add(new City("North Europe", "Vienna", 2, 3));
		cityList.add(new City("North Europe", "Copenhagen", 2, 3));
		cityList.add(new City("North Europe", "Brussels", 2, 3));
		cityList.add(new City("North Europe", "Geneva", 2, 3));
		cityList.add(new City("North Europe", "Birmingham", 2, 3));
		cityList.add(new City("North Europe", "Edinburgh", 2, 3));

		cityList.add(new City("America", "Washington", 2, 3));
		cityList.add(new City("America", "Detroit", 2, 3));
		cityList.add(new City("America", "Atlanta", 2, 3));
		cityList.add(new City("America", "Houston", 2, 3));
		cityList.add(new City("America", "Seattle", 2, 3));
		cityList.add(new City("America", "Los Angeles", 3, 3));

		cityList.add(new City("America", "Mexico City", 1, 3));
		cityList.add(new City("America", "Sao Paulo", 1, 3));

		cityList.add(new City("Eurasia", "Madrid", 2, 3));
		cityList.add(new City("Eurasia", "Naples", 1, 3));
		cityList.add(new City("Eurasia", "Cairo", 1, 3));
		cityList.add(new City("Eurasia", "Ankara", 3, 3));
		cityList.add(new City("Eurasia", "Stalingrad", 1, 3));
		cityList.add(new City("Eurasia", "Leningrad", 1, 3));

		// Level 2
		cityList.add(new City("North Europe", "Riga", 2, 2));
		cityList.add(new City("North Europe", "Warsaw", 2, 2));
		cityList.add(new City("North Europe", "Budapest", 2, 2));
		cityList.add(new City("North Europe", "Hamburg", 2, 2));
		cityList.add(new City("North Europe", "Amsterdam", 2, 2));
		cityList.add(new City("North Europe", "Zurich", 2, 2));
		cityList.add(new City("North Europe", "Marseille", 2, 2));
		cityList.add(new City("North Europe", "Orleans", 2, 2));
		cityList.add(new City("North Europe", "Bristol", 2, 2));
		cityList.add(new City("North Europe", "Manchester", 2, 2));
		cityList.add(new City("North Europe", "Oslo", 2, 2));
		cityList.add(new City("North Europe", "Glasgow", 2, 2));

		cityList.add(new City("America", "Boston", 2, 2));
		cityList.add(new City("America", "Richmond", 2, 2));
		cityList.add(new City("America", "Cincinnati", 2, 2));
		cityList.add(new City("America", "St.Louis", 2, 2));
		cityList.add(new City("America", "Jacksonville", 2, 2));
		cityList.add(new City("America", "New Orleans", 2, 2));
		cityList.add(new City("America", "Dallas", 2, 2));
		cityList.add(new City("America", "Denver", 3, 2));
		cityList.add(new City("America", "Salt Lake City", 3, 2));
		cityList.add(new City("America", "Vancouver", 3, 2));
		cityList.add(new City("America", "Portland", 3, 2));
		cityList.add(new City("America", "Las Vegas", 1, 2));
		cityList.add(new City("America", "Panama City", 1, 2));
		cityList.add(new City("America", "Caracas", 2, 2));
		cityList.add(new City("America", "Fortaleza", 2, 2));
		cityList.add(new City("America", "Recife", 2, 2));

		cityList.add(new City("Eurasia", "Barcelona", 1, 2));
		cityList.add(new City("Eurasia", "Genoa", 1, 2));
		cityList.add(new City("Eurasia", "Tunis", 1, 2));
		cityList.add(new City("Eurasia", "Athens", 3, 2));
		cityList.add(new City("Eurasia", "Alexandria", 3, 2));
		cityList.add(new City("Eurasia", "Damascus", 1, 2));
		cityList.add(new City("Eurasia", "Tehran", 1, 2));
		cityList.add(new City("Eurasia", "Sevastopol", 1, 2));
		cityList.add(new City("Eurasia", "Kharkiv", 3, 2));
		cityList.add(new City("Eurasia", "Kiev", 3, 2));
		cityList.add(new City("Eurasia", "Minsk", 3, 2));

		// Level 1
		cityList.add(new City("North Europe", "All", 3, 1));

		cityList.add(new City("America", "Philadeplhia", 3, 1));
		cityList.add(new City("America", "Quebec", 3, 1));
		cityList.add(new City("America", "Pittsburgh", 3, 1));
		cityList.add(new City("America", "Toronto", 3, 1));
		cityList.add(new City("America", "Charleston", 3, 1));
		cityList.add(new City("America", "Columbia", 3, 1));
		cityList.add(new City("America", "Kansas City", 3, 1));
		cityList.add(new City("America", "Springfield", 3, 1));
		cityList.add(new City("America", "Memphis", 3, 1));
		cityList.add(new City("America", "Nashville", 3, 1));
		cityList.add(new City("America", "Miami", 3, 1));
		cityList.add(new City("America", "Montgomery", 3, 1));
		cityList.add(new City("America", "Oklahoma City", 1, 1));
		cityList.add(new City("America", "San Antonio", 1, 1));
		cityList.add(new City("America", "El Paso", 1, 1));
		cityList.add(new City("America", "Albuquerque", 1, 1));
		cityList.add(new City("America", "Boise", 1, 1));
		cityList.add(new City("America", "Billings", 1, 1));
		cityList.add(new City("America", "Calgary", 2, 1));
		cityList.add(new City("America", "Edmonton", 2, 1));
		cityList.add(new City("America", "Victoria", 2, 1));
		cityList.add(new City("America", "Sacramento", 2, 1));
		cityList.add(new City("America", "Phoenix", 2, 1));
		cityList.add(new City("America", "San Diego", 2, 1));
		cityList.add(new City("America", "San Jose", 1, 1));
		cityList.add(new City("America", "Lima", 1, 1));
		cityList.add(new City("America", "Merida", 1, 1));
		cityList.add(new City("America", "Havana", 1, 1));
		cityList.add(new City("America", "Belém", 1, 1));
		cityList.add(new City("America", "Salvador", 1, 1));
		cityList.add(new City("America", "Porto Alegre", 2, 1));
		cityList.add(new City("America", "Buenos Aires", 2, 1));

		cityList.add(new City("Eurasia", "Bilbao", 2, 1));
		cityList.add(new City("Eurasia", "Lisbon", 2, 1));
		cityList.add(new City("Eurasia", "Florence", 2, 1));
		cityList.add(new City("Eurasia", "Turin", 2, 1));
		cityList.add(new City("Eurasia", "Catania", 1, 1));
		cityList.add(new City("Eurasia", "Tripoli", 1, 1));
		cityList.add(new City("Eurasia", "Srajevo", 1, 1));
		cityList.add(new City("Eurasia", "Thessaloniki", 1, 1));
		cityList.add(new City("Eurasia", "Antalya", 1, 1));
		cityList.add(new City("Eurasia", "Benghazi", 1, 1));
		cityList.add(new City("Eurasia", "Port Sudan", 2, 1));
		cityList.add(new City("Eurasia", "Basra", 2, 1));
		cityList.add(new City("Eurasia", "Baghdad", 2, 1));
		cityList.add(new City("Eurasia", "Erbil", 2, 1));
		cityList.add(new City("Eurasia", "Baku", 2, 1));
		cityList.add(new City("Eurasia", "Tbilisi", 3, 1));
		cityList.add(new City("Eurasia", "Odessa", 1, 1));
		cityList.add(new City("Eurasia", "Rostov", 1, 1));
		cityList.add(new City("Eurasia", "Voronezh", 1, 1));
		cityList.add(new City("Eurasia", "Kursk", 1, 1));
		cityList.add(new City("Eurasia", "Bryansk", 1, 1));
		cityList.add(new City("Eurasia", "Lviv", 1, 1));
		cityList.add(new City("Eurasia", "Vilnius", 2, 1));
		cityList.add(new City("Eurasia", "Smolensk", 2, 1));

	}
}
