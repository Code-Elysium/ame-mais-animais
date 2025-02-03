package br.com.amemais.ama_app.application.services;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.amemais.ama_app.adapters.outbound.entities.UserEntity;
import br.com.amemais.ama_app.adapters.outbound.mocks.UserMockAdapter;

@Service
public class UserService {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(UserService.class.getName());
    private final UserMockAdapter UserMockAdapter = new UserMockAdapter();

    // Retorna todos os usuários mockados
    public List<UserEntity> findAll() {
        logger.info("Finding all users!");
        return UserMockAdapter.mockEntityList(); // Usa o UserMockAdapter diretamente
    }

    // Retorna um usuário mockado pelo ID fornecido
    public UserEntity findById(Long id) {
        logger.info("Finding one user by ID!");

        return UserMockAdapter.mockEntity(id.intValue()); // Retorna o mock correspondente
    }

    // Simula a criação de um novo usuário
    public UserEntity create(UserEntity user) {
        logger.info("Creating one user!");
        user.setId(counter.incrementAndGet()); // Define um ID único para o usuário criado
        return user;
    }

    // Simula a atualização de um usuário
    public UserEntity update(UserEntity user) {
        logger.info("Updating one user!");
        return user; // Retorna o próprio usuário atualizado
    }

    // Simula a exclusão de um usuário pelo ID
    public void delete(Long id) {
        logger.info("Deleting one user with ID: " + id);
        // A exclusão é simulada apenas no log
    }
}
