package business.abstracts;

import java.util.List;

import entities.concretes.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(Order order);
	List<Order> getAll();
	Order getById(int id);
}
