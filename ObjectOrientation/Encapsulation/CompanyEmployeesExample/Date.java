class Date {
	private int day;
	private int month;
	private	int year;

	public Date(String date){
		this.setDate(date);
	}

	private void setDate(String date){
		String[] dateExploded = date.split("/");
		
		//check if date has day, month and year
		if (dateExploded.length != 3) {
			throw new IllegalArgumentException("Invalid date format.");
		}
		
		//check for NaN values
		for (int i = 0; i < dateExploded.length; i++) {
			dateExploded[i] = dateExploded[i].replaceAll("[^\\d]", "");
			if (dateExploded[i].isEmpty()){
				throw new IllegalArgumentException("Invalid date format.");
			}
		}

		//convert to integer
		int day = Integer.parseInt(dateExploded[0]);
		int month = Integer.parseInt(dateExploded[1]);
		int year = Integer.parseInt(dateExploded[2]);

		//check if year have 4 digits
		if (String.valueOf(year).length() != 4) {
			throw new IllegalArgumentException("Invalid date year.");
		}
		
		//check if is a valid month
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Invalid date month.");
		}

		//check if is a valid day
		if (day < 1 || day > 31) { 
                        throw new IllegalArgumentException("Invalid date day.");
                }

		boolean leapYear = false;
		//test if year is a leap year
                if (year % 4 == 0 && (year % 100 != 0 ^ year % 400 == 0)) {
                        leapYear = true;
                }
		
		//validate february according to year or leap year
		if (month == 2) {
			if (day > 29 || (day > 28 && !leapYear)) {
				throw new IllegalArgumentException("Invalid date day.");
			}
		}
		
		//validate months that must have only thirty days
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			throw new IllegalArgumentException("Invalid date day.");
		}

		//set date
		this.day = day;
		this.month = month;
		this.year = year;

	}

	//return formated date
	String formated(){
		return String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + String.format("%02d", year);
	}
}
