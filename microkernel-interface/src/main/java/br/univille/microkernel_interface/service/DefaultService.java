package br.univille.microkernel_interface.service;

import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public interface DefaultService {
    HttpStatus doWork(HashMap<String, String> params);
        
}