package com.person.authservice.config;

import com.person.authservice.model.ERole;
import com.person.authservice.model.Role;
import com.person.authservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        // 初始化角色
        initRoles();
    }

    private void initRoles() {
        // 檢查並創建所有必需的角色
        for (ERole role : ERole.values()) {
            if (!roleRepository.findByName(role).isPresent()) {
                Role newRole = new Role();
                newRole.setName(role);
                roleRepository.save(newRole);
            }
        }
    }
}
