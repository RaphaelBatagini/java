class PhysicalPerson {
	private String name;
	private Document document;

	public PhysicalPerson(String document){
		this.document = new Document(document);
	}

	public void setName(String name){
		this.name = name;
	}

	public void show(){
		System.out.println("Physical person " + this.name + " has document number " + this.document.getDocumentNumber());
	}
}
