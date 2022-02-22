package com.example.HelpBox3000.service;

import com.example.HelpBox3000.cfg.OrikaCfg;
import com.example.HelpBox3000.dto.UserDTO;
import com.example.HelpBox3000.entity.UserEntity;
import com.example.HelpBox3000.exception.UniqueKeyException;
import com.example.HelpBox3000.repository.UserRepository;
import lombok.extern.java.Log;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.logging.Level;

/*
TODO
    Регистрация полььзователей(все проверки на фронте - валидация значений и матчи мейлов в бд)
    Получение списка пользователей
    Обновление данных пользователя
    Удаление аккаунта
*/

@Log
@Service
public class UserService {

    private final UserRepository userRepository;
    private final MapperFacade facade = new OrikaCfg();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /*
        Метод регистрации пользователей(внесение в бд) без проверке на стороне бэка
    */
    public UserEntity userRegistration(UserEntity userEntity) {
        log.log(Level.INFO, userEntity.toString());

        if (this.userRepository.findByEmail(userEntity.getEmail()) != null) {
            throw new UniqueKeyException("Пользователь с данным email уже зарегестрирован!");
        }

        return this.userRepository.save(userEntity);
    }

    public UserEntity userAuthorization(String id) {
        return new UserEntity();
    }
}
