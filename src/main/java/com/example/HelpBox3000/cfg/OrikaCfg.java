package com.example.HelpBox3000.cfg;

import com.example.HelpBox3000.dto.UserDTO;
import com.example.HelpBox3000.entity.UserEntity;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class OrikaCfg extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(UserEntity.class, UserDTO.class)
                .field("id", "userId")
                .field("email", "userEmail")
                .field("password", "userPassword")
                .field("name", "userName")
                .field("surname", "userSurname")
                .field("role", "userRole")
                .register();
    }
}
