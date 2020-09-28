package com.snail.loadbalancerclient.config;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/28 21:25
 */
public class DemoServiceInstanceListSuppler implements ServiceInstanceListSupplier {
    private final String serviceId;

    public DemoServiceInstanceListSuppler(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        //请求实例（server端，端口8090、1、2）
        return Flux.just(
                Arrays.asList(
                new DefaultServiceInstance(serviceId+"1",serviceId,"localhost",8090,false),
                new DefaultServiceInstance(serviceId+"2",serviceId,"localhost",8091,false),
                new DefaultServiceInstance(serviceId+"3",serviceId,"localhost",8092,false)

            )
        );
    }
}
