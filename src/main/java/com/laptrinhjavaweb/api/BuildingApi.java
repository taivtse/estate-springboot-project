package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.dto.BuildingDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/building")
public class BuildingApi {
    @PostMapping
    public ResponseEntity<BuildingDto> createBuilding() {
        return ResponseEntity.ok(new BuildingDto());
    }

    @GetMapping
    public ResponseEntity<BuildingDto> findAll() {
        return ResponseEntity.ok(new BuildingDto());
    }
}
