package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Checkinout;

/***
 * 
 * @author arthurhmp
 *
 * suport class to other system
 */

public class ParkingUtil {
	/***
	 * license plate validation wuth standard LLL-NNN
	 * L= Letter
	 * N= Number
	 * @param licensePlate
	 * @return true to validated or false case it is out of standard 
	 */
	public static boolean validLicensePlate(String licensePlate) {
		String defaultlicense = "[A_Z][A_Z][A_Z]-\\d\\d\\d\\d";
		Pattern p = Pattern.compile(defaultlicense);
		Matcher m = p.matcher(licensePlate);
		return m.matches();
	}
	/***
	 *  calculate the amount to be charged based on the fees and set the time of entry/exit 
	 * 
	 * change the own instance 
	 * 
	 * @param checkinout instance Checkinout
	 */
	public void  paymentCalculate(Checkinout checkinout) {
		//TODO implement
	}
}
