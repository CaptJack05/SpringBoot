package JournalApp.service;

import JournalApp.Entity.JournalEntry;
import JournalApp.repo.journalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalEntryService {
    @Autowired
    public journalEntryRepo JournalEntryRepo;

    public void saveEntry(JournalEntry journalEntry){
        JournalEntryRepo.save(journalEntry);

    }
    public List<JournalEntry> getAll(){
        return  JournalEntryRepo.findAll();

    }
}
// controller --> service --> repository