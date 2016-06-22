class Date {
	private int day;
	private int month;
	private	int year;

	public Date(String date){
		this.setDate(date);
	}

	private void setDate(String date){
		String[] dateExploded = date.split("/");
		if (dateExploded.length != 3) {
			throw new IllegalArgumentException("Invalid date format.");
		}

		for (int i = 0; i < dateExploded.length; i++) {
			dateExploded[i] = dateExploded[i].replaceAll("[^\\d]", "");
			if (dateExploded[i].isEmpty()){
				throw new IllegalArgumentException("Invalid date format.");
			}
		}

		int day = Integer.parseInt(dateExploded[0]);
		int month = Integer.parseInt(dateExploded[1]);
		int year = Integer.parseInt(dateExploded[2]);

		if (String.valueOf(year).length() != 4) {
			throw new IllegalArgumentException("Invalid date year.");
		}

		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Invalid date month.");
		}

		if (day < 1 || day > 31) { 
                        throw new IllegalArgumentException("Invalid date day.");
                }

		boolean leapYear = false;

                if (year % 4 == 0 && (year % 100 != 0 ^ year % 400 == 0)) {
                        leapYear = true;
                }

		if (month == 2) {
			if (day > 29 || (day > 28 && !leapYear)) {
				throw new IllegalArgumentException("Invalid date day.");
			}
		}

		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			throw new IllegalArgumentException("Invalid date day.");
		}

		this.day = day;
		this.month = month;
		this.year = year;

	}

	String formated(){
		return String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + String.format("%02d", year);
	}
}
