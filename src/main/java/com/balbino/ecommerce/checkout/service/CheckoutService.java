package com.balbino.ecommerce.checkout.service;

import com.balbino.ecommerce.checkout.entity.CheckoutEntity;
import com.balbino.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
