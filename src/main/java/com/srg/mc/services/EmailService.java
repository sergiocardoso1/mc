package com.srg.mc.services;

import org.springframework.mail.SimpleMailMessage;

import com.srg.mc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
