
public class TestaConexao {

	public static void main(String[] args) {
		
		try(Conexao conn = new Conexao()){
			conn.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		//--------------------------
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch(Exception ex) {
//			System.out.println("Deu erro na conexão");
//		}finally {
//			
//		}

	}

}
