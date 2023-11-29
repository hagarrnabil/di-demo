package services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String Hello_World = "Hello World! - Original";

    @Override
    public String sayGreeting() {

        return Hello_World;
    }
}
