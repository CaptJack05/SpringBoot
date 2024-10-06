package JournalApp.repo;

import JournalApp.Entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface journalEntryRepo extends MongoRepository<JournalEntry, String> {
}
