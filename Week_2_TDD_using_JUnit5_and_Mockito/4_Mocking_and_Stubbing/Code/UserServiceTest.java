


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testMockingAndStubbing() {
        UserService mockService = Mockito.mock(UserService.class);

        // Stubbing behavior
        when(mockService.getUserName(1)).thenReturn("Monish");
        when(mockService.getUserName(2)).thenReturn("Guest");

        // Assertions
        assertEquals("Monish", mockService.getUserName(1));
        assertEquals("Guest", mockService.getUserName(2));

        // Verifying the interaction
        verify(mockService).getUserName(1);
        verify(mockService).getUserName(2);
    }
}

