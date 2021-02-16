public class UserService {
    public boolean changePassword(String username, String password) {
        try {
            if (password.length() < 8) { return false; }
            boolean hasPasswordUpdated = updateDatabase(usermane, password);
            return hasPasswordUpdated;
        } catch (Exception e) {
            return false;
        }
    }
    
}