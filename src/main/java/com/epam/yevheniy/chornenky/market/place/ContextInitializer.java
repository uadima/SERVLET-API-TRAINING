package com.epam.yevheniy.chornenky.market.place;

import com.epam.yevheniy.chornenky.market.place.repositories.InMemoryUserRepository;
import com.epam.yevheniy.chornenky.market.place.repositories.MysqlUserRepository;
import com.epam.yevheniy.chornenky.market.place.repositories.UserRepository;
import com.epam.yevheniy.chornenky.market.place.services.UserService;
import com.epam.yevheniy.chornenky.market.place.servlet.controllers.*;

import java.util.HashMap;
import java.util.Map;

public class ContextInitializer {
    private ContextInitializer() {
    }

    public static Context initializeContext() {
        return new Context();
    }

    public static class Context {
        private final AuthorizationController authorizationController;
        private final HomePageController homePageController;
        private final LoginPageController loginPageController;
        private final NotFoundPageController notFoundPageController;
        private final UserRegistrationController userRegistrationController;
        private final RegistrationPageController registrationPageController;

        private final Map<String, PageController> pageControllers;

        private Context() {
            UserRepository userRepository = new MysqlUserRepository();

            UserService userService = new UserService(userRepository);
            authorizationController = new AuthorizationController(userService);

            homePageController = new HomePageController();

            loginPageController = new LoginPageController();

            notFoundPageController = new NotFoundPageController();

            userRegistrationController = new UserRegistrationController(userService);

            registrationPageController = new RegistrationPageController();

            pageControllers = new HashMap<>();

            pageControllers.put("GET/action/login", loginPageController);
            pageControllers.put("GET/action/home-page", homePageController);
            pageControllers.put("GET/action/register", registrationPageController);
            pageControllers.put("POST/action/login", authorizationController);
            pageControllers.put("POST/action/register", userRegistrationController);
        }

        public Map<String, PageController> getPageControllers() {
            return pageControllers;
        }

        public NotFoundPageController getNotFoundPageController() {
            return notFoundPageController;
        }
    }
}

