package com.example.test.service;



import com.example.test.repository.ExamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExameService {

    @Autowired
    ExamesRepository examesRepository;


}
