package br.com.alura.ecommerce;

import br.com.alura.ecommerce.domain.EcommerceTopics;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderServlet extends HttpServlet {

    private final KafkaDispatcher<Order> orderDispatcher = new KafkaDispatcher<>();
    private final KafkaDispatcher<String> emailDispatcher = new KafkaDispatcher<>();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void destroy() {
        super.destroy();
        orderDispatcher.close();
        emailDispatcher.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
            for (int i = 0; i < 10; i++) {
                var orderID = UUID.randomUUID().toString();
                var amount = new BigDecimal(req.getParameter("amount"));
                var userEmail = req.getParameter("email");

                Order order = new Order(orderID, amount, userEmail);

                var emailbody = "Thank you for your order! We are processing your order!";
                var subject = "Your order is done.";
                var email = emailbody;

                orderDispatcher.send(EcommerceTopics.ECOMMERCE_NEW_ORDER.getValue(), userEmail, order);
                emailDispatcher.send(EcommerceTopics.ECOMMERCE_SEND_EMAIL.getValue(), userEmail, email);

                System.out.println("New Order sent successfully");
                resp.setStatus(HttpServletResponse.SC_OK);
                resp.getWriter().println("New order sent");
            }
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
