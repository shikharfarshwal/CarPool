package com.globalLogic.carRide.service;

import com.globalLogic.carRide.dto.DriverDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Shikhar on 16-12-2018.
 */
@FeignClient(name="driver-service")
@RibbonClient(name="driver-service")
public interface DriverServiceProxy {

    @GetMapping("/vehicles/{vehicleType}")
    List<DriverDto> getAllDrivers(@PathVariable("vehicleType") String vehicleType);

}
