import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tiho.boss.IRepository;
import tiho.boss.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    private IRepository<String> repository;
    private UserService userService;

    @BeforeEach
    void setUp() {
        repository = mock(IRepository.class);
        userService = new UserService(repository);
    }

    @Test
    void testCreateUser() {
        userService.createUser("John Doe");
        verify(repository).save("John Doe");
    }

    @Test
    void testGetUser() {
        when(repository.findById(1)).thenReturn("John Doe");

        String result = userService.getUser(1);

        assertEquals("John Doe", result);
        verify(repository).findById(1);
    }

    @Test
    void testDeleteUser() {
        userService.deleteUser(1);
        verify(repository).delete(1);
    }
}