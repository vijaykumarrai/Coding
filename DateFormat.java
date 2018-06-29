import java.util.HashMap;



public class DatePrint {


	public static HashMap<String, String> monthMap = new HashMap<String, String>();


	static {


		monthMap.put("Jan", "01");


		monthMap.put("Feb", "02");


		monthMap.put("Mar", "03");


		monthMap.put("Apr", "04");


		monthMap.put("May", "05");


		monthMap.put("Jun", "06");


		monthMap.put("Jul", "07");


		monthMap.put("Aug", "08");


		monthMap.put("Sep", "09");


		monthMap.put("Oct", "10");


		monthMap.put("Nov", "11");


		monthMap.put("Dec", "12");


	}



	public static void main(String[] args) {


		String[] dates = { "20th Oct 2015", "4th Nov 2030" };



		String[] r = convertDates(10, dates);


		for (String r1 : r) {


			System.out.println(r1);


		}


	}



	private static String[] convertDates(int counter, String[] dates) {


		String[] newDates = new String[dates.length];


		int i = 0;


		for (String date : dates) {


			String[] dateFields = date.split(" ");


			String dayValue = dateFields[0];


			dayValue = dayValue.substring(0, dayValue.length() - 2);


			dayValue = dayValue.length() < 2 ? "0" + dayValue : dayValue;


			String result = dateFields[2] + "-" + monthMap.get(dateFields[1]) + "-" + dayValue;


			newDates[i] = result;


			i++;



			System.out.println(result);


		}


		return newDates;



	}


}
