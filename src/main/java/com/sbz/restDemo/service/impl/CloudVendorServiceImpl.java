package com.sbz.restDemo.service.impl;

import com.sbz.restDemo.model.CloudVendor;
import com.sbz.restDemo.repository.CloudVendorRepository;
import com.sbz.restDemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Update Success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Delete Success";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
