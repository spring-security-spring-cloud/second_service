package com.test.service2.repository;

import com.test.service2.model.ServiceInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ServiceInputRepository extends JpaRepository<ServiceInput, Integer>, JpaSpecificationExecutor<ServiceInput> {
    List<ServiceInput> findAllByServiceName(String serviceName);
}
