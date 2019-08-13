package guru.springframework.jokes.service;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {

    String getJoke();
}
