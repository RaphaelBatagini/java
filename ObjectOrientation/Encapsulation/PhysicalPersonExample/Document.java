class Document {
	private String documentNumber;

	public Document(String document){
		if (!this.isValid(document)) {
			throw new IllegalArgumentException("Invalid document number.");
		}

		this.documentNumber = document;
	}

	private boolean isValid(String document){
		//the validation doesn't matter to this example so I return true for every value
		return true;
	}

	public String getDocumentNumber(){
		return this.documentNumber;
	}
}
