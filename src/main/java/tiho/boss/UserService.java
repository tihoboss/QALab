package tiho.boss;

public class UserService {

    private IRepository<String> repository;

    public UserService(IRepository<String> repository) {
        this.repository = repository;
    }

    public void createUser(String name) {
        repository.save(name);
    }

    public String getUser(int id) {
        return repository.findById(id);
    }

    public void deleteUser(int id) {
        repository.delete(id);
    }
}