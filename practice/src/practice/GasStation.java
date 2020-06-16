package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class GasStation {
	
	public static void main(String[] args) {
		System.out.println("El menor indice es: " + lessIndexToCompleCircuit(new String[] {"4","3:1","2:2","1:2","0:1"}));
	}
	
	/**
	 * Gas Station Have the function GasStation(strArr) take strArr which will be an
	 * an array consisting of the following elements: N which will be the number of
	 * gas stations in a circular route and each subsequent element will be the
	 * string g:c where g is the amount of gas in gallons at that gas station and c
	 * will be the amount of gallons of gas needed to get to the following gas
	 * station. For example strArr may be: ["4","3:1","2:2","1:2","0:1"]. Your goal
	 * is to return the index of the starting gas station that will allow you to
	 * travel around the whole route once, otherwise return the string impossible.
	 * For the example above, there are 4 gas stations, and your program should
	 * return the string 1 because starting at station 1 you receive 3 gallons of
	 * gas and spend 1 getting to the next station. Then you have 2 gallons + 2 more
	 * at the next station and you spend 2 so you have 2 gallons when you get to the
	 * 3rd station. You then have 3 but you spend 2 getting to the final station,
	 * and at the final station you receive 0 gallons and you spend your final
	 * gallon getting to your starting point. Starting at any other gas station
	 * would make getting around the route impossible, so the answer is 1. If there
	 * are multiple gas stations that are possible to start at, return the smallest
	 * index (of the gas station). N will be >= 2.
	 * 
	 * Hard challenges are worth 15 points and you are not timed for them.
	 * 
	 * N which will be the number of
	 * gas stations in a circular route and each subsequent element will be the
	 * string g:c
	 * 
	 * ["4","3:1","2:2","1:2","0:1"]
	 * 
	 * {"4","0:1","2:2","1:2","3:1"}
	 * g:c 
	 * g -> is the amount of gas in gallons at that gas station
	 * c -> c will be the amount of gallons of gas needed to get to the following gas
	 * 		station
	 */
	
	public static String lessIndexToCompleCircuit(String[] strArr) {
		
		ArrayList<String> circuit = new ArrayList<String>(Arrays.asList(strArr));
		int numberOfStations = Integer.valueOf(circuit.get(0));
		circuit.remove(0);
		int totalGalonsInCar = 0;
		LinkedList<String> linkedCircuit = new LinkedList<String>(circuit);		
		int lessIndex = 1000;
		for(int i=0; i<numberOfStations ; i++) {
			int indexTemp = 0;
			totalGalonsInCar = 0;
			String circularGasStation = linkedCircuit.getFirst();
			for(String gasStation: linkedCircuit) {
				indexTemp = i + 1;
				String[] gasStationvalues = gasStation.split(":");
				int galonsInStation = Integer.valueOf(gasStationvalues[0]);
				int galonsToNextStation = Integer.valueOf(gasStationvalues[1]);
				totalGalonsInCar += galonsInStation;
				if(totalGalonsInCar < galonsToNextStation) {
					indexTemp = 0;
					break;
				}
				totalGalonsInCar -= galonsToNextStation;
			}
			if(indexTemp != 0 && indexTemp < lessIndex) {
				lessIndex = indexTemp;
			}
			linkedCircuit.addLast(circularGasStation);
			linkedCircuit.removeFirst();
		}
		
		if(lessIndex == 1000 ) {
			return "impossible";
		}
		return String.valueOf(lessIndex);
	}
}
