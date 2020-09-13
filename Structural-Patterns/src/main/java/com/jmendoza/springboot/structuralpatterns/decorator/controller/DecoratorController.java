package com.jmendoza.springboot.structuralpatterns.decorator.controller;

import com.jmendoza.springboot.structuralpatterns.decorator.datasource.DataSource;
import com.jmendoza.springboot.structuralpatterns.decorator.datasource.file.FileDataSource;
import com.jmendoza.springboot.structuralpatterns.decorator.decorators.DataSourceDecorator;
import com.jmendoza.springboot.structuralpatterns.decorator.decorators.compression.CompressionDecorator;
import com.jmendoza.springboot.structuralpatterns.decorator.decorators.encrypt.EncryptionDecorator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decorator")
public class DecoratorController {

    @GetMapping
    public ResponseEntity getDecorator() {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

        return ResponseEntity.noContent().build();
    }
}
