/*
 * The runnable target class. 
 * the one that has the run method
 * that must be overridden to
 * perform the race
 * 
 * The run() method contain a 100 mitre race
 * between the Hare and the Tortoise
 * 
 * The race is implemented using an iteration statement
 * that starts at 0 and ends at 100
 */
public class HareAndTortoiseRace implements Runnable {
	
	private String raceWinner;	
	
	public void race(){
		for(int distance=1; distance<=100; distance++){
			System.out.println(Thread.currentThread().getName()+ " has covered " + distance + " metres");
			if((distance==30)&& (Thread.currentThread().getName().equals("Hare"))){
				try{
					System.out.println("Hare going to sleep for a bit --ZZZZZZZZZZZZZZZZZZZ");
					Thread.sleep(10000);
					System.out.println("woken up - back in the race");
				}catch(InterruptedException interruptedException){
					interruptedException.printStackTrace();
				}
			}
			boolean raceWon = this.identifyWinner(distance);
			if (raceWon){
				 //break;
			}
		}
	}
	
	public boolean identifyWinner(int totalDistanceCovered){
		boolean raceStatus = false;
		 if((totalDistanceCovered ==100)&& (raceWinner==null)){
			 String winner = Thread.currentThread().getName();
			 	raceWinner=winner;
			 //Thread.currentThread();
			System.out.println("***********the race was won by " + raceWinner + " ****************" );
			System.out.println("***********************************************" );
			 raceStatus=true;
		 }
		 else if (raceWinner==null){
			 raceStatus=false;
		 }
		 else if (raceWinner!=null){
			 raceStatus=true;
		 }
	 return raceStatus;	
	}
	
	@Override
	public void run() {
			race();
		}

}
