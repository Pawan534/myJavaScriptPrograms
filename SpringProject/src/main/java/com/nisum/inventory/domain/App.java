package com.nisum.inventory.domain;

import com.nisum.inventory.employeeManagement.Employee;
import com.nisum.inventory.order.OrderBOImpl;
import com.nisum.inventory.repository.dao.DatabaseDAO;
import com.nisum.inventory.repository.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;


public class App {

    private static Consumer<Category> categoryDetails = (product) -> System.out.println("Category Details -> " + product.getCategoryId() + " " + product.getCategoryName());
    private static Consumer<ProductCategory> productCategory = (product) -> System.out.println("Product Category Details -> " + product);
    private static Consumer<Product> prodNames = (product -> System.out.println("Product Names --> " +product.getProductName() + " : "));
    private static Consumer<Product> prodIds = (product -> System.out.println("Product Ids --> " +product.getProductId() + " : " ));
    private static Consumer<Product> prodPrices = (product -> System.out.println("Product Prices --> " +product.getProductPrice()));

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");



        System.out.println("\nCreating Beans with Collections");
        System.out.println("**********************************");
        ProductCategory productList = (ProductCategory) ctx.getBean("productCategory");
        List<Product> getAllProducts = productList.getProduct();
        categoryDetails.accept(productList.getCategory());
        productCategory.accept(productList);
        getAllProducts.forEach(prodIds.andThen(prodNames).andThen(prodPrices));


        //Db Connection

        DatabaseDAO databaseDAO = (DatabaseDAO) ctx.getBean("database");
        System.out.println(databaseDAO);


        //Invoking interface and has-a relationship
        OrderBOImpl orderBO = (OrderBOImpl) ctx.getBean("orderBOImpl");
        orderBO.placeOrder();

        //DB
//       JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
//       String sql = "insert into employee values(?,?,?)";
//       int res = jdbcTemplate.update(sql, 1, "John", "Alberto");

        //Calling EmployeeDAO and inserting data into Employee table
        EmployeeDao  employeeDao = (EmployeeDao) ctx.getBean("employeeDaoImpl");
//        Employee employee = new Employee();
//        employee.setEmployeeId(2);
//        employee.setFirstName("Ronald");
//        employee.setLastName("Bop");
//        int res = employeeDao.update(employee);
//        System.out.println("Data is saved in db " + res);

        System.out.println(employeeDao.read());

    }
}
