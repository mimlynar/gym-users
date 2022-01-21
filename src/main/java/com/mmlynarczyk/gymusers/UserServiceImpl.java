package com.mmlynarczyk.gymusers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;

    @Override
    public UserDetails getUserDetails(long id) {
        String gymCode = userRepo.findById(id).map(User::getGymCode).orElse("");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange(URI.create("http://localhost:8801/gym/"+gymCode ), HttpMethod.GET, HttpEntity.EMPTY, Gym.class );
        return null;
    }
}
