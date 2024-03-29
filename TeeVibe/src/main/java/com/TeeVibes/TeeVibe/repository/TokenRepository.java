package com.TeeVibes.TeeVibe.repository;


import com.TeeVibes.TeeVibe.model.AuthenticationToken;
import com.TeeVibes.TeeVibe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {
    AuthenticationToken findTokenByUser(User user);
    AuthenticationToken findTokenByToken(String token);
}
