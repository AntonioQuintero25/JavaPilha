
public class FluxoComTratamento {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
    	try {
        	metodo2();
		}catch(ArithmeticException | MinhaExcecao e){
			String msg = e.getMessage();
			System.out.println("ArithmeticException " + msg);
			e.printStackTrace();
		}catch(NullPointerException ex){
			//Podemos criar mais de um catch para tratar varias exceções
			String msg = ex.getMessage();
			System.out.println("ArithmeticException " + msg);
			ex.printStackTrace();
		}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        //ArithmeticException exeception = new ArithmeticException("Deu Errado");
        throw new MinhaExcecao("Deu Errado");
        //throw exeception;
        //System.out.println("Fim do metodo2");
    }
}
