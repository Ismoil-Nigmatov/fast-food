package com.example.userservice.repository;

import com.example.userservice.entity.OrderHistory;
import com.example.userservice.entity.enums.OrderStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author "ISMOIL NIGMATOV"
 * @created 9:01 PM on 8/11/2022
 * @project fast-food
 */
public interface OrderHistoryRepository extends JpaRepository<OrderHistory,Long> {
   Page<OrderHistory>findAllByOrder_OrderStatus(OrderStatus order_orderStatus, Pageable pageable);
}
