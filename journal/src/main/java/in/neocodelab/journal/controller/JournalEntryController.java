package in.neocodelab.journal.controller;

import in.neocodelab.journal.entity.JournalEntry;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class JournalEntryController {

    private HashMap<Long, JournalEntry> journalEntries = new HashMap<>();

    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

}
