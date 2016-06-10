class Date {
	int day;
	int month;
	int year;

	String formated(){
		return String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + String.format("%02d", year);
	}
}
