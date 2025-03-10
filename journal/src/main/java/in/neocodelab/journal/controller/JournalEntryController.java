package in.neocodelab.journal.controller;

import in.neocodelab.journal.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private HashMap<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping //localhost:8080/journal
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping //localhost:8080/journal
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

}
