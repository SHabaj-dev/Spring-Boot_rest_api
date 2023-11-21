package com.sbz.restDemo.repository;

import com.sbz.restDemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
