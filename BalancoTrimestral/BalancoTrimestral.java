class BalancoTrimestral{
	public static void main(String[] args){
		//variables for each month
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Gasto trimestral = " + gastosTrimestre);

		int mediaMensal = gastosTrimestre / 3;
		System.out.println("Valor da média mensal = " + mediaMensal);
	}
}
