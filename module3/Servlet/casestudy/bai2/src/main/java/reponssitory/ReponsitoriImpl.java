package reponssitory;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReponsitoriImpl implements ReponssitoryService{
    private static final String SELECT_ALL_PRODUCT = " select * from product inner join product_Category;";
    CreateConnection createConnection = new CreateConnection();
    @Override
    public List<Product> listProduct() {
        List<Product> productList = new ArrayList<>();
        Connection connection = createConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nameProduct = resultSet.getString("product_name");
                double price = resultSet.getDouble("price");
                int quantily = resultSet.getInt("quantily");
                String color = resultSet.getString("color");
                String rescription = resultSet.getString("description");
                String category = resultSet.getString("category");
                Product product = new Product(id,nameProduct,price,quantily,color,rescription,category);
                productList.add(product);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
