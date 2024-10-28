package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Set the current logged-in user by their username.
     *
     * @param name The username of the user to set as the currently logged-in user.
     */
    void setCurrentUser(String name);

    /**
     * Retrieve the current logged-in user's username.
     *
     * @return The username of the current logged-in user, or null if no user is logged in.
     */
    String getCurrentUser();
}
