class Test{
	public static void main(String[] args){
		House house = new House();
		house.paintHouse("blue");
	
		Door door1 = new Door();
		Door door2 = new Door();
		Door door3 = new Door();

		house.addDoor(door1);
		house.addDoor(door2);
		house.addDoor(door3);

		house.doors[0].open();
		house.doors[1].close();
		house.doors[2].open();

		System.out.println("The color of your house is " + house.color);
		System.out.println("There is/are " + house.countOpenDoors() + " open door(s) in your house");
		System.out.println("There is/are " + house.countDoors() + " door(s) in your house");
	}
}
