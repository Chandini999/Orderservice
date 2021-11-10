package com.infosys.infytel.customer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infosys.infytel.customer.entity.ProductOrder;
import com.infosys.infytel.customer.repository.ProductOrderRepository;
import com.infosys.infytel.order.dto.CartDTO;
@Service
@Transactional
public class ProductOrderedService {
	
	@Autowired
	ProductOrderRepository prorepo;
	
	

	public ProductOrder addproduct(Integer buyerid, Integer prodid, Integer sellerid, Integer quantity) {
		ProductOrder pro=new ProductOrder();
		pro.setBuyerid(buyerid);
		pro.setProdid(prodid);
		pro.setQuantity(quantity);
		pro.setSellerid(sellerid);
		prorepo.save(pro);
		return null;
	}

	


}
