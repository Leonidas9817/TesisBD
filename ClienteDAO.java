import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection conexion;
    private String url = "jdbc:mysql://localhost:3306/clientefacturarecibo_bd";
    private String usuario = "root";
    private String password = "123456";

    public ClienteDAO() {
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarCliente(cliente cliente) {
        String sql = "INSERT INTO clientes (IDCliente, nombre, domicilio, cuit) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, cliente.getIDCliente());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getDomicilio());
            statement.setString(4, cliente.getCuit());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCliente(int IDCliente) {
        String sql = "DELETE FROM clientes WHERE IDCliente = ?";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, IDCliente);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

