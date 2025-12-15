// Adaptador (Implementação do repositório em memória)
package adapters;
import domain.User;
import java.util.*;
import ports.UserRepository;


public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> database = new HashMap<>();


    public void save(User user) { 
        database.put(user.getId(), user);
    }

    public User findById(String id) { 
        return database.get(id);
    }

    public List<User> findAll() { 
        return new ArrayList<>(database.values());
    }
}
