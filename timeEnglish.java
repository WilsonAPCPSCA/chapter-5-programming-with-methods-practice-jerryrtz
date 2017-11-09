import java.util.Scanner;
public class timeEnglish {
		public static String getTimeName(int hours, int minutes)
		{
		String hoursAndMins = "";
		if (hours == 1) {hoursAndMins = "one";}
		if (hours == 2) {hoursAndMins = "two";}
		if (hours == 3) {hoursAndMins = "three";}
		if (hours == 4) {hoursAndMins = "four";}
		if (hours == 5) {hoursAndMins = "five";}
		if (hours == 6) {hoursAndMins = "six";}
		if (hours == 7) {hoursAndMins = "seven";}
		if (hours == 8) {hoursAndMins = "eight";}
		if (hours == 9) {hoursAndMins = "nine";}
		if (hours == 10) {hoursAndMins = "ten";}
		if (hours == 11) {hoursAndMins = "eleven";}
		if (hours == 12) {hoursAndMins = "twelve";}
		if (hours < 1 || hours > 12) {hoursAndMins = "Enter valid hour.";}
		if (minutes == 10) {hoursAndMins = "Ten minutes past " + hoursAndMins + ".";}
		if (minutes == 15) {hoursAndMins = "A quarter after " + hoursAndMins + ".";}
		if (minutes == 30) {hoursAndMins = "Half past " + hoursAndMins + ".";}
		if (minutes == 45) {hoursAndMins = "A quarter to " + (hours + 1) + ".";}
		if (minutes == 50) {hoursAndMins = "Ten minutes to " + (hours + 1) + ".";} 
		if (minutes == 00) {hoursAndMins = hoursAndMins + " o'clock.";}
		if (minutes < 0 || minutes > 59) {hoursAndMins = "Enter valid minute.";}
		return hoursAndMins;
		}
		public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter hours: ");
		int hours = in.nextInt();
		System.out.print("Enter minutes: ");
		int minutes = in.nextInt();

		System.out.print(getTimeName(hours, minutes));
		}
}
