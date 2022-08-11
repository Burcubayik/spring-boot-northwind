package com.etiya.northwind.dataAccess;

import com.etiya.northwind.entities.concretes.Employee;
import com.etiya.northwind.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
