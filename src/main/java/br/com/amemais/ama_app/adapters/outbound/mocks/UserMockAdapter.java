package br.com.amemais.ama_app.adapters.outbound.mocks;

import br.com.amemais.ama_app.adapters.outbound.entities.UserEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserMockAdapter {

    public UserEntity mockEntity() {
        return mockEntity(0);
    }

    public List<UserEntity> mockEntityList() {
        List<UserEntity> persons = new ArrayList<UserEntity>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public UserEntity mockEntity(Integer number) {
        UserEntity user = new UserEntity();
        user.setId(number.longValue());
        user.setFirstName("First Name Test" + number);
        user.setLastName("Last Name Test" + number);
        user.setCpf("1234567890" + number);
        user.setCnpj("9876543210" + number);
        user.setBirthDate(LocalDateTime.now().minusYears(20));
        user.setEmail("test" + number + "@example.com");
        user.setTelephone("1199999999" + number);
        user.setPassword("PasswordTest" + number);
        user.setPhotoUrl("https://example.com/photo" + number);
        user.setGender(number % 2);
        user.setJoinDate(LocalDateTime.now());
        user.setVerified(number % 2 == 0);

        return user;
    }

}
