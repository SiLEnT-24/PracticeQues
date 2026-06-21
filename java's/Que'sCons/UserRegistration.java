class UserRegistration {
    String username;

    {
        System.out.println("Registration Process Started");
    }

    UserRegistration() {
        this("Guest");
    }

    UserRegistration(String username) {
        this.username = username;
        System.out.println("Username: " + username);
        System.out.println("Account Created Successfully");
    }

    public static void main(String[] args) {
        new UserRegistration("Rahul");
    }
}