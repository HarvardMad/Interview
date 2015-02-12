
public class RaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HareAndTortoiseRace raceStart = new HareAndTortoiseRace();
		//HareAndTortoiseRace raceStart2 = new HareAndTortoiseRace();
		// using thread constructors with two arguments
		//runnable target and a name for each thread
		//both threads access the SAME block of code
		Thread hareThread = new Thread(raceStart,"Hare");
		Thread totoiseThread = new Thread(raceStart,"Tortoise");
		/*
		 
		Thread elephantThread = new Thread(raceStart,"Elephant");
		Thread lionThread = new Thread(raceStart,"Lion");
		Thread antilopeThread = new Thread(raceStart,"Antilope");
		Thread giraffeThread = new Thread(raceStart,"Giraffe");
		Thread monkeyThread = new Thread(raceStart,"Monkey");
		Thread cheetahThread = new Thread(raceStart,"Cheetah");
		*/
		
		hareThread.start();
		totoiseThread.start();
		/*
		elephantThread.start();
		lionThread.start();
		antilopeThread.start();
		giraffeThread.start();
		monkeyThread.start();
		cheetahThread.start();
		*/
		
		
		

	}

}
