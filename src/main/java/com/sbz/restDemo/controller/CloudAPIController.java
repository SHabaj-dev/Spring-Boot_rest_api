package com.sbz.restDemo.controller;

import com.sbz.restDemo.model.CloudVendor;
import com.sbz.restDemo.service.CloudVendorService;
import com.sbz.restDemo.service.impl.CloudVendorServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloud_vendor")
public class CloudAPIController {

    CloudVendorService cloudVendorService;

    public CloudAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendor_id}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendor_id") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping("{vendor_id}")
    public String deleteCloudVendorDetails(@PathVariable("vendor_id") String vendorId) {
        return cloudVendorService.deleteCloudVendor(vendorId);
    }

}
