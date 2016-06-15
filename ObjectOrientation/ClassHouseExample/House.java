class House{
	String color = "white";
	Door[] doors = new Door[10];

	void paintHouse(String color){
		this.color = color;
	}

	int countDoors(){
		int count = 0;

		for (Door d : this.doors) {
			if(d != null) {
				count++;
			}
		}

		return count;
	}

	int countOpenDoors(){
		int count = 0;

		for (Door d : this.doors) {
			if (d != null && d.isOpen()) {
				count++;
			}
		}

		return count;
	}

	void addDoor(Door door){
		boolean noSpace = true;
		for (int i = 0; i < this.doors.length; i++) {
			if (this.doors[i] == null) {
				this.doors[i] = door;
				noSpace = false;
				break;
			}
		}

		if (noSpace) {
			Door[] doors = new Door[this.doors.length + 10];
			doors[this.doors.length + 1] = door;
			this.doors = doors;
		}
	}
}
