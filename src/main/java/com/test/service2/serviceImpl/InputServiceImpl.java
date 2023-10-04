package com.test.service2.serviceImpl;

import com.test.service2.exception.APIException;
import com.test.service2.model.ServiceInput;
import com.test.service2.repository.ServiceInputRepository;
import com.test.service2.service.InputService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InputServiceImpl implements InputService {
    @Autowired
    private final ServiceInputRepository serviceInputRepository;

    @Override
    public List<ServiceInput> getServiceData(String serviceName) {
        return serviceInputRepository.findAllByServiceName(serviceName);
    }

    @Override
    public ServiceInput createInput(ServiceInput input) {
        try {
            return serviceInputRepository.save(input);
        } catch (Exception e) {
            throw new APIException("Data not saved!");
        }

    }
}
