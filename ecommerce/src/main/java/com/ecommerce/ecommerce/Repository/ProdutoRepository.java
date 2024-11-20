package com.ecommerce.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.ecommerce.Models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}