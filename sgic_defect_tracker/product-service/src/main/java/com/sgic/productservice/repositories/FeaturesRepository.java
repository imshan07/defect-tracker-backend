package com.sgic.productservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.productservice.entities.Features;


public interface FeaturesRepository extends JpaRepository<Features, Long> {

}
