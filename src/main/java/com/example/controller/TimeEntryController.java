package com.example.controller;

import com.example.model.TimeEntry;
import com.example.repository.TimeEntryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/time-entries")
public class TimeEntryController {

    private final TimeEntryRepository repository;

    public TimeEntryController(TimeEntryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public TimeEntry createEntry(@RequestBody TimeEntry entry) {
        return repository.save(entry);
    }

    @GetMapping
    public List<TimeEntry> getAllEntries() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public TimeEntry getEntryById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable Long id) {
        repository.deleteById(id);
    }
}