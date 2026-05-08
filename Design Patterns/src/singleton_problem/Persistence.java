package singleton_problem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Persistence {
	
	private final String TABLE = "authentication";
	
	public Authentication getAuth(int id) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + TABLE + " WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            List<AuthenticationDTO> list = montarLista(rs);
            
            ps.close();
            conn.close();

            if (list.size() > 0) {
                AuthenticationDTO authDTO = list.get(0);
                
                Authentication auth = Authentication.getInstance();
                
                auth.setUsuario(authDTO.getUsuario());
                auth.setSenha(authDTO.getSenha());
                auth.setAnfitriao(authDTO.getAnfitriao());
                auth.setPorta(authDTO.getPorta());
                
                return auth;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}
	
	public List<AuthenticationDTO> montarLista(ResultSet rs) {
        List<AuthenticationDTO> listObj = new ArrayList<AuthenticationDTO>();
        try {
            while (rs.next()) {
            	AuthenticationDTO obj = new AuthenticationDTO(
            			rs.getString("usuario"),
            			rs.getString("senha"),
            			rs.getString("anfitriao"),
            			rs.getInt("porta")
            	);
            	
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
