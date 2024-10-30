package com.example.mapdiary.controller;

import com.example.mapdiary.entity.Map;
import com.example.mapdiary.repository.MapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MapController {

    private final MapRepository mapRepository;

    @PostMapping("/api/locations")
    public Map saveLocation(@RequestBody Map map) {
        return mapRepository.save(map);
    }

    @GetMapping("/api/locations")
    public List<Map> getLocations() {
        return mapRepository.findAll();
    }
}
