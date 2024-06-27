package com.tharuka.ecommerce.kafka;

import com.tharuka.ecommerce.customer.CustomerResponse;
import com.tharuka.ecommerce.order.PaymentMethod;
import com.tharuka.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
