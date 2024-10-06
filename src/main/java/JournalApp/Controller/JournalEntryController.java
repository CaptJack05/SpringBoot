/*
package JournalApp.Controller;

import JournalApp.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("journal")
public class JournalEntryController {
    private final Map<String, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry Entry){
        journalEntries.put(Entry.getId(),Entry);
        return true;

    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }
    @PostMapping("id/{myId}")
    public boolean addEntryById(@RequestBody JournalEntry Entry,@PathVariable String myId){
        journalEntries.put(myId,Entry);
        return true;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntry(@PathVariable Long myId){
        return journalEntries.remove(myId);

    }
}
               */