package com.example.com.exampe.controller;

import com.example.entity.Person;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/person")
@Tag(name = "USERs")

public class RestFullUserController {

    @Operation(summary = "New Person adding api", responses = { })

    @PostMapping
    public Person add(
            @RequestBody Person p
    ){

        Person person = new Person();
        person.setId(p.getId());
        person.setFullName(p.getFullName());
        return person;
    }
    @GetMapping(value = "{fullName}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String add2(
            @RequestParam( name = "fullName",defaultValue = "remzi şahbaz") String fullName
    ){

        return fullName+"aranıyor";
    }



}
