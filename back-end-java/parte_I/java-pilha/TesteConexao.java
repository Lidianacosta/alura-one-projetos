public class TesteConexao {
    
    public static void main(String[] args){


        try (Conexao con = new Conexao()){
            con.leDados();
            //con.close();
        } 
        //catch(IllegalStateException e) {
          //  System.out.println("erro na conexão");
      //  } finally {
      //      con.close();
       // }
    }
}
