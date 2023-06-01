package model;

/**
 * 
 * @author arthurhmp
 *
 *represent the informations about parking space 
 */
public class ParkingSpace {
	public static int totalParkingSpace = 100;
	private static int blockParkingSpace = 0;
	
	private ParkingSpace() {}
	
	/** 
	 *  check free parking space
	 *   
	 * @return true there is space or false case parking lot is full
	 */
	public static boolean freeParkingSpace() {
		//TODO implement method
		return false;
	}
	
	/***
	 * check how many parking space are frees
	 */
	public static void initializeParkingSapce() {
		//TODO implement  
	}
	
	/***
	 * returno how many parking space are blocks 
	 * @return number of total space blocks at time
	 */
	public static int lockParkingSpace() {
		return ParkingSpace.blockParkingSpace;
	}
	
	/***
	 * returno how many parking space are free 
	 * @return number of total space free at time
	 */
	public static int freeSpace() {
		return totalParkingSpace - ParkingSpace.blockParkingSpace;
	}
	
	/***
	 * update number of space  blocks after vehicle entry 
	 */
	public static void updateparkingspace() {
		ParkingSpace.blockParkingSpace ++;
	}
}
