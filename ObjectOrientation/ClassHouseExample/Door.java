class Door {
	boolean open = false;

	boolean isOpen(){
		return this.open;
	}

	void open(){
		this.open = true;
	}

	void close(){
		this.open = false;
	}
}
